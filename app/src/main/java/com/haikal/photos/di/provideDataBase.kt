package com.haikal.photos.di

import android.app.Application
import androidx.room.Room
import com.haikal.photos.datasource.local.room.UserDao
import com.haikal.photos.datasource.local.room.UserDatabase
import org.koin.dsl.module

fun provideDataBase(application: Application): UserDatabase =
     Room.databaseBuilder(
        application,
        UserDatabase::class.java,
        "user_db"
    ).
     fallbackToDestructiveMigration().build()

fun provideDao(userDatabase: UserDatabase): UserDao = userDatabase.userDao()


val dataBaseModule= module {
    single { provideDataBase(get()) }
    single { provideDao(get()) }
}