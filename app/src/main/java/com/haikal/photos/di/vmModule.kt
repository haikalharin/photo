package com.haikal.photos.di

import com.haikal.photos.presentation.login.LoginViewModel
import com.haikal.photos.presentation.photos.PhotosViewModel
import com.haikal.photos.presentation.sign_up.SignUpViewModel
import com.haikal.photos.presentation.user.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module


val vmModule = module {
    viewModel { SignUpViewModel(get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { PhotosViewModel() }
    viewModel { UserViewModel(get()) }
}