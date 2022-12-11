package com.bemotioninc.sss.di

import android.content.Context
import android.util.Log
import com.bemotioninc.sss.constants.Constants
import com.bemotioninc.sss.data.ApiEndPoint
import com.bemotioninc.sss.data.datasource.OfflineDataSource
import com.bemotioninc.sss.data.datasource.RemoteDataSource
import com.bemotioninc.sss.data.network.CommonHeadersInterceptor
import com.bemotioninc.sss.data.network.ResponseHandlerInterceptor
import com.bemotioninc.sss.domin.datasource.OfflineDataSourceImpl
import com.bemotioninc.sss.domin.datasource.RemoteDataSourceImpl
import com.bemotioninc.sss.utils.appPreferencesStore
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.moczul.ok2curl.CurlInterceptor
import com.moczul.ok2curl.logger.Logger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    val TIMEOUT_SECONDS = 30 * 1000L


    @Provides
    @Singleton
    fun getRetrofit(): ApiEndPoint {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val builder = OkHttpClient.Builder()
            .writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
            .addInterceptor(CommonHeadersInterceptor())
            .addNetworkInterceptor(interceptor)
            .addInterceptor(ResponseHandlerInterceptor())
            .addInterceptor(interceptor)
            .addInterceptor(CurlInterceptor(object : Logger {
                override fun log(message: String) {
                    Log.v("Curl", message)
                }
            }))
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(provideGson()))
            .baseUrl(Constants.BASE_URL)
            .client(builder.build())
            .build()
        return retrofit.create(ApiEndPoint::class.java)
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        gsonBuilder.setLenient()
        return gsonBuilder.create()
    }

    @Provides //حقن
    fun RemoteDataSource(apiEndpoints: ApiEndPoint) : RemoteDataSource = RemoteDataSourceImpl(apiEndpoints)

    @Provides //حقن
    fun OfflineDataSource(@ApplicationContext context: Context) : OfflineDataSource = OfflineDataSourceImpl(context.appPreferencesStore)

}