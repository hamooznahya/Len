package com.bemotioninc.sss.utils


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import android.os.Build
import android.provider.Settings
import android.provider.Settings.Secure.*

/**
 * Listens to Gps (location service) which is highly important for tracking to work and then
 * responds with appropriate state specified in {@link GpsStatus}
 */
class GpsStatusLiveData(private val context: Context) : SingleLiveEvent<GpsStatus>() {

    private val gpsSwitchStateReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            checkGpsAndReact()
        }
    }

    override fun onInactive() = unregisterReceiver()

    override fun onActive() {
        registerReceiver()
        checkGpsAndReact()
    }

    private fun checkGpsAndReact() = if (isLocationEnabled()) {
        postValue(GpsStatus.Enabled)
    } else {
        postValue(GpsStatus.Disabled)
    }

    private fun isLocationEnabled() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        context.getSystemService(LocationManager::class.java)
            .isProviderEnabled(LocationManager.GPS_PROVIDER)
    } else {
        try {
            getInt(context.contentResolver, LOCATION_MODE) != LOCATION_MODE_OFF
        } catch (e: Settings.SettingNotFoundException) {
            false
        }
    }

    /**
     * Broadcast receiver to listen the Location button toggle state in Android.
     */
    private fun registerReceiver() = context.registerReceiver(
        gpsSwitchStateReceiver,
        IntentFilter(LocationManager.MODE_CHANGED_ACTION)
    )

    private fun unregisterReceiver() = context.unregisterReceiver(gpsSwitchStateReceiver)
}

sealed class GpsStatus {
    object Enabled : GpsStatus()
    object Disabled : GpsStatus()
}