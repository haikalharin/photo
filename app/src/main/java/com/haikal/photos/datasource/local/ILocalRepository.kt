package com.haikal.photos.datasource.local

import com.haikal.photos.datasource.local.model.User

interface ILocalRepository {
    suspend fun insertUser(user: User)
    suspend fun getUser(email: String, password: String): User?
}