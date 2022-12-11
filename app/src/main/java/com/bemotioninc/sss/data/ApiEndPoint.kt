package com.bemotioninc.sss.data

import com.bemotioninc.sss.data.dto.BaseResponse
import com.bemotioninc.sss.data.dto.UserInfoResponse
import com.bemotioninc.sss.data.dto.cachingmodules.CachingResponse
import com.bemotioninc.sss.data.dto.cachingmodules.LanguagesResponse
import retrofit2.http.*

interface ApiEndPoint {

    @GET("appAccount/mobileLanguage/search")
    suspend  fun getLanguages(
    ): BaseResponse<List<LanguagesResponse>>

    @GET("appAccount/mobileDynamic")
    suspend fun getCaching(
    ): BaseResponse<CachingResponse>

    @FormUrlEncoded
    @POST("appAccount/login")
    suspend fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String
    ): BaseResponse<UserInfoResponse>

}