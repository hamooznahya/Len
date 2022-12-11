package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class LanguagesResponse(

    @SerializedName("id")
    var id: Long,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("isDefault")
    var isDefault: Boolean,
    @SerializedName("isActive")
    var isActive: Boolean,
    @SerializedName("isRtl")
    var isRtl: Boolean,

    var isSelected: Boolean? = false
)
