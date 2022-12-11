package com.bemotioninc.sss.utils

import com.bemotioninc.sss.data.dto.ApisResponseError


/**
 * Generic class for holding success response, error response and loading status
 */
data class NetworkBoundRecourse<out T>(val status: Status, val data: T?, val error: ApisResponseError?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T?): NetworkBoundRecourse<T> {
            return NetworkBoundRecourse(Status.SUCCESS, data, null)
        }

        fun <T> error(error: ApisResponseError): NetworkBoundRecourse<T> {
            return NetworkBoundRecourse(Status.ERROR, null, error)
        }

        fun <T> loading(data: T? = null): NetworkBoundRecourse<T> {
            return NetworkBoundRecourse(Status.LOADING, data, null)
        }
    }

    override fun toString(): String {
        return "Result(status=$status, data=$data, error=$error)"
    }


}