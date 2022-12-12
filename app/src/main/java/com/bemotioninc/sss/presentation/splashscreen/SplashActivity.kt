package com.bemotioninc.sss.presentation.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bemotioninc.sss.MainActivity
import com.bemotioninc.sss.constants.Constants
import com.bemotioninc.sss.databinding.ActivitySplashBinding
import com.bemotioninc.sss.presentation.base.BaseActivity
import com.bemotioninc.sss.presentation.login.LoginActivity
import com.bemotioninc.sss.utils.ResponseState
import com.bemotioninc.sss.utils.observeInLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class SplashActivity : BaseActivity() {


    private lateinit var binding: ActivitySplashBinding

    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getLanguages()
        getObserve()
    }



    private fun getObserve() {
        viewModel.getCache.onEach {
            when (it) {
                is ResponseState.Success -> {
                    intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
                is ResponseState.Failure -> {
                    handleError(it.error) {
                    }
                    //     Log.d("AnyAny", it.error.toString())
                }
                is ResponseState.Loading -> {

                }
                else -> {

                }
            }
        }.observeInLifecycle(this)

        viewModel.getLanguages.onEach {
            when (it) {
                is ResponseState.Success -> {
                    for (i in 0..it.item.size) {
                        if (it.item[i].isDefault) {
                            viewModel.getCache(
                                Constants.Platforms.AndroidForBackEnd,
                                it.item[i].id.toString()
                            )
                            break
                        }
                    }

                }
                is ResponseState.Failure -> {
                    handleError(it.error) {

                    }
                    //     Log.d("AnyAny", it.error.toString())
                }
                is ResponseState.Loading -> {

                }
                else -> {

                }
            }
        }.observeInLifecycle(this)
    }
}