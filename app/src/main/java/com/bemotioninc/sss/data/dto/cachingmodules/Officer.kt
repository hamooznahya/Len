package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class Officer(
    @SerializedName("radius")
    var radius :Float ,

    @SerializedName("checkinBorderRadius")
    var checkinBorderRadius :Float ,

    @SerializedName("checkoutBorderRadius")
    var checkoutBorderRadius :Float ,

    @SerializedName("radiusUnit")
    var radiusUnit: String ,

    @SerializedName("primaryColor")
    var primaryColor: String ,

    @SerializedName("textColor")
    var textColor: String ,

    @SerializedName("textSelectedColor")
    var textSelectedColor: String ,

    @SerializedName("checkinImage")
    var checkinImage: String ,

    @SerializedName("logEntryImage")
    var logEntryImage: String ,

    @SerializedName("logEntryName")
    var logEntryName: String ,

    @SerializedName("logHistoryImage")
    var logHistoryImage: String ,

    @SerializedName("logHistoryName")
    var logHistoryName: String ,

    @SerializedName("checkinName")
    var checkinName: String ,

    @SerializedName("checkoutImage")
    var checkoutImage: String ,

    @SerializedName("checkoutName")
    var checkoutName: String ,

    @SerializedName("chatImage")
    var chatImage: String ,

    @SerializedName("mapImage")
    var mapImage: String ,

    @SerializedName("settingImage")
    var settingImage: String ,

    @SerializedName("checkinIcon")
    var checkinIcon: String ,

    @SerializedName("checkoutIcon")
    var checkoutIcon: String ,

    @SerializedName("checkingImage")
    var checkingImage: String ,

    @SerializedName("checkingName")
    var checkingName: String ,

    @SerializedName("accountImage")
    var accountImage: String ,

    @SerializedName("accountName")
    var accountName: String ,

    @SerializedName("driveToImage")
    var driveToImage: String ,

    @SerializedName("callImage")
    var callImage: String ,

    @SerializedName("endViolationImage")
    var endViolationImage: String ,

    @SerializedName("violationListImage")
    var violationListImage: String ,

    @SerializedName("temperatureImage")
    var temperatureImage: String ,

    @SerializedName("distanceImage")
    var distanceImage: String ,

    @SerializedName("showPanic")
    var showPanic :Boolean= false,

    @SerializedName("panicIconColor")
    var panicIconColor: String ,

    @SerializedName("panicImage")
    var panicImage: String ,

    @SerializedName("violationMainImage")
    var violationMainImage: String ,

    @SerializedName("alertMainImage")
    var alertMainImage: String ,

    @SerializedName("cameraAlertMainImage")
    var cameraAlertMainImage: String ,

    @SerializedName("citizenEmergencyMainImage")
    var citizenEmergencyMainImage: String ,

    @SerializedName("officerEmergencyMainImage")
    var officerEmergencyMainImage: String ,

    @SerializedName("relativesMainImage")
    var relativesMainImage: String ,

    /*Dynamic*/
    @SerializedName("backgroundColor")
    var backgroundColor: String ,

    @SerializedName("checkinTop")
    var checkinTop :Float ,

    @SerializedName("checkinLeft")
    var checkinLeft :Float ,

    @SerializedName("checkinWidth")
    var checkinWidth :Float ,

    @SerializedName("checkinHeight")
    var checkinHeight :Float ,

    @SerializedName("checkinTextTop")
    var checkinTextTop :Float ,

    @SerializedName("checkinTextLeft")
    var checkinTextLeft:Float  ,

    @SerializedName("checkinTextSize")
    var checkinTextSize :Float,

    @SerializedName("checkinTextColor")
    var checkinTextColor: String ,

    @SerializedName("checkinTextWeight")
    var checkinTextWeight: String ,

    @SerializedName("checkoutTop")
    var checkoutTop :Float ,

    @SerializedName("checkoutLeft")
    var checkoutLeft :Float ,

    @SerializedName("checkoutWidth")
    var checkoutWidth :Float ,

    @SerializedName("checkoutHeight")
    var checkoutHeight :Float ,

    @SerializedName("checkoutTextTop")
    var checkoutTextTop :Float ,

    @SerializedName("checkoutTextLeft")
    var checkoutTextLeft :Float ,

    @SerializedName("checkoutTextSize")
    var checkoutTextSize :Float ,

    @SerializedName("checkoutTextColor")
    var checkoutTextColor: String ,

    @SerializedName("checkoutTextWeight")
    var checkoutTextWeight: String ,

    @SerializedName("checkinPriority")
    var checkinPriority: Float ,

    @SerializedName("checkinBorderWidth")
    var checkinBorderWidth: Float ,

    @SerializedName("checkinBorderColor")
    var checkinBorderColor: String ,

    @SerializedName("checkoutPriority")
    var checkoutPriority: Float ,

    @SerializedName("checkoutBorderWidth")
    var checkoutBorderWidth: Float ,

    @SerializedName("checkoutBorderColor")
    var checkoutBorderColor: String
)
