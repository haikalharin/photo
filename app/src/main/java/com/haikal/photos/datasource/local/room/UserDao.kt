package com.haikal.photos.datasource.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.haikal.photos.datasource.local.model.User

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM user WHERE email =:email AND password =:password")
    suspend fun getUser(email: String, password: String): User?
}