package com.sellotion.store.presentation.base

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
open class BaseFragment(layoutId: Int) : Fragment(layoutId) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
