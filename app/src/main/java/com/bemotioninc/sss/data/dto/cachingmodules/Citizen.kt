package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class Citizen(
    @SerializedName("primaryColor")
    var primaryColor: String,

    @SerializedName("textColor")
    var textColor: String,

    @SerializedName("textSelectedColor")
    var textSelectedColor: String,

    @SerializedName("logEntryImage")
    var logEntryImage: String,

    @SerializedName("logEntryName")
    var logEntryName: String,

    @SerializedName("logHistoryImage")
    var logHistoryImage: String,

    @SerializedName("logHistoryName")
    var logHistoryName: String,

    @SerializedName("accountImage")
    var accountImage: String,

    @SerializedName("accountName")
    var accountName: String,

    @SerializedName("chatImage")
    var chatImage: String,

    @SerializedName("settingImage")
    var settingImage: String,

    @SerializedName("temperatureImage")
    var temperatureImage: String,

    @SerializedName("distanceImage")
    var distanceImage: String,

    @SerializedName("backgroundColor")
    var backgroundColor: String,

    @SerializedName("panicIconColor")
    var panicIconColor: String,

    @SerializedName("panicImage")
    var panicImage: String,

    @SerializedName("showPanic")
    var showPanic: Boolean = false,

    @SerializedName("priority")
    var priority: Float,

    @SerializedName("borderWidth")
    var borderWidth: Float,

    @SerializedName("borderColor")
    var borderColor: String,

    @SerializedName("sections")
    var sections: List<Section> = ArrayList(),

    @SerializedName("alertMainImage")
    var alertMainImage: String,

    @SerializedName("cameraAlertMainImage")
    var cameraAlertMainImage: String,

    @SerializedName("relativesMainImage")
    var relativesMainImage: String
)
