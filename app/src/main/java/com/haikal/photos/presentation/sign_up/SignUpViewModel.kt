package com.haikal.photos.presentation.sign_up

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.haikal.photos.datasource.IRepository
import com.haikal.photos.datasource.local.model.User
import com.haikal.photos.datasource.local.room.UserDatabase
import kotlinx.coroutines.launch

class SignUpViewModel(private val repository: IRepository): ViewModel() {

    fun insertUser(user: User, state: (SignUpState) -> Unit) {
        state(SignUpState.Loading)
        viewModelScope.launch {
            try {
                repository.insertUser(user)
                state(SignUpState.Success("success sign up"))
            } catch (e: Exception) {
                state(SignUpState.Error("failed sign up: ${e.message}"))
            }
        }
    }
}

sealed class SignUpState {
    data object Loading: SignUpState()
    class Success(val msg: String): SignUpState()
    class Error(val errMsg: String): SignUpState()
}