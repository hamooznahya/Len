//package com.bemotioninc.sss.domin.mappers
//
//import com.bemotioninc.sss.data.dto.cachingmodules.*
//
//object CacheMappers {
//
//    fun map(it: CachingResponse): Caching {
//        return Caching(
//          //  versionObject = it.versionObject,
//            officer = mapOfficer(it.officer),
//         //   citizen = it.citizen,
//          // settingsAndTranslations = SettingsAndTranslations,
//            appConfig = mapAppConfig(it.appConfig),
//           // predefinedMessagesList = List<PredefinedMessage> = ArrayList(),
//            radius = it.radius,
//            radiusUnit = it.radiusUnit,
//
//            primaryColor = it.primaryColor,
//
//            secondaryColor = it.secondaryColor,
//
//            isCelsius = it.isCelsius,
//
//            textColor = it.textColor,
//
//            textSelectedColor = it.textSelectedColor,
//
//            checkinImage = it.checkinImage,
//
//            backgroundColor = it.backgroundColor,
//
//            showPanic = it.showPanic,
//
//            checkinName = it.checkinName,
//
//            checkoutImage = it.checkoutImage,
//
//            checkoutName = it.checkoutName,
//
//            biodiversityImage = it.biodiversityImage,
//
//            biodiversityName = it.biodiversityName,
//
//            violationImage = it.endViolationImage,
//
//            violationName = it.violationName,
//
//            checkingImage = it.checkingImage,
//
//            checkingName = it.checkingName,
//
//            logEntryImage = it.logEntryImage,
//
//            logEntryName = it.logEntryName,
//
//            logHistoryImage = it.logHistoryImage,
//
//            logHistoryName = it.logHistoryName,
//
//            accountImage = it.accountImage,
//
//            accountName = it.accountName,
//
//            checkinIcon = it.checkinIcon,
//
//            checkoutIcon = it.checkoutIcon,
//
//            chatImage = it.chatImage,
//
//            mapImage = it.mapImage,
//
//            settingImage = it.settingImage,
//
//            callImage = it.callImage,
//
//            driveToImage = it.driveToImage,
//
//            endViolationImage = it.violationImage,
//
//            violationListImage = it.violationListImage,
//
//            panicIconColor = it.panicIconColor,
//
//            panicImage = it.panicImage,
//
//            emergencyOnMapImage = it.emergencyOnMapImage,
//
//            officerEmergencyOnMapImage = it.officerEmergencyOnMapImage,
//
//            violationOnMapImage = it.violationOnMapImage,
//
//            violationMainImage = it.violationMainImage,
//
//            alertMainImage = it.alertMainImage,
//
//            cameraAlertMainImage = it.cameraAlertMainImage,
//
//            citizenEmergencyMainImage = it.citizenEmergencyMainImage,
//
//            officerEmergencyMainImage = it.officerEmergencyMainImage,
//
//            relativesMainImage = it.relativesMainImage,
//
//            checkinBorderRadius = it.checkinBorderRadius,
//
//            checkoutBorderRadius = it.checkoutBorderRadius,
//
//       //     sections = it.sections
//        )
//    }
//
//    private fun mapAppConfig(it: AppConfigResponse): AppConfig {
//        return AppConfig(
//
//            appName = it.appName,
//
//            aboutUsUrl = it.aboutUsUrl,
//
//            privacyPolicyUrl = it.privacyPolicyUrl,
//
//            contactEmail = it.contactEmail,
//
//            contactPhone = it.contactPhone,
//
//            termsConditionUrl = it.termsConditionUrl
//        )
//    }
//
//    private fun mapOfficer(it: OfficerResponse): Officer {
//        return Officer(
//            radius = it.radius,
//
//            checkinBorderRadius = it.checkinBorderRadius,
//
//            checkoutBorderRadius = it.checkoutBorderRadius,
//
//            radiusUnit = it.radiusUnit,
//
//            primaryColor = it.primaryColor,
//
//            textColor = it.textColor,
//
//            textSelectedColor = it.textSelectedColor,
//
//            checkinImage = it.checkinImage,
//
//            logEntryImage = it.logEntryImage,
//
//            logEntryName = it.logEntryName,
//
//            logHistoryImage = it.logHistoryImage,
//
//            logHistoryName = it.logHistoryName,
//
//            checkinName = it.checkinName,
//
//            checkoutImage = it.checkoutImage,
//
//            checkoutName = it.checkoutName,
//
//            chatImage = it.chatImage,
//
//            mapImage = it.mapImage,
//
//            settingImage = it.settingImage,
//
//            checkinIcon = it.checkinIcon,
//
//            checkoutIcon = it.checkoutIcon,
//
//            checkingImage = it.checkingImage,
//
//            checkingName = it.checkingName,
//
//            accountImage = it.accountImage,
//
//            accountName = it.accountName,
//
//            driveToImage = it.driveToImage,
//
//            callImage = it.callImage,
//
//            endViolationImage = it.endViolationImage,
//
//            violationListImage = it.violationListImage,
//
//            temperatureImage = it.temperatureImage,
//
//            distanceImage = it.distanceImage,
//
//            showPanic = it.showPanic,
//
//            panicIconColor = it.panicIconColor,
//
//            panicImage = it.panicImage,
//
//            violationMainImage = it.violationMainImage,
//
//            alertMainImage = it.alertMainImage,
//
//            cameraAlertMainImage = it.cameraAlertMainImage,
//
//            citizenEmergencyMainImage = it.citizenEmergencyMainImage,
//
//            officerEmergencyMainImage = it.officerEmergencyMainImage,
//
//            relativesMainImage = it.relativesMainImage,
//
//            backgroundColor = it.backgroundColor,
//
//            checkinTop = it.checkinTop,
//
//            checkinLeft = it.checkinLeft,
//
//            checkinWidth = it.checkinWidth,
//
//            checkinHeight = it.checkinHeight,
//
//            checkinTextTop = it.checkinTextTop,
//
//            checkinTextLeft = it.checkinTextLeft,
//
//            checkinTextSize = it.checkinTextSize,
//
//            checkinTextColor = it.checkinTextColor,
//
//            checkinTextWeight = it.checkinTextWeight,
//
//            checkoutTop = it.checkoutTop,
//
//            checkoutLeft = it.checkoutLeft,
//
//            checkoutWidth = it.checkoutWidth,
//
//            checkoutHeight = it.checkoutHeight,
//
//            checkoutTextTop = it.checkoutTextTop,
//
//            checkoutTextLeft = it.checkoutTextLeft,
//
//            checkoutTextSize = it.checkoutTextSize,
//
//            checkoutTextColor = it.checkoutTextColor,
//
//            checkoutTextWeight = it.checkoutTextWeight,
//
//            checkinPriority = it.checkinPriority,
//
//            checkinBorderWidth = it.checkinBorderWidth,
//
//            checkinBorderColor = it.checkinBorderColor,
//
//            checkoutPriority = it.checkoutPriority,
//
//            checkoutBorderWidth = it.checkoutBorderWidth,
//
//            checkoutBorderColor = it.checkoutBorderColor
//        )
//    }
//}