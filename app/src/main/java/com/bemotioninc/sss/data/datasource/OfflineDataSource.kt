package com.bemotioninc.sss.data.datasource

import com.bemotioninc.sss.domin.model.AppCaching
import kotlinx.coroutines.flow.Flow

interface OfflineDataSource {

    suspend fun saveAppCaching(appCaching: AppCaching)

    fun getAppCaching():Flow<AppCaching>

}