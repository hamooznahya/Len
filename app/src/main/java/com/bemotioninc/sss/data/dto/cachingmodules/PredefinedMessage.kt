package com.bemotioninc.sss.data.dto.cachingmodules

import com.google.gson.annotations.SerializedName

data class PredefinedMessage(
    @SerializedName("id")
    var id: Long,

    @SerializedName("text")
    var text: String,

    @SerializedName("answers")
    var answersList: List<PredefinedMessage> =
        ArrayList<PredefinedMessage>()
)
