package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class VersionObject(    @SerializedName("id")
                             var id: Long  ,

                             @SerializedName("platformId")
                             var platformId: Long  ,

                             @SerializedName("version")
                             var version: String,

                             @SerializedName("forceUpdate")
                             var forceUpdate: Boolean = false,

                             @SerializedName("isActive")
                             var isActive: Boolean = false)
