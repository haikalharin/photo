package com.haikal.photos.datasource

import com.haikal.photos.datasource.local.model.User

interface IRepository {
    suspend fun insertUser(user: User)
    suspend fun getUser(email: String, password: String): User?
    suspend fun getAllUsers(): List<User>
    suspend fun deleteUser(user: User): Boolean
}