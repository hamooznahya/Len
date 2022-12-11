package com.bemotioninc.sss.utils

import com.bemotioninc.sss.data.dto.ApisResponseError


sealed class ResponseState<out T> {
    object Loading : ResponseState<Nothing>()
    data class Failure(val error: ApisResponseError) : ResponseState<Nothing>()
    data class Success<T>(val item: T) : ResponseState<T>()

}


