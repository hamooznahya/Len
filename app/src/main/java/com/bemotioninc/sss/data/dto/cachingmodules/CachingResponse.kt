package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class CachingResponse(

    @SerializedName("version")
    var versionObject: VersionObject,

    @SerializedName("officer")
    private val officer: Officer,

    @SerializedName("citizen")
    private val citizen: Citizen,

/*
    @SerializedName("setting")
    var settingsAndTranslations: SettingsAndTranslations,
*/

    @SerializedName("appConfig")
    var appConfig: AppConfig,

    @SerializedName("predefinedMessage")
    var predefinedMessagesList: List<PredefinedMessage> = ArrayList(),

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


/*fun setDataAsCitizen(
    context: Context?,
    newCachingObjectData: CachingObjectData
) {
    if (newCachingObjectData.citizen != null) {
        primaryColor = newCachingObjectData.citizen.primaryColor
        textColor = newCachingObjectData.citizen.textColor
        textSelectedColor = newCachingObjectData.citizen.textSelectedColor
        logEntryImage = newCachingObjectData.citizen.logEntryImage
        logEntryName = newCachingObjectData.citizen.logEntryName
        logHistoryImage = newCachingObjectData.citizen.logHistoryImage
        logHistoryName = newCachingObjectData.citizen.logHistoryName
        accountImage = newCachingObjectData.citizen.accountImage
        accountName = newCachingObjectData.citizen.accountName
        chatImage = newCachingObjectData.citizen.chatImage
        settingImage = newCachingObjectData.citizen.settingImage
        backgroundColor = newCachingObjectData.citizen.backgroundColor
        panicIconColor = newCachingObjectData.citizen.panicIconColor
        panicImage = newCachingObjectData.citizen.panicImage
        showPanic = newCachingObjectData.citizen.showPanic
        alertMainImage = newCachingObjectData.citizen.alertMainImage
        cameraAlertMainImage = newCachingObjectData.citizen.cameraAlertMainImage
        relativesMainImage = newCachingObjectData.citizen.relativesMainImage
        sections.clear()
        sections.addAll(newCachingObjectData.citizen.sections)
    }
    saveCachingData(
        context,
        Companion.cachingObjectData
    )
}*/

/*fun setDataAsOfficer(
    context: Context?,
    newCachingObjectData: CachingObjectData
) {
    if (newCachingObjectData.officer != null) {
        val sharedPreferences: SharedPreferences
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        sharedPreferences.edit()
            .putFloat(Constants.RadiusArea, newCachingObjectData.officer.radius.toFloat())
            .apply()
        sharedPreferences.edit()
            .putString(Constants.RadiusUnit, newCachingObjectData.officer.radiusUnit).apply()
        radius = newCachingObjectData.officer.radius
        radiusUnit = newCachingObjectData.officer.radiusUnit
        checkinBorderRadius = newCachingObjectData.officer.checkinBorderRadius.toDouble()
        checkoutBorderRadius = newCachingObjectData.officer.checkoutBorderRadius.toDouble()
        checkinImage = newCachingObjectData.officer.checkinImage
        checkinName = newCachingObjectData.officer.checkinName
        checkoutImage = newCachingObjectData.officer.checkoutImage
        checkoutName = newCachingObjectData.officer.checkoutName
        checkingImage = newCachingObjectData.officer.checkingImage
        checkingName = newCachingObjectData.officer.checkingName
        checkinIcon = newCachingObjectData.officer.checkinIcon
        checkoutIcon = newCachingObjectData.officer.checkoutIcon
        mapImage = newCachingObjectData.officer.mapImage
        callImage = newCachingObjectData.officer.callImage
        driveToImage = newCachingObjectData.officer.driveToImage
        endViolationImage = newCachingObjectData.officer.endViolationImage
        violationListImage = newCachingObjectData.officer.violationListImage
        logEntryImage = newCachingObjectData.officer.logEntryImage
        logEntryName = newCachingObjectData.officer.logEntryName
        logHistoryImage = newCachingObjectData.officer.logHistoryImage
        logHistoryName = newCachingObjectData.officer.logHistoryName
        primaryColor = newCachingObjectData.officer.primaryColor
        textColor = newCachingObjectData.officer.textColor
        textSelectedColor = newCachingObjectData.officer.textSelectedColor
        logEntryImage = newCachingObjectData.officer.logEntryImage
        logHistoryImage = newCachingObjectData.officer.logHistoryImage
        accountImage = newCachingObjectData.officer.accountImage
        accountName = newCachingObjectData.officer.accountName
        chatImage = newCachingObjectData.officer.chatImage
        settingImage = newCachingObjectData.officer.settingImage
        backgroundColor = newCachingObjectData.officer.backgroundColor
        panicIconColor = newCachingObjectData.officer.panicIconColor
        panicImage = newCachingObjectData.officer.panicImage
        showPanic = newCachingObjectData.officer.showPanic
        violationMainImage = newCachingObjectData.officer.violationMainImage
        alertMainImage = newCachingObjectData.officer.alertMainImage
        cameraAlertMainImage = newCachingObjectData.officer.cameraAlertMainImage
        relativesMainImage = newCachingObjectData.officer.relativesMainImage
        citizenEmergencyMainImage = newCachingObjectData.officer.citizenEmergencyMainImage
        officerEmergencyMainImage = newCachingObjectData.officer.officerEmergencyMainImage


        *//*Add Dynamic Sections*//*sections.clear()
        val checkInSection: Section =
            Section()
        checkInSection.sectionName = newCachingObjectData.officer.checkinName
        checkInSection.sectionIcon = newCachingObjectData.officer.checkinIcon
        checkInSection.imageUrl = newCachingObjectData.officer.checkinImage
        checkInSection.top = newCachingObjectData.officer.checkinTop
        checkInSection.left = newCachingObjectData.officer.checkinLeft
        checkInSection.textTop = newCachingObjectData.officer.checkinTextTop
        checkInSection.textLeft = newCachingObjectData.officer.checkinTextLeft
        checkInSection.width = newCachingObjectData.officer.checkinWidth
        checkInSection.height = newCachingObjectData.officer.checkinHeight
        checkInSection.fontSize = newCachingObjectData.officer.checkinTextSize.toFloat()
        checkInSection.textColor = newCachingObjectData.officer.checkinTextColor
        checkInSection.fontWeight = newCachingObjectData.officer.checkinTextWeight
        checkInSection.borderRadius = newCachingObjectData.officer.checkinBorderRadius
        checkInSection.priority = newCachingObjectData.officer.checkinPriority
        checkInSection.borderColor = newCachingObjectData.officer.checkinBorderColor
        checkInSection.borderWidth = newCachingObjectData.officer.checkinBorderWidth
        sections.add(checkInSection)
        val checkOutSection: Section =
            Section()
        checkOutSection.sectionName = newCachingObjectData.officer.checkoutName
        checkOutSection.sectionIcon = newCachingObjectData.officer.checkoutIcon
        checkOutSection.imageUrl = newCachingObjectData.officer.checkoutImage
        checkOutSection.top = newCachingObjectData.officer.checkoutTop
        checkOutSection.left = newCachingObjectData.officer.checkoutLeft
        checkOutSection.textTop = newCachingObjectData.officer.checkoutTextTop
        checkOutSection.textLeft = newCachingObjectData.officer.checkoutTextLeft
        checkOutSection.width = newCachingObjectData.officer.checkoutWidth
        checkOutSection.height = newCachingObjectData.officer.checkoutHeight
        checkOutSection.fontSize = newCachingObjectData.officer.checkoutTextSize.toFloat()
        checkOutSection.textColor = newCachingObjectData.officer.checkoutTextColor
        checkOutSection.fontWeight = newCachingObjectData.officer.checkoutTextWeight
        checkOutSection.borderRadius = newCachingObjectData.officer.checkoutBorderRadius
        checkOutSection.priority = newCachingObjectData.officer.checkoutPriority
        checkOutSection.borderColor = newCachingObjectData.officer.checkoutBorderColor
        checkOutSection.borderWidth = newCachingObjectData.officer.checkoutBorderWidth
        sections.add(checkOutSection)
    }
    saveCachingData(
        context,
        Companion.cachingObjectData
    )
}
*/
