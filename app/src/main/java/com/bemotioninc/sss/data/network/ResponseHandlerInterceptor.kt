package com.bemotioninc.sss.data.network


import android.annotation.SuppressLint
import com.bemotioninc.sss.data.dto.BaseResponse
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

//TODO ????
internal class ResponseHandlerInterceptor : Interceptor {
    private fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        gsonBuilder.setLenient()
        return gsonBuilder.create()
    }
    @SuppressLint("SuspiciousIndentation")
    override fun intercept(chain: Interceptor.Chain): Response {
        val request: Request = chain.request()
        val response = chain.proceed(request)
        val responseBodyCopy = response.peekBody(Long.MAX_VALUE)
        val jsonRaw = responseBodyCopy.string()
        val baseResponse = provideGson().fromJson(jsonRaw, BaseResponse::class.java)
            if (response.isSuccessful &&jsonRaw.isNotBlank() &&!baseResponse.status) {
            throw ServerException(baseResponse.statusCode!!)
        }
        return response
    }

}