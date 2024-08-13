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

    // Method to get a list of all users
    @Query("SELECT * FROM user ORDER BY id ASC")
    suspend fun getAllUsers(): List<User>

    @Query("DELETE FROM user WHERE username = :username")
    suspend fun deleteUserByUsername(username: String): Int
}