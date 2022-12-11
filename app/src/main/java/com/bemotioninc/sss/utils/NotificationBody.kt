package com.bemotioninc.sss.utils

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class NotificationBody(
    val orderId: String? = "",
    val titleContent: String? = "",
    val messageBody: String? = "",
    val sound: String? = "",
    val default: String? = "",
    val click_action: String? = "",
    val OrderDetails: String? = "",
)