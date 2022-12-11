package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("id")
    var id: Long,

    @SerializedName("left")
    var left: Float,

    @SerializedName("top")
    var top: Float,

    @SerializedName("width")
    var width: Float,

    @SerializedName("height")
    var height: Float,

    @SerializedName("textTop")
    var textTop: Float,

    @SerializedName("muteTop")
    var muteTop: Float,

    @SerializedName("muteLeft")
    var muteLeft: Float,

    @SerializedName("textLeft")
    var textLeft: Float,

    @SerializedName("textOverlay")
    var textOverlay: Boolean = false,

    @SerializedName("textOverlayWidth")
    var textOverlayWidth: Float,

    @SerializedName("textOverlayHeight")
    var textOverlayHeight: Float,

    @SerializedName("textColor")
    var textColor: String,

    @SerializedName("fontWeight")
    var fontWeight: String,

    @SerializedName("date")
    var date: String,

    @SerializedName("checkingLocation")
    var checkingLocation: String,

    @SerializedName("fontSize")
    var fontSize: Float,

    @SerializedName("textOverlayColor")
    var textOverlayColor: String,

    @SerializedName("textOverlayRadius")
    var textOverlayRadius: Float,

    @SerializedName("textOverlayLevel")
    var textOverlayLevel: Float,

    @SerializedName("sectionName")
    var sectionName: String,

    @SerializedName("sectionDescription")
    var sectionDescription: String,

    @SerializedName("file")
    var file: Any,

    @SerializedName("imageUrl")
    var imageUrl: String,

    @SerializedName("sectionIcon")
    var sectionIcon: String,

    @SerializedName("isAdvertisement")
    var isAdvertisement: Boolean = false,

    @SerializedName("isMultiGallery")
    var isMultiGallery: Boolean = false,

    @SerializedName("isVideo")
    var isVideo: Boolean = false,

    @SerializedName("isRelatedToOfficer")
    var isRelatedToOfficer: Boolean = false,

    @SerializedName("borderRadius")
    var borderRadius: Float,

    @SerializedName("violationTypeImages")
    var violationTypeImages: List<ViolationTypeImage> = ArrayList<ViolationTypeImage>(),

    @SerializedName("sectionGallery")
    var sectionGallery: List<SectionGallery> = ArrayList<SectionGallery>(),

    @SerializedName("enableSound")
    var enableSound: Boolean = false,

    @SerializedName("priority")
    var priority: Float,

    @SerializedName("borderWidth")
    var borderWidth: Float,

    @SerializedName("borderColor")
    var borderColor: String
)
