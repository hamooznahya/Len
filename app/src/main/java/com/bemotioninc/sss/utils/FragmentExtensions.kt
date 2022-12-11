package com.bemotioninc.sss.utils

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.bemotioninc.sss.data.dto.ApisResponseError
import com.bemotioninc.sss.presentation.no_internet.NoInternetFragment
import com.bemotioninc.sss.presentation.no_internet.RefreshCallBack

const val INTERNET_TAG = "INTERNET_TAG"

fun Fragment.handleError(it: ApisResponseError, callback: (() -> Unit)? = null) {
    when (it) {
        ApisResponseError.ERROR_SERVER_ERROR, ApisResponseError.ERROR_INTERNAL_ERROR -> {
            when (it.errorCode) {
                //sessionTimeout
                "13" -> {
                    alert(
                        title = "", message = it.errorMessage
                    ) {
                        positiveButton("title_button_ok") {
                            requireActivity().finish()
                       //     LoginActivity.start(this@handleError)
                        }
                    }.show()
                }
                else -> {
                    alert(
                        title = "error", message = it.errorMessage
                    ) {
                        positiveButton("title_button_ok")
                    }.show()
                }
            }

        }
        ApisResponseError.ERROR_NO_INTERNET_CONNECTION, ApisResponseError.ERROR_TIME_OUT -> {
            val noInternetFragment = NoInternetFragment()
            noInternetFragment.refreshCallBack = object : RefreshCallBack {
                override fun onRefreshClicked() {
                    callback?.invoke()
                }

            }
            noInternetFragment.show(parentFragmentManager, INTERNET_TAG)
        }
    }

}

fun DialogFragment.setDialogFullScreen() {
    if (dialog != null) {
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
}


fun Fragment.hideKeyboard() {
    view?.let { activity?.hideKeyboard(it) }
}

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}