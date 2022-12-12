package com.bemotioninc.sss.presentation.login.registration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bemotioninc.sss.R
import com.bemotioninc.sss.databinding.FragmentRegistrationBinding
import com.bemotioninc.sss.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment(R.layout.fragment_registration) {


    companion object {
        fun newInstance() = RegistrationFragment()
    }

    private val binding by viewBinding { FragmentRegistrationBinding.bind(requireView()) }
//    private val viewModel by viewModels<RegistrationViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//           initListeners()
//           observeValues()
    }

//    private fun observeValues() {
//        viewModel.events.onEach {
//            when (it) {
//                is RegistrationViewModel.Events.IsValidPassword -> {
//                    binding.etMobile.error = it.isValid.toErrorOrNull()
//                }
//                is RegistrationViewModel.Events.IsValidUsername -> {
//                    binding.etUserName.error = it.isValid.toErrorOrNull()
//                }
//            }
//
//        }.observeInLifecycle(viewLifecycleOwner)
//
//
//        viewModel.forgetResult.onEach {
//            when (it) {
//                is ResponseState.Failure -> {
//                    binding.loading.hide()
//                    handleError(it.error) {
//                        onResetClick()
//                    }
//                }
//                ResponseState.Loading -> {
//                    binding.loading.show()
//                }
//                is ResponseState.Success -> {
//                    binding.loading.hide()
//                    showResetPasswordDialog(it.item.newPassword)
//
//                }
//            }
//        }.observeInLifecycle(viewLifecycleOwner)
//    }


//    private fun showResetPasswordDialog(newPassword: String) {
//        val builder = AlertDialog.Builder(requireContext(), R.style.CustomAlertDialog)
//            .create()
//        val view = layoutInflater.inflate(R.layout.password_reset_alert_dialog_layout, null)
//        val button = view.findViewById<MaterialButton>(R.id.btnLogin)
//        val tvPassword = view.findViewById<TextView>(R.id.tvPassword)
//
//        tvPassword.text = getString(R.string.password_dialog_one) + " " + newPassword + " " + getString(
//            R.string.password_dialog_two
//        )
//        builder.setView(view)
//        button.setOnClickListener {
//            builder.dismiss()
//            findNavController().popBackStack()
//        }
//        builder.setCanceledOnTouchOutside(false)
//        builder.show()
//
//    }
////
//    private fun initListeners() {
//        val watcher = object : MyTextWatcher() {
//            override fun afterTextChanged(s: Editable?) {
//               binding.btnLogin.isEnabled = viewModel.validateLogin(getUserName(), getPassword())
//            }
//        }
//        binding.etUserName.addTextChangedListener(watcher)
//        binding.etMobile.addTextChangedListener(watcher)
//
//        binding.btnLogin.setOnClickListener {
//            onResetClick()
//        }
//        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
//    }
//
//    private fun onResetClick() {
//        viewModel.onResetClicked(getUserName(), getPassword())
//    }
//
//    private fun getUserName() = binding.etUserName.text.toString().trim()
//    private fun getPassword() = binding.etMobile.text.toString().trim()
}