package com.bemotioninc.sss.utils

import android.animation.Animator
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import com.bemotioninc.sss.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

inline var View.isVisibleAnimation: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) visibleAnimation() else goneAnimation()
    }


fun View.visibleAnimation(): Int {
    val view = this
    view.animate().alpha(1.0f).translationY(0f).setInterpolator(DecelerateInterpolator(1.4f))
        .setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                view.visible()
            }

            override fun onAnimationEnd(animation: Animator?) {
                view.visible()
            }

            override fun onAnimationCancel(animation: Animator?) {}
            override fun onAnimationRepeat(animation: Animator?) {}
        })

    return View.VISIBLE
}


fun View.goneAnimation(): Int {
    val view = this
    view.animate().alpha(0f)
        .translationY((+view.height).toFloat())
        .setInterpolator(AccelerateInterpolator(1.4f))
        .setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {}
            override fun onAnimationEnd(animation: Animator) {
                view.gone()
            }

            override fun onAnimationCancel(animation: Animator) {}
            override fun onAnimationRepeat(animation: Animator) {}
        })

    return View.GONE
}


/*fun LoadingProgressbarBinding.show() {
    this.loadingContainer.visible()
}

fun LoadingProgressbarBinding.hide() {
    this.loadingContainer.gone()
}*/

fun String.toBoolean(): Boolean {
    return this == "1"
}

fun View.showSnackbar(msgId: Int, length: Int, actionMessageId: Int) {
    showSnackbar(msgId, length, actionMessageId) {}
}

fun View.showSnackbar(
    msgId: Int,
    length: Int,
    actionMessageId: Int,
    action: (View) -> Unit
) {
    showSnackbar(context.getString(msgId), length, context.getString(actionMessageId), action)
}

fun View.showSnackbar(
    msg: String,
    length: Int,
    actionMessage: CharSequence?,
    action: (View) -> Unit
) {
    val snackbar = Snackbar.make(this, msg, length)
    if (actionMessage != null) {
        snackbar.setAction(actionMessage) {
            action(this)
        }.show()
    }
}

fun ImageView.loadImage(
    url: String,
    error: Int = R.drawable.ic_launcher_background,
    requestOptions: RequestOptions? = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
) {
    val context = this.context
    val requestManager = Glide.with(context).load(url).thumbnail(0.25f)
    requestOptions?.let {
        requestManager.apply(requestOptions)
    }
    requestManager
        .error(error).into(this)
}



