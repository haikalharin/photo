package com.haikal.photos.datasource.local

import com.haikal.photos.datasource.local.model.User
import com.haikal.photos.datasource.local.room.UserDao

class LocalRepositoryImpl(private val userDao: UserDao): ILocalRepository {
    override suspend fun insertUser(user: User) {
        return userDao.insertUser(user)
    }

    override suspend fun getUser(email: String, password: String): User? {
        return userDao.getUser(email, password)
    }
}