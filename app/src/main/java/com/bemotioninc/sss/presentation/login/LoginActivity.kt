package com.bemotioninc.sss.presentation.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.bemotioninc.sss.R
import com.bemotioninc.sss.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : BaseActivity() {
    companion object {
        fun start(context: Activity) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivityForResult(intent,100)
        }
        fun start(fragment: Fragment) {
            val intent = Intent(fragment.requireContext(), LoginActivity::class.java)
            fragment.startActivityForResult(intent,100)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }
}