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


)

