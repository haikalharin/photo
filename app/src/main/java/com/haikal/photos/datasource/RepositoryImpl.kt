package com.haikal.photos.datasource

import com.haikal.photos.datasource.local.ILocalRepository
import com.haikal.photos.datasource.local.model.User

class RepositoryImpl(private val localRepository: ILocalRepository) : IRepository {
    override suspend fun insertUser(user: User) {
        return localRepository.insertUser(user)
    }

    override suspend fun getUser(email: String, password: String): User? {
        return localRepository.getUser(email, password)
    }

    override suspend fun getAllUsers(): List<User> {
        return localRepository.getAllUsers()
    }

    override suspend fun deleteUser(user: User): Boolean {

        return localRepository.deleteUser(user = user)
    }

}