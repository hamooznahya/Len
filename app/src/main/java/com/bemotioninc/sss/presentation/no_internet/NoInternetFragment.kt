package com.bemotioninc.sss.presentation.no_internet

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.bemotioninc.sss.utils.viewBinding
import com.bemotioninc.sss.R
import com.bemotioninc.sss.databinding.FragmentNoInternetBinding


class NoInternetFragment : DialogFragment(R.layout.fragment_no_internet) {
    var refreshCallBack: RefreshCallBack? = null
    private val binding by viewBinding { FragmentNoInternetBinding.bind(it) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isCancelable = false
        binding.btnRefresh.setOnClickListener {
            refreshCallBack?.onRefreshClicked()
            dismissAllowingStateLoss()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.let {
            it.window?.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            it.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
    }
}