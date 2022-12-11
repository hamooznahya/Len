package com.bemotioninc.sss.presentation.base

import android.content.Context
import android.icu.util.ULocale.getLanguage
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.bemotioninc.sss.R
import com.bemotioninc.sss.data.dto.ApisResponseError
import com.bemotioninc.sss.domin.datasource.OfflineDataSourceImpl
import com.bemotioninc.sss.presentation.no_internet.NoInternetFragment
import com.bemotioninc.sss.presentation.no_internet.RefreshCallBack
import com.bemotioninc.sss.utils.ContextUtils
import com.bemotioninc.sss.utils.alert
import com.bemotioninc.sss.utils.appPreferencesStore

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import java.util.*

@AndroidEntryPoint
open class BaseActivity : AppCompatActivity() {
    companion object {
        const val LOCATION_TAG = "LOCATION_TAG"
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        window.setBackgroundDrawable(null)
    }






  
    fun handleError(it: ApisResponseError, callback: (() -> Unit)? = null) {
        when (it) {
            ApisResponseError.ERROR_SERVER_ERROR, ApisResponseError.ERROR_INTERNAL_ERROR -> {
                alert(
                    title = "R.string.error", message = it.errorMessage
                ) {
                    positiveButton("R.string.title_button_ok")
                }.show()
            }
            ApisResponseError.ERROR_NO_INTERNET_CONNECTION, ApisResponseError.ERROR_TIME_OUT -> {
                showNoInternetDialog {
                    callback?.invoke()
                }
            }
        }
    }

    private fun showNoInternetDialog(callback: () -> Unit) {
        val noInternetFragment = NoInternetFragment()
        noInternetFragment.refreshCallBack = object : RefreshCallBack {
            override fun onRefreshClicked() {
                callback.invoke()
            }

        }
        noInternetFragment.show(supportFragmentManager, "INTERNET_TAG")
    }

    fun showDialog(
        errorMessage: String,
        errorTitle: String =" getString(R.string.error)",
        okayButtonTitle: String = "getString(R.string.title_button_ok)",
        okCallback: (() -> Unit)? = null
    ) {
        alert(
            title = errorTitle,
            message = errorMessage
        ) {
            positiveButton(okayButtonTitle) {
                okCallback?.invoke()
            }
        }.show()
    }
}