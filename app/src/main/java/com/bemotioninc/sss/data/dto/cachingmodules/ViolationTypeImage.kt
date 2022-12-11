package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class ViolationTypeImage(
    @SerializedName("imageId")  
    var imageId: Long = 0,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("fileName")
    var fileName: String? = null,

    @SerializedName("url")
    var url: String? = null,

    @SerializedName("typeTitle")
    var typeTitle: String? = null,

    @SerializedName("typeDescription")
    var typeDescription: String? = null,

    @SerializedName("typeCoverImage")
    var typeCoverImage: String? = null,

    @SerializedName("isRelatedToOfficer")
    var isRelatedToOfficer: Boolean = false
)
