package com.bemotioninc.sss.presentation.login.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bemotioninc.sss.R
import com.bemotioninc.sss.databinding.FragmentLoginBinding
import com.bemotioninc.sss.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val binding by viewBinding { FragmentLoginBinding.bind(requireView()) }
   // private val viewModel by viewModels<LoginViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        initListeners()
//        observeValues()
//        if(BuildConfig.DEBUG) {
//            binding.etUserName.setText("m.sweedan")
//            binding.etPassword.setText("123456789")
//        }
    }

//    private fun observeValues() {
//        viewModel.events.onEach {
//            when (it) {
//                is LoginViewModel.Events.IsValidPassword -> {
//                    binding.etPassword.error = it.isValid.toErrorOrNull()
//                }
//                is LoginViewModel.Events.IsValidUsername -> {
//                    binding.etUserName.error = it.isValid.toErrorOrNull()
//                }
//                LoginViewModel.Events.OpenHomePage -> {
//                  //  HomeActivity.start(requireActivity())
//                }
//            }
//
//        }.observeInLifecycle(viewLifecycleOwner)
//
//
//        viewModel.loginResult.onEach {
//            when (it) {
//                is ResponseState.Failure -> {
//                    binding.loading.hide()
//                    handleError(it.error) {
//                        onLoginClicked()
//                    }
//                }
//                ResponseState.Loading -> {
//                    binding.loading.show()
//                }
//                is ResponseState.Success -> {
//                    binding.loading.hide()
//                    val intent = Intent(requireActivity(), HomeActivity::class.java)
//                    startActivity(intent)
//                    requireActivity().finish()
//                }
//            }
//        }.observeInLifecycle(viewLifecycleOwner)
//    }

//    private fun initListeners() {
//        val watcher = object : MyTextWatcher() {
//            override fun afterTextChanged(s: Editable?) {
//                binding.btnLogin.isEnabled = viewModel.validateLogin(getUserName(), getPassword())
//            }
//        }
//        binding.etUserName.addTextChangedListener(watcher)
//        binding.etPassword.addTextChangedListener(watcher)
//
//        binding.btnLogin.setOnClickListener {
//            onLoginClicked()
//        }
//        binding.tvForgetPassword.setOnClickListener {
//            findNavController().navigate(ForgetPasswordFragmentDirections.actionToForGetPassWord())
//
//        }



  //  }

//    private fun onLoginClicked() {
//        viewModel.onLoginClicked(getUserName(), getPassword())
//    }
//
//    private fun getUserName() = binding.etUserName.text.toString().trim()
//    private fun getPassword() = binding.etPassword.text.toString().trim()


}