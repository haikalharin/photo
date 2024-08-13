package com.haikal.photos.presentation.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.haikal.photos.datasource.IRepository
import com.haikal.photos.datasource.local.model.User
import com.paem.core.data.remote.RequestState
import kotlinx.coroutines.launch

class UserViewModel(private val repository: IRepository) : ViewModel() {

    fun getAllUser(state: (UserState <List<User>>) -> Unit) {
        state(UserState.Loading)
        viewModelScope.launch {
            try {
                val listUser = repository.getAllUsers()
                if (listUser.isNotEmpty()) {
                    state(UserState.Success(listUser))
                } else state(UserState.Error("user not found"))
            } catch (e: Exception) {
                state(UserState.Error("error login: ${e.message}"))
            }
        }
    }

    fun deleteUser(user: User,state: (UserState<Boolean>) -> Unit) {
        state(UserState.Loading)
        viewModelScope.launch {
            try {

                val isDelete = repository.deleteUser(user = user)
                if (isDelete) {
                    state(UserState.Success(isDelete))
                } else state(UserState.Error("user not found"))
            } catch (e: Exception) {
                state(UserState.Error("error login: ${e.message}"))
            }
        }
    }
}

sealed class UserState<out T> {
    data object Loading: UserState<Nothing>()
    class Success<T>(val result: T) : UserState<T>()
    class Error(val errMsg: String): UserState<Nothing>()
}