package com.bemotioninc.sss.presentation.login.landingpage


import android.os.Bundle
import android.view.View
import com.bemotioninc.sss.R
import com.bemotioninc.sss.databinding.FragmentLandingBinding
import com.bemotioninc.sss.databinding.FragmentLoginBinding
import com.bemotioninc.sss.presentation.login.login.LoginFragment
import com.bemotioninc.sss.utils.viewBinding
import com.sellotion.store.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LandingFragment : BaseFragment(R.layout.fragment_landing) {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val binding by viewBinding { FragmentLandingBinding.bind(requireView()) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}










