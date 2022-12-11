package com.bemotioninc.sss.data.dto.cachingmodules

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class SettingsAndTranslations(

    
    @SerializedName("editPersonalDetailsName")
    var editPersonalDetailsName: String? = "_editPersonalDetailsName",
    
    @SerializedName("securityName")
    var securityName: String? = "_securityName",

    
    @SerializedName("changePasswordName")
    var changePasswordName: String? = "_changePasswordName",

    
    @SerializedName("servicesName")
    var servicesName: String? = "_servicesName",

    
    @SerializedName("notificationsName")
    var notificationsName: String? = "_notificationsName",

    
    @SerializedName("silentNotificationsName")
    var silentNotificationsName: String? = "_silentNotificationsName",

    
    @SerializedName("trackingName")
    var trackingName: String? = "_trackingName",

    
    @SerializedName("unitOfMeasurementName")
    var unitOfMeasurementName: String? = "_unitOfMeasurementName",

    
    @SerializedName("distanceUnitName")
    var distanceUnitName: String? = "_distanceUnitName",

    
    @SerializedName("temperatureName")
    var temperatureName: String? = "_temperatureName",

    
    @SerializedName("appInfoName")
    var appInfoName: String? = "_appInfoName",

    
    @SerializedName("aboutUsName")
    var aboutUsName: String? = "_aboutUsName",

    
    @SerializedName("privacyPolicyName")
    var privacyPolicyName: String? = "_privacyPolicyName",

    
    @SerializedName("termsConditionsName")
    var termsConditionsName: String? = "_termsConditionsName",

    
    @SerializedName("contactUsName")
    var contactUsName: String? = "_contactUsName",

    
    @SerializedName("changePasswordImage")
    var changePasswordImage: String? = "_changePasswordImage",

    
    @SerializedName("notificationsImage")
    var notificationsImage: String? = "_notificationsImage",

    
    @SerializedName("silentNotificationsImage")
    var silentNotificationsImage: String? = "_silentNotificationsImage",

    
    @SerializedName("trackingImage")
    var trackingImage: String? = "_trackingImage",

    
    @SerializedName("distanceUnitImage")
    var distanceUnitImage: String? = "_distanceUnitImage",

    
    @SerializedName("temperatureImage")
    var temperatureImage: String? = "_temperatureImage",

    
    @SerializedName("aboutUsImage")
    var aboutUsImage: String? = "_aboutUsImage",

    
    @SerializedName("privacyPolicyImage")
    var privacyPolicyImage: String? = "_privacyPolicyImage",

    
    @SerializedName("termsConditionsImage")
    var termsConditionsImage: String? = "_termsConditionsImage",

    
    @SerializedName("contactUsImage")
    var contactUsImage: String? = "_contactUsImage",

    
    @SerializedName("shareAppImage")
    var shareAppImage: String? = "_shareAppImage",

    
    @SerializedName("shareAppName")
    var shareAppName: String? = "_shareAppName",

    
    @SerializedName("shareAppHeaderName")
    var shareAppHeaderName: String? = "_shareAppHeaderName",

    
    @SerializedName("languagesImage")
    var languagesImage: String? = "_languagesImage",

    
    @SerializedName("appAlertsOnTopImage")
    var appAlertsOnTopImage: String? = "_appAlertsOnTopImage",

    
    @SerializedName("languagesName")
    var languagesName: String? = "_languagesName",

    
    @SerializedName("otherSettingsHeaderName")
    var otherSettingsHeaderName: String? = "_otherSettingsHeaderName",

    
    @SerializedName("firstNameImage")
    var firstNameImage: String? = "_firstNameImage",

    
    @SerializedName("emailImage")
    var emailImage: String? = "_emailImage",

    
    @SerializedName("phoneNumberImage")
    var phoneNumberImage: String? = "_phoneNumberImage",

    
    @SerializedName("titleImage")
    var titleImage: String? = "_titleImage",

    
    @SerializedName("badgeNumberImage")
    var badgeNumberImage: String? = "_badgeNumberImage",

    
    @SerializedName("genderImage")
    var genderImage: String? = "_genderImage",

    
    @SerializedName("dateOfBirthImage")
    var dateOfBirthImage: String? = "_dateOfBirthImage",

    
    @SerializedName("areaImage")
    var areaImage: String? = "_areaImage",

    
    @SerializedName("streetAddressImage")
    var streetAddressImage: String? = "_streetAddressImage",

    
    @SerializedName("cityImage")
    var cityImage: String? = "_cityImage",

    
    @SerializedName("stateImage")
    var stateImage: String? = "_stateImage",

    
    @SerializedName("countryImage")
    var countryImage: String? = "_countryImage",

    
    @SerializedName("postalCodeImage")
    var postalCodeImage: String? = "_postalCodeImage",

    
    @SerializedName("buildingNumberImage")
    var buildingNumberImage: String? = "_buildingNumberImage",

    
    @SerializedName("healthConditionImage")
    var healthConditionImage: String? = "_healthConditionImage",

    
    @SerializedName("relativesImage")
    var relativesImage: String? = "_relativesImage",

    
    @SerializedName("accountInfoName")
    var accountInfoName: String? = "_accountInfoName",

    
    @SerializedName("firstName")
    var firstName: String? = "_firstName",

    
    @SerializedName("lastName")
    var lastName: String? = "_lastName",

    
    @SerializedName("emailName")
    var emailName: String? = "_emailName",

    
    @SerializedName("writeHere")
    var writeHere: String? = "_writeHere",

    
    @SerializedName("password")
    var password: String? = "_password",

    
    @SerializedName("login")
    var login: String? = "_login",

    
    @SerializedName("forgotPassword")
    var forgotPassword: String? = "_forgotPassword",

    
    @SerializedName("phoneNumberName")
    var phoneNumberName: String? = "_phoneNumberName",

    
    @SerializedName("titleName")
    var titleName: String? = "_titleName",

    
    @SerializedName("badgeNumberName")
    var badgeNumberName: String? = "_badgeNumberName",

    
    @SerializedName("genderName")
    var genderName: String? = "_genderName",

    
    @SerializedName("dateOfBirthName")
    var dateOfBirthName: String? = "_dateOfBirthName",

    
    @SerializedName("areaName")
    var areaName: String? = "_areaName",

    
    @SerializedName("streetAddressName")
    var streetAddressName: String? = "_streetAddressName",

    
    @SerializedName("cityName")
    var cityName: String? = "_cityName",

    
    @SerializedName("countryName")
    var countryName: String? = "_countryName",

    
    @SerializedName("stateName")
    var stateName: String? = "_stateName",

    
    @SerializedName("countryCode")
    var countryCode: String? = "_countryCode",

    
    @SerializedName("postalCodeName")
    var postalCodeName: String? = "_postalCodeName",

    
    @SerializedName("buildingNumberName")
    var buildingNumberName: String? = "_buildingNumberName",

    
    @SerializedName("healthConditionName")
    var healthConditionName: String? = "_healthConditionName",

    
    @SerializedName("relativesName")
    var relativesName: String? = "_relativesName",

    
    @SerializedName("dontHaveAnAcccount")
    var dontHaveAnAcccount: String? = "_dontHaveAnAcccount",

    
    @SerializedName("registerNow")
    var registerNow: String? = "_registerNow",

    
    @SerializedName("poweredByBemotion")
    var poweredByBemotion: String? = "_poweredByBemotion",

    
    @SerializedName("fillThisField")
    var fillThisField: String? = "_fillThisField",

    
    @SerializedName("invalidEmailAdress")
    var invalidEmailAddress: String? = "_invalidEmailAdress",

    
    @SerializedName("invalidPhoneNumber")
    var invalidPhoneNumber: String? = "_invalidPhoneNumber",

    
    @SerializedName("signUp")
    var signUp: String? = "_signUp",

    
    @SerializedName("userNotExist")
    var userNotExist: String? = "_userNotExist",

    
    @SerializedName("somethingWentWrong")
    var somethingWentWrong: String? = "_somethingWentWrong",

    
    @SerializedName("checkYourEmailPlease")
    var checkYourEmailPlease: String? = "_checkYourEmailPlease",

    
    @SerializedName("noInternetConnection")
    var noInternetConnection: String? = "_noInternetConnection",

    
    @SerializedName("byCreatingAnAccountYouAgree")
    var byCreatingAnAccountYouAgree: String? = "_byCreatingAnAccountYouAgree",

    
    @SerializedName("trackingWillAutomaticallyDisabledAfterYourViolationEnded")
    var trackingWillAutomaticallyDisabledAfterYourViolationEnded: String? = "_trackingWillAutomaticallyDisabledAfterYourViolationEnded",

    
    @SerializedName("fillOutAndGetStarted")
    var fillOutAndGetStarted: String? = "_fillOutAndGetStarted",

    
    @SerializedName("adress")
    var adress: String? = "_adress",

    
    @SerializedName("male")
    var male: String? = "_male",

    
    @SerializedName("female")
    var female: String? = "_female",

    
    @SerializedName("other")
    var other: String? = "_other",

    
    @SerializedName("preferNotToSay")
    var preferNotToSay: String? = "_preferNotToSay",

    
    @SerializedName("addNewRelative")
    var addNewRelative: String? = "_addNewRelative",

    
    @SerializedName("add")
    var add: String? = "_add",

    
    @SerializedName("termsAndPrivacyAgreementMessage")
    var termsAndPrivacyAgreementMessage: String? = "_termsAndPrivacyAgreementMessage",

    
    @SerializedName("mustBeAtLeast6Characters")
    var mustBeAtLeast6Characters: String? = "_mustBeAtLeast6Characters",

    
    @SerializedName("youMustAddAtLeastOneRelative")
    var youMustAddAtLeastOneRelative: String? = "_youMustAddAtLeastOneRelative",

    
    @SerializedName("youSignUpSuccessfully")
    var youSignUpSuccessfully: String? = "_youSignUpSuccessfully",

    
    @SerializedName("tutorial1Title")
    var tutorial1Title: String? = "_tutorial1Title",

    
    @SerializedName("tutorial1Sub")
    var tutorial1Sub: String? = "_tutorial1Sub",

    
    @SerializedName("tutorial2Title")
    var tutorial2Title: String? = "_tutorial2Title",

    
    @SerializedName("tutorial2Sub")
    var tutorial2Sub: String? = "_tutorial2Sub",

    
    @SerializedName("tutorial3Title")
    var tutorial3Title: String? = "_tutorial3Title",

    
    @SerializedName("tutorial3Sub")
    var tutorial3Sub: String? = "_tutorial3Sub",

    
    @SerializedName("tutorial4Title")
    var tutorial4Title: String? = "_tutorial4Title",

    
    @SerializedName("tutorial4Sub")
    var tutorial4Sub: String? = "_tutorial4Sub",

    
    @SerializedName("skip")
    var skip: String? = "_skip",

    
    @SerializedName("done")
    var done: String? = "_done",

    
    @SerializedName("weReceivedYourPanic")
    var weReceivedYourPanic: String? = "_weReceivedYourPanic",

    
    @SerializedName("cantReadLocation")
    var cantReadLocation: String? = "_cantReadLocation",

    
    @SerializedName("trackingWorkingAgainBecauseThisCaseNeedTracking")
    var trackingWorkingAgainBecauseThisCaseNeedTracking: String? = "_trackingWorkingAgainBecauseThisCaseNeedTracking",

    
    @SerializedName("gpsRequired")
    var gpsRequired: String? = "_gpsRequired",

    
    @SerializedName("provideLocationPermission")
    var provideLocationPermission: String? = "_provideLocationPermission",

    
    @SerializedName("gpsTurnedOn")
    var gpsTurnedOn: String? = "_gpsTurnedOn",

    
    @SerializedName("failedToCompress")
    var failedToCompress: String? = "_failedToCompress",

    
    @SerializedName("someProfileDataNotFilled")
    var someProfileDataNotFilled: String? = "_someProfileDataNotFilled",

    
    @SerializedName("failed")
    var failed: String? = "_failed",

    
    @SerializedName("pressTwiceToExit")
    var pressTwiceToExit: String? = "_pressTwiceToExit",

    
    @SerializedName("youHaveLoggedInFromAnotherDevice")
    var youHaveLoggedInFromAnotherDevice: String? = "_youHaveLoggedInFromAnotherDevice",

    
    @SerializedName("alert")
    var alert: String? = "_alert",

    
    @SerializedName("success")
    var success: String? = "_success",

    
    @SerializedName("forceLogoutTitle")
    var forceLogoutTitle: String? = "_forceLogoutTitle",

    
    @SerializedName("yourDeviceDoesntSupportCamera")
    var yourDeviceDoesntSupportCamera: String? = "_yourDeviceDoesntSupportCamera",

    
    @SerializedName("submit")
    var submit: String? = "_submit",

    
    @SerializedName("confirm")
    var confirm: String? = "_confirm",

    
    @SerializedName("enableTrackingBeforeRecordViolation")
    var enableTrackingBeforeRecordViolation: String? = "_enableTrackingBeforeRecordViolation",

    
    @SerializedName("byClickingOkWeWillSendYourCase")
    var byClickingOkWeWillSendYourCase: String? = "_byClickingOkWeWillSendYourCase",

    
    @SerializedName("alreadyHaveViolationOrPanic")
    var alreadyHaveViolationOrPanic: String? = "_alreadyHaveViolationOrPanic",

    
    @SerializedName("youMustCheckInFirst")
    var youMustCheckInFirst: String? = "_youMustCheckInFirst",

    
    @SerializedName("youMustCheckOutFirst")
    var youMustCheckOutFirst: String? = "_youMustCheckOutFirst",

    
    @SerializedName("youCantCheckViolationsMapWhileYouRecordOneAsOfficer")
    var youCantCheckViolationsMapWhileYouRecordOneAsOfficer: String? = "_youCantCheckViolationsMapWhileYouRecordOneAsOfficer",

    
    @SerializedName("givePermission")
    var givePermission: String? = "_givePermission",

    
    @SerializedName("permissionWasDeniedButStillNeeded")
    var permissionWasDeniedButStillNeeded: String? = "_permissionWasDeniedButStillNeeded",

    
    @SerializedName("settings")
    var settings: String? = "_settings",


    
    @SerializedName("continueTo")
    var continueTo: String? = "_continueTo",

    
    @SerializedName("newVersionIsAvailable")
    var newVersionIsAvailable: String? = "_newVersionIsAvailable",

    
    @SerializedName("update")
    var update: String? = "_update",

    
    @SerializedName("tryAgain")
    var tryAgain: String? = "_tryAgain",

    
    @SerializedName("closeAppNotActive")
    var closeAppNotActive: String? = "_closeAppNotActive",

    
    @SerializedName("appIsNotActive")
    var appIsNotActive: String? = "_appIsNotActive",

    
    @SerializedName("ok")
    var ok: String? = "_ok",

    
    @SerializedName("youAreAlreadyCheckedIn")
    var youAreAlreadyCheckedIn: String? = "_youAreAlreadyCheckedIn",

    
    @SerializedName("youAreAlreadyCheckedOut")
    var youAreAlreadyCheckedOut: String? = "_youAreAlreadyCheckedOut",

    
    @SerializedName("youCantCheckOutWhileYouWorkOnViolation")
    var youCantCheckOutWhileYouWorkOnViolation: String? = "_youCantCheckOutWhileYouWorkOnViolation",

    
    @SerializedName("pleaseSelectViolationType")
    var pleaseSelectViolationType: String? = "_pleaseSelectViolationType",

    
    @SerializedName("cancel")
    var cancel: String? = "_cancel",

    
    @SerializedName("noDataForList")
    var noDataForList: String? = "_noDataForList",

    
    @SerializedName("takePhotoOrVideo")
    var takePhotoOrVideo: String? = "_takePhotoOrVideo",

    
    @SerializedName("reset")
    var reset: String? = "_reset",

    
    @SerializedName("citizenName")
    var citizenName: String? = "_citizenName",

    
    @SerializedName("officerName")
    var officerName: String? = "_officerName",

    
    @SerializedName("accepted")
    var accepted: String? = "_accepted",

    
    @SerializedName("pending")
    var pending: String? = "_pending",

    
    @SerializedName("completed")
    var completed: String? = "_completed",

    
    @SerializedName("canceled")
    var canceled: String? = "_canceled",

    
    @SerializedName("predefinedQuestions")
    var predefinedQuestions: String? = "_predefinedQuestions",

    
    @SerializedName("chat")
    var chat: String? = "_chat",

    
    @SerializedName("driveTo")
    var driveTo: String? = "_driveTo",

    
    @SerializedName("callNow")
    var callNow: String? = "_callNow",

    
    @SerializedName("accept")
    var accept: String? = "_accept",

    
    @SerializedName("distance")
    var distance: String? = "_distance",

    
    @SerializedName("violationType")
    var violationType: String? = "_violationType",

    
    @SerializedName("violationSubType")
    var violationSubType: String? = "_violationSubType",

    
    @SerializedName("status")
    var status: String? = "_status",

    
    @SerializedName("title")
    var title: String? = "_title",

    
    @SerializedName("weather")
    var weather: String? = "_weather",

    
    @SerializedName("date")
    var date: String? = "_date",

    
    @SerializedName("location")
    var location: String? = "_location",

    
    @SerializedName("acceptedBy")
    var acceptedBy: String? = "_acceptedBy",

    
    @SerializedName("endViolation")
    var endViolation: String? = "_endViolation",

    
    @SerializedName("endEmergency")
    var endEmergency: String? = "_endEmergency",

    
    @SerializedName("cancelEmergency")
    var cancelEmergency: String? = "_cancelEmergency",

    
    @SerializedName("cancelViolation")
    var cancelViolation: String? = "_cancelViolation",

    
    @SerializedName("pleaseWriteTheReasonBelow")
    var pleaseWriteTheReasonBelow: String? = "_pleaseWriteTheReasonBelow",

    
    @SerializedName("theCaseHaseBeenClosed")
    var theCaseHaseBeenClosed: String? = "_theCaseHaseBeenClosed",

    
    @SerializedName("violationAcceptanceInboxMessage")
    var violationAcceptanceInboxMessage: String? = "_violationAcceptanceInboxMessage",

    
    @SerializedName("whoIs")
    var whoIs: String? = "_whoIs",

    
    @SerializedName("staySafe")
    var staySafe: String? = "_staySafe",

    
    @SerializedName("enterEmailToResetPasssword")
    var enterEmailToResetPasssword: String? = "_enterEmailToResetPasssword",

    
    @SerializedName("endCaseMessage")
    var endCaseMessage: String? = "_endCaseMessage",

    
    @SerializedName("yes")
    var yes: String? = "_yes",

    
    @SerializedName("youCantSendEmptyMessage")
    var youCantSendEmptyMessage: String? = "_youCantSendEmptyMessage",

    
    @SerializedName("messageForLoading")
    var messageForLoading: String? = "_messageForLoading",

    
    @SerializedName("nameForLoading")
    var nameForLoading: String? = "_nameForLoading",

    
    @SerializedName("youCantLogoutWhileYouHaveViolation")
    var youCantLogoutWhileYouHaveViolation: String? = "_youCantLogoutWhileYouHaveViolation",

    
    @SerializedName("checkOnMap")
    var checkOnMap: String? = "_checkOnMap",

    
    @SerializedName("pleaseEnableGps")
    var pleaseEnableGps: String? = "_pleaseEnableGps",

    
    @SerializedName("openCamera")
    var openCamera: String? = "_openCamera",

    
    @SerializedName("selectFromGallery")
    var selectFromGallery: String? = "_selectFromGallery",

    
    @SerializedName("pleaseFillTheMandatoryData")
    var pleaseFillTheMandatoryData: String? = "_pleaseFillTheMandatoryData",

    
    @SerializedName("gotIt")
    var gotIt: String? = "_gotIt",

    
    @SerializedName("note")
    var note: String? = "_note",

    
    @SerializedName("recordVideo")
    var recordVideo: String? = "_recordVideo",

    
    @SerializedName("takePicture")
    var takePicture: String? = "_takePicture",

    
    @SerializedName("wrongPassword")
    var wrongPassword: String? = "_wrongPassword",

    
    @SerializedName("versionNumber")
    var versionNumber: String? = "_versionNumber",

    
    @SerializedName("search")
    var search: String? = "_search",

    
    @SerializedName("searchOnViolation")
    var searchOnViolation: String? = "_searchOnViolation",

    
    @SerializedName("hi")
    var hi: String? = "_hi",

    
    @SerializedName("lenTrackingServiceIsWorkingForCitizen")
    var lenTrackingServiceIsWorkingForCitizen: String? = "_lenTrackingServiceIsWorkingForCitizen",

    
    @SerializedName("lenTrackingServiceIsWorking")
    var lenTrackingServiceIsWorking: String? = "_lenTrackingServiceIsWorking",

    
    @SerializedName("ignore")
    var ignore: String? = "_ignore",

    
    @SerializedName("openSettings")
    var openSettings: String? = "_openSettings",

    
    @SerializedName("locationAccessMessage")
    var locationAccessMessage: String? = "_locationAccessMessage",

    
    @SerializedName("violation")
    var violation: String? = "_violation",

    
    @SerializedName("emergency")
    var emergency: String? = "_emergency",

    
    @SerializedName("officerEmergency")
    var officerEmergency: String? = "_officerEmergency",

    
    @SerializedName("byPhoneNumber")
    var byPhoneNumber: String? = "_byPhoneNumber",

    
    @SerializedName("byEmail")
    var byEmail: String? = "_byEmail",

    
    @SerializedName("mustRestartApplicationToEnableTracking")
    var mustRestartApplicationToEnableTracking: String? = "_mustRestartApplicationToEnableTracking",

    
    @SerializedName("restartNow")
    var restartNow: String? = "_restartNow",

    
    @SerializedName("saveData")
    var saveData: String? = "_saveData",

    
    @SerializedName("edit")
    var edit: String? = "_edit",

    
    @SerializedName("logout")
    var logout: String? = "_logout",

    
    @SerializedName("profile")
    var profile: String? = "_profile",

    
    @SerializedName("cantEditThis")
    var cantEditThis: String? = "_cantEditThis",

    
    @SerializedName("lastMessageImage")
    var lastMessageImage: String? = "_lastMessageImage",

    
    @SerializedName("lastMessageVideo")
    var lastMessageVideo: String? = "_lastMessageVideo",

    
    @SerializedName("notificationMessageImage")
    var notificationMessageImage: String? = "_notificationMessageImage",

    
    @SerializedName("notificationMessageVideo")
    var notificationMessageVideo: String? = "_notificationMessageVideo",

    
    @SerializedName("asAnOfficerCantEditThis")
    var asAnOfficerCantEditThis: String? = "_asAnOfficerCantEditThis",

    
    @SerializedName("passwordNotMatch")
    var passwordNotMatch: String? = "_passwordNotMatch",

    
    @SerializedName("changeLanguageMessage")
    var changeLanguageMessage: String? = "_changeLanguageMessage",

    
    @SerializedName("changeLanguageTitle")
    var changeLanguageTitle: String? = "_changeLanguageTitle",

    
    @SerializedName("myChats")
    var myChats: String? = "_myChats",

    
    @SerializedName("typeMessageHere")
    var typeMessageHere: String? = "_typeMessageHere",

    
    @SerializedName("yourEmailMustNotUsedAsRelativeEmail")
    var yourEmailMustNotUsedAsRelativeEmail: String? = "_yourEmailMustNotUsedAsRelativeEmail",

    
    @SerializedName("thiEmailIsAlreadyRegisteredAsRelative")
    var thisEmailIsAlreadyRegisteredAsRelative: String? = "_thiEmailIsAlreadyRegisteredAsRelative",

    
    @SerializedName("officerEmergencyHasBeenClosed")
    var officerEmergencyHasBeenClosed: String? = "_officerEmergencyHasBeenClosed",

    
    @SerializedName("newViolationAlertTitle")
    var newViolationAlertTitle: String? = "_newViolationAlertTitle",

    
    @SerializedName("newViolationAlertMessage")
    var newViolationAlertMessage: String? = "_newViolationAlertMessage",

    
    @SerializedName("newOfficerEmergencyAlertTitle")
    var newOfficerEmergencyAlertTitle: String? = "_newOfficerEmergencyAlertTitle",

    
    @SerializedName("newOfficerEmergencyAlertMessage")
    var newOfficerEmergencyAlertMessage: String? = "_newOfficerEmergencyAlertMessage",

    
    @SerializedName("newCitizenEmergencyAlertTitle")
    var newCitizenEmergencyAlertTitle: String? = "_newCitizenEmergencyAlertTitle",

    
    @SerializedName("newCitizenEmergencyAlertMessage")
    var newCitizenEmergencyAlertMessage: String? = "_newCitizenEmergencyAlertMessage",

    
    @SerializedName("newRelativesAlertTitle")
    var newRelativesAlertTitle: String? = "_newRelativesAlertTitle",

    
    @SerializedName("newRelativesAlertMessage")
    var newRelativesAlertMessage: String? = "_newRelativesAlertMessage",

    
    @SerializedName("retypePassword")
    var retypePassword: String? = "_retypePassword",

    
    @SerializedName("newPassword")
    var newPassword: String? = "_newPassword",

    
    @SerializedName("currentPassword")
    var currentPassword: String? = "_currentPassword",

    
    @SerializedName("unidentified")
    var unidentified: String? = "_unidentified",

    
    @SerializedName("kiloMeters")
    var kiloMeters: String? = "_kiloMeters",

    
    @SerializedName("miles")
    var miles: String? = "_miles",

    
    @SerializedName("violationHistory")
    var violationHistory: String? = "_violationHistory",

    
    @SerializedName("alertHistory")
    var alertHistory: String? = "_alertHistory",

    
    @SerializedName("cameraAlertHistory")
    var cameraAlertHistory: String? = "_cameraAlertHistory",

    
    @SerializedName("fullAddress")
    var fullAddress: String? = "_fullAddress",

    
    @SerializedName("detectionType")
    var detectionType: String? = "_detectionType",

    
    @SerializedName("cameraDetails")
    var cameraDetails: String? = "_cameraDetails",

    
    @SerializedName("cameraLocation")
    var cameraLocation: String? = "_cameraLocation",

    
    @SerializedName("inboxEmptyTitle")
    var inboxEmptyTitle: String? = "_inboxEmptyTitle",

    
    @SerializedName("inboxEmptyMsg")
    var inboxEmptyMsg: String? = "_inboxEmptyMsg",

    
    @SerializedName("verifyEmail")
    var verifyEmail: String? = "_verifyEmail",

    
    @SerializedName("needStorageAndCameraAccessMessage")
    var needStorageAndCameraAccessMessage: String? = "_needStorageAndCameraAccessMessage",

    
    @SerializedName("ageName")
    var ageName: String? = "_ageName",

    
    @SerializedName("statusOnline")
    var statusOnline: String? = "_statusOnline",

    
    @SerializedName("statusOffline")
    var statusOffline: String? = "_statusOffline",

    
    @SerializedName("statusBusy")
    var statusBusy: String? = "_statusBusy",

    
    @SerializedName("appAlertsOnTopName")
    var appAlertsOnTopName: String? = "_appAlertsOnTopName",

    
    @SerializedName("officersGroupName")
    var officersGroupName: String? = "_officersGroupName",

    
    @SerializedName("officersChatTab")
    var officersChatTab: String? = "_officersChatTab",

    
    @SerializedName("citizensChatTab")
    var citizensChatTab: String? = "_citizensChatTab",

    
    @SerializedName("newOfficerJoinedTheCase")
    var newOfficerJoinedTheCase: String? = "_newOfficerJoinedTheCase",

    
    @SerializedName("youJoinedTheCase")
    var youJoinedTheCase: String? = "_youJoinedTheCase",

    
    @SerializedName("officerCaseStarted")
    var officerCaseStarted: String? = "_officerCaseStarted",

    
    @SerializedName("officerCaseEnded")
    var officerCaseEnded: String? = "_officerCaseEnded",

    
    @SerializedName("endViolationForm")
    var endViolationForm: String? = "_endViolationForm",

    
    @SerializedName("newCameraAlert")
    var newCameraAlert: String? = "_newCameraAlert",

    
    @SerializedName("newAlertCreated")
    var newAlertCreated: String? = "_newAlertCreated",


    /********************************************* Permissions  */
    
    @SerializedName("permissionNeeded")
    var permissionNeeded: String? = "_permissionNeeded",

    
    @SerializedName("appAppearOnTopPermission")
    var appAppearOnTopPermission: String? = "_appAppearOnTopPermission",

    
    @SerializedName("ignoreBatteryOptimizationPermission")
    var ignoreBatteryOptimizationPermission: String? = "_ignoreBatteryOptimizationPermission",

    /********************************************* Server Errors  */
    
    @SerializedName("invalidLoginDataError")
    var invalidLoginDataError: String? = "_invalidLoginDataError",

    
    @SerializedName("emailNotVerifiedError")
    var emailNotVerifiedError: String? = "_emailNotVerifiedError",

    
    @SerializedName("accountNotActiveError")
    var accountNotActiveError: String? = "_accountNotActiveError",

    
    @SerializedName("userAlreadyExistError")
    var userAlreadyExistError: String? = "_userAlreadyExistError",

    
    @SerializedName("signUpFailedError")
    var signUpFailedError: String? = "_signUpFailedError",

    
    @SerializedName("alreadyAcceptedError")
    var alreadyAcceptedError: String? = "_alreadyAcceptedError",

    
    @SerializedName("alreadyCanceledError")
    var alreadyCanceledError: String? = "_alreadyCanceledError",

    
    @SerializedName("alreadyCompletedError")
    var alreadyCompletedError: String? = "_alreadyCompletedError",

    /********************************************* Local Errors  */
    
    @SerializedName("connectionError")
    var connectionError: String? = "_connectionError"
)