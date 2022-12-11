package com.bemotioninc.sss.data.network

import com.bemotioninc.sss.constants.Constants
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class CommonHeadersInterceptor () : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original: Request = chain.request()

        val builder = original.newBuilder()
            .header("x-access-key", Constants.Apis.AccessKey)
/*          .header("Device-Type", "Android")*/

        val request = builder.build()
        return chain.proceed(request)
    }
}