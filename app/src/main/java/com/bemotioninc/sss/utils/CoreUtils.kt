package com.bemotioninc.sss.utils

import com.bemotioninc.sss.data.dto.ApisResponseError
import com.bemotioninc.sss.data.network.ServerException
import com.google.android.gms.tasks.Task
import com.google.gson.JsonSyntaxException
import com.google.gson.stream.MalformedJsonException
import kotlinx.coroutines.suspendCancellableCoroutine
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException
import javax.net.ssl.SSLHandshakeException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException


fun Throwable.mapToError(): ApisResponseError {
    return when (this) {
        is HttpException -> {
            (ApisResponseError.createServerError(this.code().toString()))
        }
        is ServerException -> {
            (ApisResponseError.createServerError(this.code.toString()))
        }
        is SocketTimeoutException -> {
            (ApisResponseError.ERROR_TIME_OUT)
        }
        is SSLHandshakeException -> {
            ApisResponseError.createGenericError("123", "SSLHandshakeException")
        }
        is MalformedJsonException, is IllegalArgumentException, is IllegalStateException, is JsonSyntaxException -> {
            (ApisResponseError.createGenericError("123", "ERROR_CANNOT_PARSE_JSON"))
        }
        is IOException -> {
            (ApisResponseError.ERROR_NO_INTERNET_CONNECTION)
        }
        is Exception -> {
            (ApisResponseError.createGenericError("123", this.message.orEmpty()))
        }

        else -> ApisResponseError.ERROR_INTERNAL_ERROR
    }
}
suspend fun <T> Task<T>.await(): T = suspendCancellableCoroutine { continuation ->
    addOnCompleteListener { task ->
        if (task.isSuccessful) {
            continuation.resume(task.result)
        } else {
            continuation.resumeWithException(
                task.exception ?: RuntimeException("Unknown task exception")
            )
        }
    }
}



