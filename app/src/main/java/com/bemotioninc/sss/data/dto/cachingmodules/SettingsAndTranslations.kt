package com.bemotioninc.sss.data.dto.cachingmodules

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SettingsAndTranslations(

    @Expose
    @SerializedName("editPersonalDetailsName")
    var editPersonalDetailsName: String? = "_editPersonalDetailsName",
    @Expose
    @SerializedName("securityName")
    var securityName: String? = "_securityName",

    @Expose
    @SerializedName("changePasswordName")
    var changePasswordName: String? = "_changePasswordName",

    @Expose
    @SerializedName("servicesName")
    var servicesName: String? = "_servicesName",

    @Expose
    @SerializedName("notificationsName")
    var notificationsName: String? = "_notificationsName",

    @Expose
    @SerializedName("silentNotificationsName")
    var silentNotificationsName: String? = "_silentNotificationsName",

    @Expose
    @SerializedName("trackingName")
    var trackingName: String? = "_trackingName",

    @Expose
    @SerializedName("unitOfMeasurementName")
    var unitOfMeasurementName: String? = "_unitOfMeasurementName",

    @Expose
    @SerializedName("distanceUnitName")
    var distanceUnitName: String? = "_distanceUnitName",

    @Expose
    @SerializedName("temperatureName")
    var temperatureName: String? = "_temperatureName",

    @Expose
    @SerializedName("appInfoName")
    var appInfoName: String? = "_appInfoName",

    @Expose
    @SerializedName("aboutUsName")
    var aboutUsName: String? = "_aboutUsName",

    @Expose
    @SerializedName("privacyPolicyName")
    var privacyPolicyName: String? = "_privacyPolicyName",

    @Expose
    @SerializedName("termsConditionsName")
    var termsConditionsName: String? = "_termsConditionsName",

    @Expose
    @SerializedName("contactUsName")
    var contactUsName: String? = "_contactUsName",

    @Expose
    @SerializedName("changePasswordImage")
    var changePasswordImage: String? = "_changePasswordImage",

    @Expose
    @SerializedName("notificationsImage")
    var notificationsImage: String? = "_notificationsImage",

    @Expose
    @SerializedName("silentNotificationsImage")
    var silentNotificationsImage: String? = "_silentNotificationsImage",

    @Expose
    @SerializedName("trackingImage")
    var trackingImage: String? = "_trackingImage",

    @Expose
    @SerializedName("distanceUnitImage")
    var distanceUnitImage: String? = "_distanceUnitImage",

    @Expose
    @SerializedName("temperatureImage")
    var temperatureImage: String? = "_temperatureImage",

    @Expose
    @SerializedName("aboutUsImage")
    var aboutUsImage: String? = "_aboutUsImage",

    @Expose
    @SerializedName("privacyPolicyImage")
    var privacyPolicyImage: String? = "_privacyPolicyImage",

    @Expose
    @SerializedName("termsConditionsImage")
    var termsConditionsImage: String? = "_termsConditionsImage",

    @Expose
    @SerializedName("contactUsImage")
    var contactUsImage: String? = "_contactUsImage",

    @Expose
    @SerializedName("shareAppImage")
    var shareAppImage: String? = "_shareAppImage",

    @Expose
    @SerializedName("shareAppName")
    var shareAppName: String? = "_shareAppName",

    @Expose
    @SerializedName("shareAppHeaderName")
    var shareAppHeaderName: String? = "_shareAppHeaderName",

    @Expose
    @SerializedName("languagesImage")
    var languagesImage: String? = "_languagesImage",

    @Expose
    @SerializedName("appAlertsOnTopImage")
    var appAlertsOnTopImage: String? = "_appAlertsOnTopImage",

    @Expose
    @SerializedName("languagesName")
    var languagesName: String? = "_languagesName",

    @Expose
    @SerializedName("otherSettingsHeaderName")
    var otherSettingsHeaderName: String? = "_otherSettingsHeaderName",

    @Expose
    @SerializedName("firstNameImage")
    var firstNameImage: String? = "_firstNameImage",

    @Expose
    @SerializedName("emailImage")
    var emailImage: String? = "_emailImage",

    @Expose
    @SerializedName("phoneNumberImage")
    var phoneNumberImage: String? = "_phoneNumberImage",

    @Expose
    @SerializedName("titleImage")
    var titleImage: String? = "_titleImage",

    @Expose
    @SerializedName("badgeNumberImage")
    var badgeNumberImage: String? = "_badgeNumberImage",

    @Expose
    @SerializedName("genderImage")
    var genderImage: String? = "_genderImage",

    @Expose
    @SerializedName("dateOfBirthImage")
    var dateOfBirthImage: String? = "_dateOfBirthImage",

    @Expose
    @SerializedName("areaImage")
    var areaImage: String? = "_areaImage",

    @Expose
    @SerializedName("streetAddressImage")
    var streetAddressImage: String? = "_streetAddressImage",

    @Expose
    @SerializedName("cityImage")
    var cityImage: String? = "_cityImage",

    @Expose
    @SerializedName("stateImage")
    var stateImage: String? = "_stateImage",

    @Expose
    @SerializedName("countryImage")
    var countryImage: String? = "_countryImage",

    @Expose
    @SerializedName("postalCodeImage")
    var postalCodeImage: String? = "_postalCodeImage",

    @Expose
    @SerializedName("buildingNumberImage")
    var buildingNumberImage: String? = "_buildingNumberImage",

    @Expose
    @SerializedName("healthConditionImage")
    var healthConditionImage: String? = "_healthConditionImage",

    @Expose
    @SerializedName("relativesImage")
    var relativesImage: String? = "_relativesImage",

    @Expose
    @SerializedName("accountInfoName")
    var accountInfoName: String? = "_accountInfoName",

    @Expose
    @SerializedName("firstName")
    var firstName: String? = "_firstName",

    @Expose
    @SerializedName("lastName")
    var lastName: String? = "_lastName",

    @Expose
    @SerializedName("emailName")
    var emailName: String? = "_emailName",

    @Expose
    @SerializedName("writeHere")
    var writeHere: String? = "_writeHere",

    @Expose
    @SerializedName("password")
    var password: String? = "_password",

    @Expose
    @SerializedName("login")
    var login: String? = "_login",

    @Expose
    @SerializedName("forgotPassword")
    var forgotPassword: String? = "_forgotPassword",

    @Expose
    @SerializedName("phoneNumberName")
    var phoneNumberName: String? = "_phoneNumberName",

    @Expose
    @SerializedName("titleName")
    var titleName: String? = "_titleName",

    @Expose
    @SerializedName("badgeNumberName")
    var badgeNumberName: String? = "_badgeNumberName",

    @Expose
    @SerializedName("genderName")
    var genderName: String? = "_genderName",

    @Expose
    @SerializedName("dateOfBirthName")
    var dateOfBirthName: String? = "_dateOfBirthName",

    @Expose
    @SerializedName("areaName")
    var areaName: String? = "_areaName",

    @Expose
    @SerializedName("streetAddressName")
    var streetAddressName: String? = "_streetAddressName",

    @Expose
    @SerializedName("cityName")
    var cityName: String? = "_cityName",

    @Expose
    @SerializedName("countryName")
    var countryName: String? = "_countryName",

    @Expose
    @SerializedName("stateName")
    var stateName: String? = "_stateName",

    @Expose
    @SerializedName("countryCode")
    var countryCode: String? = "_countryCode",

    @Expose
    @SerializedName("postalCodeName")
    var postalCodeName: String? = "_postalCodeName",

    @Expose
    @SerializedName("buildingNumberName")
    var buildingNumberName: String? = "_buildingNumberName",

    @Expose
    @SerializedName("healthConditionName")
    var healthConditionName: String? = "_healthConditionName",

    @Expose
    @SerializedName("relativesName")
    var relativesName: String? = "_relativesName",

    @Expose
    @SerializedName("dontHaveAnAcccount")
    var dontHaveAnAcccount: String? = "_dontHaveAnAcccount",

    @Expose
    @SerializedName("registerNow")
    var registerNow: String? = "_registerNow",

    @Expose
    @SerializedName("poweredByBemotion")
    var poweredByBemotion: String? = "_poweredByBemotion",

    @Expose
    @SerializedName("fillThisField")
    var fillThisField: String? = "_fillThisField",

    @Expose
    @SerializedName("invalidEmailAdress")
    var invalidEmailAddress: String? = "_invalidEmailAdress",

    @Expose
    @SerializedName("invalidPhoneNumber")
    var invalidPhoneNumber: String? = "_invalidPhoneNumber",

    @Expose
    @SerializedName("signUp")
    var signUp: String? = "_signUp",

    @Expose
    @SerializedName("userNotExist")
    var userNotExist: String? = "_userNotExist",

    @Expose
    @SerializedName("somethingWentWrong")
    var somethingWentWrong: String? = "_somethingWentWrong",

    @Expose
    @SerializedName("checkYourEmailPlease")
    var checkYourEmailPlease: String? = "_checkYourEmailPlease",

    @Expose
    @SerializedName("noInternetConnection")
    var noInternetConnection: String? = "_noInternetConnection",

    @Expose
    @SerializedName("byCreatingAnAccountYouAgree")
    var byCreatingAnAccountYouAgree: String? = "_byCreatingAnAccountYouAgree",

    @Expose
    @SerializedName("trackingWillAutomaticallyDisabledAfterYourViolationEnded")
    var trackingWillAutomaticallyDisabledAfterYourViolationEnded: String? = "_trackingWillAutomaticallyDisabledAfterYourViolationEnded",

    @Expose
    @SerializedName("fillOutAndGetStarted")
    var fillOutAndGetStarted: String? = "_fillOutAndGetStarted",

    @Expose
    @SerializedName("adress")
    var adress: String? = "_adress",

    @Expose
    @SerializedName("male")
    var male: String? = "_male",

    @Expose
    @SerializedName("female")
    var female: String? = "_female",

    @Expose
    @SerializedName("other")
    var other: String? = "_other",

    @Expose
    @SerializedName("preferNotToSay")
    var preferNotToSay: String? = "_preferNotToSay",

    @Expose
    @SerializedName("addNewRelative")
    var addNewRelative: String? = "_addNewRelative",

    @Expose
    @SerializedName("add")
    var add: String? = "_add",

    @Expose
    @SerializedName("termsAndPrivacyAgreementMessage")
    var termsAndPrivacyAgreementMessage: String? = "_termsAndPrivacyAgreementMessage",

    @Expose
    @SerializedName("mustBeAtLeast6Characters")
    var mustBeAtLeast6Characters: String? = "_mustBeAtLeast6Characters",

    @Expose
    @SerializedName("youMustAddAtLeastOneRelative")
    var youMustAddAtLeastOneRelative: String? = "_youMustAddAtLeastOneRelative",

    @Expose
    @SerializedName("youSignUpSuccessfully")
    var youSignUpSuccessfully: String? = "_youSignUpSuccessfully",

    @Expose
    @SerializedName("tutorial1Title")
    var tutorial1Title: String? = "_tutorial1Title",

    @Expose
    @SerializedName("tutorial1Sub")
    var tutorial1Sub: String? = "_tutorial1Sub",

    @Expose
    @SerializedName("tutorial2Title")
    var tutorial2Title: String? = "_tutorial2Title",

    @Expose
    @SerializedName("tutorial2Sub")
    var tutorial2Sub: String? = "_tutorial2Sub",

    @Expose
    @SerializedName("tutorial3Title")
    var tutorial3Title: String? = "_tutorial3Title",

    @Expose
    @SerializedName("tutorial3Sub")
    var tutorial3Sub: String? = "_tutorial3Sub",

    @Expose
    @SerializedName("tutorial4Title")
    var tutorial4Title: String? = "_tutorial4Title",

    @Expose
    @SerializedName("tutorial4Sub")
    var tutorial4Sub: String? = "_tutorial4Sub",

    @Expose
    @SerializedName("skip")
    var skip: String? = "_skip",

    @Expose
    @SerializedName("done")
    var done: String? = "_done",

    @Expose
    @SerializedName("weReceivedYourPanic")
    var weReceivedYourPanic: String? = "_weReceivedYourPanic",

    @Expose
    @SerializedName("cantReadLocation")
    var cantReadLocation: String? = "_cantReadLocation",

    @Expose
    @SerializedName("trackingWorkingAgainBecauseThisCaseNeedTracking")
    var trackingWorkingAgainBecauseThisCaseNeedTracking: String? = "_trackingWorkingAgainBecauseThisCaseNeedTracking",

    @Expose
    @SerializedName("gpsRequired")
    var gpsRequired: String? = "_gpsRequired",

    @Expose
    @SerializedName("provideLocationPermission")
    var provideLocationPermission: String? = "_provideLocationPermission",

    @Expose
    @SerializedName("gpsTurnedOn")
    var gpsTurnedOn: String? = "_gpsTurnedOn",

    @Expose
    @SerializedName("failedToCompress")
    var failedToCompress: String? = "_failedToCompress",

    @Expose
    @SerializedName("someProfileDataNotFilled")
    var someProfileDataNotFilled: String? = "_someProfileDataNotFilled",

    @Expose
    @SerializedName("failed")
    var failed: String? = "_failed",

    @Expose
    @SerializedName("pressTwiceToExit")
    var pressTwiceToExit: String? = "_pressTwiceToExit",

    @Expose
    @SerializedName("youHaveLoggedInFromAnotherDevice")
    var youHaveLoggedInFromAnotherDevice: String? = "_youHaveLoggedInFromAnotherDevice",

    @Expose
    @SerializedName("alert")
    var alert: String? = "_alert",

    @Expose
    @SerializedName("success")
    var success: String? = "_success",

    @Expose
    @SerializedName("forceLogoutTitle")
    var forceLogoutTitle: String? = "_forceLogoutTitle",

    @Expose
    @SerializedName("yourDeviceDoesntSupportCamera")
    var yourDeviceDoesntSupportCamera: String? = "_yourDeviceDoesntSupportCamera",

    @Expose
    @SerializedName("submit")
    var submit: String? = "_submit",

    @Expose
    @SerializedName("confirm")
    var confirm: String? = "_confirm",

    @Expose
    @SerializedName("enableTrackingBeforeRecordViolation")
    var enableTrackingBeforeRecordViolation: String? = "_enableTrackingBeforeRecordViolation",

    @Expose
    @SerializedName("byClickingOkWeWillSendYourCase")
    var byClickingOkWeWillSendYourCase: String? = "_byClickingOkWeWillSendYourCase",

    @Expose
    @SerializedName("alreadyHaveViolationOrPanic")
    var alreadyHaveViolationOrPanic: String? = "_alreadyHaveViolationOrPanic",

    @Expose
    @SerializedName("youMustCheckInFirst")
    var youMustCheckInFirst: String? = "_youMustCheckInFirst",

    @Expose
    @SerializedName("youMustCheckOutFirst")
    var youMustCheckOutFirst: String? = "_youMustCheckOutFirst",

    @Expose
    @SerializedName("youCantCheckViolationsMapWhileYouRecordOneAsOfficer")
    var youCantCheckViolationsMapWhileYouRecordOneAsOfficer: String? = "_youCantCheckViolationsMapWhileYouRecordOneAsOfficer",

    @Expose
    @SerializedName("givePermission")
    var givePermission: String? = "_givePermission",

    @Expose
    @SerializedName("permissionWasDeniedButStillNeeded")
    var permissionWasDeniedButStillNeeded: String? = "_permissionWasDeniedButStillNeeded",

    @Expose
    @SerializedName("settings")
    var settings: String? = "_settings",


    @Expose
    @SerializedName("continueTo")
    var continueTo: String? = "_continueTo",

    @Expose
    @SerializedName("newVersionIsAvailable")
    var newVersionIsAvailable: String? = "_newVersionIsAvailable",

    @Expose
    @SerializedName("update")
    var update: String? = "_update",

    @Expose
    @SerializedName("tryAgain")
    var tryAgain: String? = "_tryAgain",

    @Expose
    @SerializedName("closeAppNotActive")
    var closeAppNotActive: String? = "_closeAppNotActive",

    @Expose
    @SerializedName("appIsNotActive")
    var appIsNotActive: String? = "_appIsNotActive",

    @Expose
    @SerializedName("ok")
    var ok: String? = "_ok",

    @Expose
    @SerializedName("youAreAlreadyCheckedIn")
    var youAreAlreadyCheckedIn: String? = "_youAreAlreadyCheckedIn",

    @Expose
    @SerializedName("youAreAlreadyCheckedOut")
    var youAreAlreadyCheckedOut: String? = "_youAreAlreadyCheckedOut",

    @Expose
    @SerializedName("youCantCheckOutWhileYouWorkOnViolation")
    var youCantCheckOutWhileYouWorkOnViolation: String? = "_youCantCheckOutWhileYouWorkOnViolation",

    @Expose
    @SerializedName("pleaseSelectViolationType")
    var pleaseSelectViolationType: String? = "_pleaseSelectViolationType",

    @Expose
    @SerializedName("cancel")
    var cancel: String? = "_cancel",

    @Expose
    @SerializedName("noDataForList")
    var noDataForList: String? = "_noDataForList",

    @Expose
    @SerializedName("takePhotoOrVideo")
    var takePhotoOrVideo: String? = "_takePhotoOrVideo",

    @Expose
    @SerializedName("reset")
    var reset: String? = "_reset",

    @Expose
    @SerializedName("citizenName")
    var citizenName: String? = "_citizenName",

    @Expose
    @SerializedName("officerName")
    var officerName: String? = "_officerName",

    @Expose
    @SerializedName("accepted")
    var accepted: String? = "_accepted",

    @Expose
    @SerializedName("pending")
    var pending: String? = "_pending",

    @Expose
    @SerializedName("completed")
    var completed: String? = "_completed",

    @Expose
    @SerializedName("canceled")
    var canceled: String? = "_canceled",

    @Expose
    @SerializedName("predefinedQuestions")
    var predefinedQuestions: String? = "_predefinedQuestions",

    @Expose
    @SerializedName("chat")
    var chat: String? = "_chat",

    @Expose
    @SerializedName("driveTo")
    var driveTo: String? = "_driveTo",

    @Expose
    @SerializedName("callNow")
    var callNow: String? = "_callNow",

    @Expose
    @SerializedName("accept")
    var accept: String? = "_accept",

    @Expose
    @SerializedName("distance")
    var distance: String? = "_distance",

    @Expose
    @SerializedName("violationType")
    var violationType: String? = "_violationType",

    @Expose
    @SerializedName("violationSubType")
    var violationSubType: String? = "_violationSubType",

    @Expose
    @SerializedName("status")
    var status: String? = "_status",

    @Expose
    @SerializedName("title")
    var title: String? = "_title",

    @Expose
    @SerializedName("weather")
    var weather: String? = "_weather",

    @Expose
    @SerializedName("date")
    var date: String? = "_date",

    @Expose
    @SerializedName("location")
    var location: String? = "_location",

    @Expose
    @SerializedName("acceptedBy")
    var acceptedBy: String? = "_acceptedBy",

    @Expose
    @SerializedName("endViolation")
    var endViolation: String? = "_endViolation",

    @Expose
    @SerializedName("endEmergency")
    var endEmergency: String? = "_endEmergency",

    @Expose
    @SerializedName("cancelEmergency")
    var cancelEmergency: String? = "_cancelEmergency",

    @Expose
    @SerializedName("cancelViolation")
    var cancelViolation: String? = "_cancelViolation",

    @Expose
    @SerializedName("pleaseWriteTheReasonBelow")
    var pleaseWriteTheReasonBelow: String? = "_pleaseWriteTheReasonBelow",

    @Expose
    @SerializedName("theCaseHaseBeenClosed")
    var theCaseHaseBeenClosed: String? = "_theCaseHaseBeenClosed",

    @Expose
    @SerializedName("violationAcceptanceInboxMessage")
    var violationAcceptanceInboxMessage: String? = "_violationAcceptanceInboxMessage",

    @Expose
    @SerializedName("whoIs")
    var whoIs: String? = "_whoIs",

    @Expose
    @SerializedName("staySafe")
    var staySafe: String? = "_staySafe",

    @Expose
    @SerializedName("enterEmailToResetPasssword")
    var enterEmailToResetPasssword: String? = "_enterEmailToResetPasssword",

    @Expose
    @SerializedName("endCaseMessage")
    var endCaseMessage: String? = "_endCaseMessage",

    @Expose
    @SerializedName("yes")
    var yes: String? = "_yes",

    @Expose
    @SerializedName("youCantSendEmptyMessage")
    var youCantSendEmptyMessage: String? = "_youCantSendEmptyMessage",

    @Expose
    @SerializedName("messageForLoading")
    var messageForLoading: String? = "_messageForLoading",

    @Expose
    @SerializedName("nameForLoading")
    var nameForLoading: String? = "_nameForLoading",

    @Expose
    @SerializedName("youCantLogoutWhileYouHaveViolation")
    var youCantLogoutWhileYouHaveViolation: String? = "_youCantLogoutWhileYouHaveViolation",

    @Expose
    @SerializedName("checkOnMap")
    var checkOnMap: String? = "_checkOnMap",

    @Expose
    @SerializedName("pleaseEnableGps")
    var pleaseEnableGps: String? = "_pleaseEnableGps",

    @Expose
    @SerializedName("openCamera")
    var openCamera: String? = "_openCamera",

    @Expose
    @SerializedName("selectFromGallery")
    var selectFromGallery: String? = "_selectFromGallery",

    @Expose
    @SerializedName("pleaseFillTheMandatoryData")
    var pleaseFillTheMandatoryData: String? = "_pleaseFillTheMandatoryData",

    @Expose
    @SerializedName("gotIt")
    var gotIt: String? = "_gotIt",

    @Expose
    @SerializedName("note")
    var note: String? = "_note",

    @Expose
    @SerializedName("recordVideo")
    var recordVideo: String? = "_recordVideo",

    @Expose
    @SerializedName("takePicture")
    var takePicture: String? = "_takePicture",

    @Expose
    @SerializedName("wrongPassword")
    var wrongPassword: String? = "_wrongPassword",

    @Expose
    @SerializedName("versionNumber")
    var versionNumber: String? = "_versionNumber",

    @Expose
    @SerializedName("search")
    var search: String? = "_search",

    @Expose
    @SerializedName("searchOnViolation")
    var searchOnViolation: String? = "_searchOnViolation",

    @Expose
    @SerializedName("hi")
    var hi: String? = "_hi",

    @Expose
    @SerializedName("lenTrackingServiceIsWorkingForCitizen")
    var lenTrackingServiceIsWorkingForCitizen: String? = "_lenTrackingServiceIsWorkingForCitizen",

    @Expose
    @SerializedName("lenTrackingServiceIsWorking")
    var lenTrackingServiceIsWorking: String? = "_lenTrackingServiceIsWorking",

    @Expose
    @SerializedName("ignore")
    var ignore: String? = "_ignore",

    @Expose
    @SerializedName("openSettings")
    var openSettings: String? = "_openSettings",

    @Expose
    @SerializedName("locationAccessMessage")
    var locationAccessMessage: String? = "_locationAccessMessage",

    @Expose
    @SerializedName("violation")
    var violation: String? = "_violation",

    @Expose
    @SerializedName("emergency")
    var emergency: String? = "_emergency",

    @Expose
    @SerializedName("officerEmergency")
    var officerEmergency: String? = "_officerEmergency",

    @Expose
    @SerializedName("byPhoneNumber")
    var byPhoneNumber: String? = "_byPhoneNumber",

    @Expose
    @SerializedName("byEmail")
    var byEmail: String? = "_byEmail",

    @Expose
    @SerializedName("mustRestartApplicationToEnableTracking")
    var mustRestartApplicationToEnableTracking: String? = "_mustRestartApplicationToEnableTracking",

    @Expose
    @SerializedName("restartNow")
    var restartNow: String? = "_restartNow",

    @Expose
    @SerializedName("saveData")
    var saveData: String? = "_saveData",

    @Expose
    @SerializedName("edit")
    var edit: String? = "_edit",

    @Expose
    @SerializedName("logout")
    var logout: String? = "_logout",

    @Expose
    @SerializedName("profile")
    var profile: String? = "_profile",

    @Expose
    @SerializedName("cantEditThis")
    var cantEditThis: String? = "_cantEditThis",

    @Expose
    @SerializedName("lastMessageImage")
    var lastMessageImage: String? = "_lastMessageImage",

    @Expose
    @SerializedName("lastMessageVideo")
    var lastMessageVideo: String? = "_lastMessageVideo",

    @Expose
    @SerializedName("notificationMessageImage")
    var notificationMessageImage: String? = "_notificationMessageImage",

    @Expose
    @SerializedName("notificationMessageVideo")
    var notificationMessageVideo: String? = "_notificationMessageVideo",

    @Expose
    @SerializedName("asAnOfficerCantEditThis")
    var asAnOfficerCantEditThis: String? = "_asAnOfficerCantEditThis",

    @Expose
    @SerializedName("passwordNotMatch")
    var passwordNotMatch: String? = "_passwordNotMatch",

    @Expose
    @SerializedName("changeLanguageMessage")
    var changeLanguageMessage: String? = "_changeLanguageMessage",

    @Expose
    @SerializedName("changeLanguageTitle")
    var changeLanguageTitle: String? = "_changeLanguageTitle",

    @Expose
    @SerializedName("myChats")
    var myChats: String? = "_myChats",

    @Expose
    @SerializedName("typeMessageHere")
    var typeMessageHere: String? = "_typeMessageHere",

    @Expose
    @SerializedName("yourEmailMustNotUsedAsRelativeEmail")
    var yourEmailMustNotUsedAsRelativeEmail: String? = "_yourEmailMustNotUsedAsRelativeEmail",

    @Expose
    @SerializedName("thiEmailIsAlreadyRegisteredAsRelative")
    var thisEmailIsAlreadyRegisteredAsRelative: String? = "_thiEmailIsAlreadyRegisteredAsRelative",

    @Expose
    @SerializedName("officerEmergencyHasBeenClosed")
    var officerEmergencyHasBeenClosed: String? = "_officerEmergencyHasBeenClosed",

    @Expose
    @SerializedName("newViolationAlertTitle")
    var newViolationAlertTitle: String? = "_newViolationAlertTitle",

    @Expose
    @SerializedName("newViolationAlertMessage")
    var newViolationAlertMessage: String? = "_newViolationAlertMessage",

    @Expose
    @SerializedName("newOfficerEmergencyAlertTitle")
    var newOfficerEmergencyAlertTitle: String? = "_newOfficerEmergencyAlertTitle",

    @Expose
    @SerializedName("newOfficerEmergencyAlertMessage")
    var newOfficerEmergencyAlertMessage: String? = "_newOfficerEmergencyAlertMessage",

    @Expose
    @SerializedName("newCitizenEmergencyAlertTitle")
    var newCitizenEmergencyAlertTitle: String? = "_newCitizenEmergencyAlertTitle",

    @Expose
    @SerializedName("newCitizenEmergencyAlertMessage")
    var newCitizenEmergencyAlertMessage: String? = "_newCitizenEmergencyAlertMessage",

    @Expose
    @SerializedName("newRelativesAlertTitle")
    var newRelativesAlertTitle: String? = "_newRelativesAlertTitle",

    @Expose
    @SerializedName("newRelativesAlertMessage")
    var newRelativesAlertMessage: String? = "_newRelativesAlertMessage",

    @Expose
    @SerializedName("retypePassword")
    var retypePassword: String? = "_retypePassword",

    @Expose
    @SerializedName("newPassword")
    var newPassword: String? = "_newPassword",

    @Expose
    @SerializedName("currentPassword")
    var currentPassword: String? = "_currentPassword",

    @Expose
    @SerializedName("unidentified")
    var unidentified: String? = "_unidentified",

    @Expose
    @SerializedName("kiloMeters")
    var kiloMeters: String? = "_kiloMeters",

    @Expose
    @SerializedName("miles")
    var miles: String? = "_miles",

    @Expose
    @SerializedName("violationHistory")
    var violationHistory: String? = "_violationHistory",

    @Expose
    @SerializedName("alertHistory")
    var alertHistory: String? = "_alertHistory",

    @Expose
    @SerializedName("cameraAlertHistory")
    var cameraAlertHistory: String? = "_cameraAlertHistory",

    @Expose
    @SerializedName("fullAddress")
    var fullAddress: String? = "_fullAddress",

    @Expose
    @SerializedName("detectionType")
    var detectionType: String? = "_detectionType",

    @Expose
    @SerializedName("cameraDetails")
    var cameraDetails: String? = "_cameraDetails",

    @Expose
    @SerializedName("cameraLocation")
    var cameraLocation: String? = "_cameraLocation",

    @Expose
    @SerializedName("inboxEmptyTitle")
    var inboxEmptyTitle: String? = "_inboxEmptyTitle",

    @Expose
    @SerializedName("inboxEmptyMsg")
    var inboxEmptyMsg: String? = "_inboxEmptyMsg",

    @Expose
    @SerializedName("verifyEmail")
    var verifyEmail: String? = "_verifyEmail",

    @Expose
    @SerializedName("needStorageAndCameraAccessMessage")
    var needStorageAndCameraAccessMessage: String? = "_needStorageAndCameraAccessMessage",

    @Expose
    @SerializedName("ageName")
    var ageName: String? = "_ageName",

    @Expose
    @SerializedName("statusOnline")
    var statusOnline: String? = "_statusOnline",

    @Expose
    @SerializedName("statusOffline")
    var statusOffline: String? = "_statusOffline",

    @Expose
    @SerializedName("statusBusy")
    var statusBusy: String? = "_statusBusy",

    @Expose
    @SerializedName("appAlertsOnTopName")
    var appAlertsOnTopName: String? = "_appAlertsOnTopName",

    @Expose
    @SerializedName("officersGroupName")
    var officersGroupName: String? = "_officersGroupName",

    @Expose
    @SerializedName("officersChatTab")
    var officersChatTab: String? = "_officersChatTab",

    @Expose
    @SerializedName("citizensChatTab")
    var citizensChatTab: String? = "_citizensChatTab",

    @Expose
    @SerializedName("newOfficerJoinedTheCase")
    var newOfficerJoinedTheCase: String? = "_newOfficerJoinedTheCase",

    @Expose
    @SerializedName("youJoinedTheCase")
    var youJoinedTheCase: String? = "_youJoinedTheCase",

    @Expose
    @SerializedName("officerCaseStarted")
    var officerCaseStarted: String? = "_officerCaseStarted",

    @Expose
    @SerializedName("officerCaseEnded")
    var officerCaseEnded: String? = "_officerCaseEnded",

    @Expose
    @SerializedName("endViolationForm")
    var endViolationForm: String? = "_endViolationForm",

    @Expose
    @SerializedName("newCameraAlert")
    var newCameraAlert: String? = "_newCameraAlert",

    @Expose
    @SerializedName("newAlertCreated")
    var newAlertCreated: String? = "_newAlertCreated",


    /********************************************* Permissions  */
    @Expose
    @SerializedName("permissionNeeded")
    var permissionNeeded: String? = "_permissionNeeded",

    @Expose
    @SerializedName("appAppearOnTopPermission")
    var appAppearOnTopPermission: String? = "_appAppearOnTopPermission",

    @Expose
    @SerializedName("ignoreBatteryOptimizationPermission")
    var ignoreBatteryOptimizationPermission: String? = "_ignoreBatteryOptimizationPermission",

    /********************************************* Server Errors  */
    @Expose
    @SerializedName("invalidLoginDataError")
    var invalidLoginDataError: String? = "_invalidLoginDataError",

    @Expose
    @SerializedName("emailNotVerifiedError")
    var emailNotVerifiedError: String? = "_emailNotVerifiedError",

    @Expose
    @SerializedName("accountNotActiveError")
    var accountNotActiveError: String? = "_accountNotActiveError",

    @Expose
    @SerializedName("userAlreadyExistError")
    var userAlreadyExistError: String? = "_userAlreadyExistError",

    @Expose
    @SerializedName("signUpFailedError")
    var signUpFailedError: String? = "_signUpFailedError",

    @Expose
    @SerializedName("alreadyAcceptedError")
    var alreadyAcceptedError: String? = "_alreadyAcceptedError",

    @Expose
    @SerializedName("alreadyCanceledError")
    var alreadyCanceledError: String? = "_alreadyCanceledError",

    @Expose
    @SerializedName("alreadyCompletedError")
    var alreadyCompletedError: String? = "_alreadyCompletedError",

    /********************************************* Local Errors  */
    @Expose
    @SerializedName("connectionError")
    var connectionError: String? = "_connectionError"
) : Parcelable