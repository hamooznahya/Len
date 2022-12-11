package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class SectionGallery(

    @SerializedName("url")
    var url: String? = null,

    @SerializedName("isUploadS3")
    var isUploadS3: Boolean = false,

    @SerializedName("isVideo")
    var isVideo: Boolean = false,

    @SerializedName("fileName")
    var fileName: String? = null,

    @SerializedName("showVideo")
    var showVideo: Boolean = false,

    @SerializedName("description")
    var description: String? = null
)
