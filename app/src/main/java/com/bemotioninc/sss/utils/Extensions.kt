package com.bemotioninc.sss.utils

import android.content.res.Resources
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

//
//fun ImageView.showImageWhenLoaded(
//    url: String
//) {
//    val context = this.context
//    val requestManager = Glide.with(context).load(url)
//    this@showImageWhenLoaded.gone()
//    requestManager.addListener(object : RequestListener<Drawable> {
//        override fun onLoadFailed(
//            e: GlideException?,
//            model: Any?,
//            target: Target<Drawable>?,
//            isFirstResource: Boolean
//        ): Boolean {
//            this@showImageWhenLoaded.gone()
//            return true
//        }
//
//        override fun onResourceReady(
//            resource: Drawable?,
//            model: Any?,
//            target: Target<Drawable>?,
//            dataSource: DataSource?,
//            isFirstResource: Boolean
//        ): Boolean {
//            this@showImageWhenLoaded.visible()
//            this@showImageWhenLoaded.setImageDrawable(resource)
//            return true
//        }
//
//    }).submit()
//}
//
//
//fun TextView.setTextOrGone(text: String?) {
//    if (text.isNullOrEmpty())
//        this.gone()
//    this.text = text
//}


/**
 * Call this method (in onActivityCreated or later) to set
 * the width of the dialog to a percentage of the current
 * screen width.
 */
fun DialogFragment.setWidthPercent(percentage: Int) {
    val percent = percentage.toFloat() / 100
    val dm = Resources.getSystem().displayMetrics
    val rect = dm.run { Rect(0, 0, widthPixels, heightPixels) }
    val percentWidth = rect.width() * percent
    dialog?.window?.setLayout(percentWidth.toInt(), ViewGroup.LayoutParams.WRAP_CONTENT)
}


fun AppCompatActivity.checkSelfPermissionCompat(permission: String) =
    ActivityCompat.checkSelfPermission(this, permission)

fun AppCompatActivity.shouldShowRequestPermissionRationaleCompat(permission: String) =
    ActivityCompat.shouldShowRequestPermissionRationale(this, permission)

fun AppCompatActivity.requestPermissionsCompat(
    permissionsArray: Array<String>,
    requestCode: Int
) {
    ActivityCompat.requestPermissions(this, permissionsArray, requestCode)
}


fun Fragment.checkSelfPermissionCompat(permission: String) =
    ActivityCompat.checkSelfPermission(requireContext(), permission)

fun Fragment.shouldShowRequestPermissionRationaleCompat(permission: String) =
    ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), permission)

fun Fragment.requestPermissionsCompat(
    permissionsArray: Array<String>,
    requestCode: Int
) {
    ActivityCompat.requestPermissions(requireActivity(), permissionsArray, requestCode)
}


inline fun floatFor(
    from: Float, to: Float, step: Float, action: (Float) -> Unit
) {
    var v = from
    while (v <= to) {
        action(v)
        v += step
    }
}
