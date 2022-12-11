package com.bemotioninc.sss.data.dto

import com.google.gson.annotations.SerializedName

class BaseResponse <T> {
    @SerializedName("status")
    var status: Boolean   = false
    @SerializedName("statusCode")
    var statusCode: String? = ""
    @SerializedName("data")
    var data: T? = null
}