package com.haikal.photos.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.haikal.photos.datasource.IRepository
import com.haikal.photos.datasource.local.model.User
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: IRepository) : ViewModel() {

    fun getUser(email: String, password: String, state: (LoginState) -> Unit) {
        state(LoginState.Loading)
        viewModelScope.launch {
            try {
                val user = repository.getUser(email, password)
                if (user != null) {
                    state(LoginState.Success(user))
                } else state(LoginState.Error("user not found"))
            } catch (e: Exception) {
                state(LoginState.Error("error login: ${e.message}"))
            }
        }
    }
}

sealed class LoginState {
    data object Loading: LoginState()
    class Success(val user: User): LoginState()
    class Error(val errMsg: String): LoginState()
}