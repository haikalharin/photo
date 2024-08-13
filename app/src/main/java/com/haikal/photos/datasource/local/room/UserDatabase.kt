package com.haikal.photos.datasource.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.haikal.photos.datasource.local.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}