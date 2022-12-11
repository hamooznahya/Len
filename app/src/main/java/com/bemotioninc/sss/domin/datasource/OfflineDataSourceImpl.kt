package com.bemotioninc.sss.domin.datasource

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.bemotioninc.sss.data.datasource.OfflineDataSource
import com.bemotioninc.sss.domin.model.AppCaching
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class OfflineDataSourceImpl (private val appPreferencesStore: DataStore<Preferences>):OfflineDataSource{



    companion object{
        val primaryColor= stringPreferencesKey("primaryColor")
    }


    override suspend fun saveAppCaching(appCaching: AppCaching) {
        appPreferencesStore.edit { preferences ->
            preferences[primaryColor] = appCaching.primaryColor!!
        }
    }

    override fun getAppCaching(): Flow<AppCaching> {
        return appPreferencesStore.data.map { preferences ->
            AppCaching(
                primaryColor = preferences[primaryColor] ?: "#000000",

            )
        }
    }
}