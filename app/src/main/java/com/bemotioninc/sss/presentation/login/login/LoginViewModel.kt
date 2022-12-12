//package com.bemotioninc.sss.presentation.login.login
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.bemotioninc.sss.utils.ResponseState
//import com.google.firebase.crashlytics.internal.model.CrashlyticsReport
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.MutableSharedFlow
//import kotlinx.coroutines.flow.asSharedFlow
//import kotlinx.coroutines.flow.collectLatest
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class LoginViewModel
//@Inject constructor(private val loginUseCase: LoginUseCase)
//    : ViewModel() {
//
//
//    private val _events = MutableSharedFlow<Events>()
//    val events = _events.asSharedFlow()
//
//
//    private val _loginResult = MutableSharedFlow<ResponseState<CrashlyticsReport.Session.User>>()
//    val loginResult = _loginResult.asSharedFlow()
//
//    fun onLoginClicked(username: String, password: String) {
//        viewModelScope.launch {
//            loginUseCase.execute(username, password).collectLatest {
//                _loginResult.emit(it)
//
//            }
//        }
//    }
//
//
//    fun validateLogin(userName: String, password: String): Boolean {
//        var isValidForm = true
//        if (userName.length >= 4) {
//            sendEvent(Events.IsValidUsername(true))
//        } else {
//            isValidForm = false
//            sendEvent(Events.IsValidUsername(false))
//        }
//
//        if (password.length >= 4) {
//            sendEvent(Events.IsValidPassword(true))
//        } else {
//            isValidForm = false
//            sendEvent(Events.IsValidPassword(false))
//        }
//
//        return isValidForm
//    }
//
//    private fun sendEvent(events: Events) {
//        viewModelScope.launch {
//            _events.emit(events)
//        }
//    }
//
//
//    sealed class Events {
//        class IsValidUsername(val isValid: Boolean) : Events()
//        class IsValidPassword(val isValid: Boolean) : Events()
//        object OpenHomePage : Events()
//    }
//}