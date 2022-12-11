package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class AppConfigResponse(
    @SerializedName("appName")
    var appName: String,

    @SerializedName("aboutUsUrl")
    var aboutUsUrl: String,

    @SerializedName("privacyPolicyUrl")
    var privacyPolicyUrl: String,

    @SerializedName("contactEmail")
    var contactEmail: String,

    @SerializedName("contactPhone")
    var contactPhone: String,

    @SerializedName("termsConditionUrl")
    var termsConditionUrl: String
)