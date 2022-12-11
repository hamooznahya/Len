package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class CachingResponse(

    @SerializedName("version")
    var versionObject: VersionObject,

    @SerializedName("officer")
     val officer: OfficerResponse,

    @SerializedName("citizen")
     val citizen: Citizen,


    @SerializedName("setting")
    var settingsAndTranslations: SettingsAndTranslations,


    @SerializedName("appConfig")
    var appConfig: AppConfigResponse,

//    @SerializedName("predefinedMessage")
//    var predefinedMessagesList: List<PredefinedMessage> = ArrayList(),

    /**
     * GENERAL
     */
    @SerializedName("radius")
    var radius: Int,

    @SerializedName("radiusUnit")
    var radiusUnit: String,

    @SerializedName("primaryColor")
    var primaryColor: String,

    @SerializedName("secondaryColor")
    var secondaryColor: String,

    @SerializedName("isCelsius")
    var isCelsius: Boolean = false,

    @SerializedName("textColor")
    var textColor: String,
    @SerializedName("textSelectedColor")

    var textSelectedColor: String,
    @SerializedName("checkinImage")

    var checkinImage: String,
    @SerializedName("backgroundColor")

    var backgroundColor: String,
    @SerializedName("showPanic")

    var showPanic: Boolean = false,
    @SerializedName("checkinName")

    var checkinName: String,
    @SerializedName("checkoutImage")

    var checkoutImage: String,
    @SerializedName("checkoutName")

    var checkoutName: String,

    @SerializedName("biodiversityImage")
    var biodiversityImage: String,

    @SerializedName("biodiversityName")
    var biodiversityName: String,

    @SerializedName("violationImage")
    var violationImage: String,

    @SerializedName("violationName")
    var violationName: String,

    @SerializedName("checkingImage")
    var checkingImage: String,

    @SerializedName("checkingName")
    var checkingName: String,

    @SerializedName("logEntryImage")
    var logEntryImage: String,

    @SerializedName("logEntryName")
    var logEntryName: String? = "_logEntryName",

    @SerializedName("logHistoryImage")
    var logHistoryImage: String,

    @SerializedName("logHistoryName")
    var logHistoryName: String? = "_logHistoryName",

    @SerializedName("accountImage")

    var accountImage: String,

    @SerializedName("accountName")
    var accountName: String? = "_accountName",

    @SerializedName("checkinIcon")
    var checkinIcon: String,

    @SerializedName("checkoutIcon")
    var checkoutIcon: String,

    @SerializedName("chatImage")
    var chatImage: String,

    @SerializedName("mapImage")
    var mapImage: String,

    @SerializedName("settingImage")
    var settingImage: String,

    @SerializedName("callImage")
    var callImage: String,

    @SerializedName("driveToImage ")
    var driveToImage: String,

    @SerializedName("endViolationImage")
    var endViolationImage: String,

    @SerializedName("violationListImage")
    var violationListImage: String,

    @SerializedName("panicIconColor")
    var panicIconColor: String,

    @SerializedName("panicImage")
    var panicImage: String,

    @SerializedName("emergencyOnMapImage")
    var emergencyOnMapImage: String,

    @SerializedName("officerEmergencyOnMapImage")
    var officerEmergencyOnMapImage: String,

    @SerializedName("violationOnMapImage")
    var violationOnMapImage: String,

    @SerializedName("violationMainImage")
    var violationMainImage: String,

    @SerializedName("alertMainImage")
    var alertMainImage: String,

    @SerializedName("cameraAlertMainImage")
    var cameraAlertMainImage: String,

    @SerializedName("citizenEmergencyMainImage")
    var citizenEmergencyMainImage: String,

    @SerializedName("officerEmergencyMainImage")
    var officerEmergencyMainImage: String,

    @SerializedName("relativesMainImage")
    var relativesMainImage: String,

    @SerializedName("checkinBorderRadius")
    var checkinBorderRadius: Double,

    @SerializedName("checkoutBorderRadius")
    var checkoutBorderRadius: Double,

    @SerializedName("sections")
    var sections: MutableList<Section> = ArrayList(),
)

