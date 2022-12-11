package com.bemotioninc.sss.presentation.no_internet

import java.io.Serializable

interface RefreshCallBack : Serializable {
    fun onRefreshClicked()
}