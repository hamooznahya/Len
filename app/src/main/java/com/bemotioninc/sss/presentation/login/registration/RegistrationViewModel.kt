//package com.bemotioninc.sss.presentation.login.registration
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.bemotioninc.sss.utils.ResponseState
//import com.sellotion.store.domain.model.ForgetPassWord
//import com.sellotion.store.domain.usecase.login.ForgetPasswordUseCase
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.MutableSharedFlow
//import kotlinx.coroutines.flow.asSharedFlow
//import kotlinx.coroutines.flow.collectLatest
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class RegistrationViewModel
//@Inject constructor(private val forgetPasswordUseCase: ForgetPasswordUseCase)
//    : ViewModel() {
//
//
//    private val _forgetResult = MutableSharedFlow<ResponseState<ForgetPassWord>>()
//    val forgetResult = _forgetResult.asSharedFlow()
//
//    private val _events = MutableSharedFlow<Events>()
//    val events = _events.asSharedFlow()
//
//
//
//    private fun sendEvent(events: Events) {
//        viewModelScope.launch {
//            _events.emit(events)
//        }
//    }
//    fun onResetClicked(username: String, password: String) {
//        viewModelScope.launch {
//            forgetPasswordUseCase.execute(username, password).collectLatest {
//                _forgetResult.emit(it)
//            }
//        }
//    }
//
//    fun validateLogin(userName: String, mobile: String): Boolean {
//        var isValidForm = true
//        if (userName.length >= 4) {
//            sendEvent(Events.IsValidUsername(true))
//        } else {
//            isValidForm = false
//            sendEvent(Events.IsValidUsername(false))
//        }
//
//        if (mobile.length >= 4) {
//            sendEvent(Events.IsValidPassword(true))
//        } else {
//            isValidForm = false
//            sendEvent(Events.IsValidPassword(false))
//        }
//
//        return isValidForm
//    }
//
//
//    sealed class Events {
//        class IsValidUsername(val isValid: Boolean) : Events()
//        class IsValidPassword(val isValid: Boolean) : Events()
//
//    }
//}
