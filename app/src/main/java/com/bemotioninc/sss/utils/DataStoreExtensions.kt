package com.bemotioninc.sss.utils

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

private const val DATA_STORE_USER = "user_prefs.pb"
private const val DATA_STORE_APP_SETTINGS = "app_settings"

// Build the DataStore

//val Context.userPreferencesStore: DataStore<UserPreferences> by dataStore(
//    fileName = DATA_STORE_USER, serializer = UserPreferencesSerializer
//)


val Context.appPreferencesStore: DataStore<Preferences> by preferencesDataStore(
    name = DATA_STORE_APP_SETTINGS
)

