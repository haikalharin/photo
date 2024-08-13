package com.haikal.photos.di

import com.haikal.photos.datasource.IRepository
import com.haikal.photos.datasource.RepositoryImpl
import com.haikal.photos.datasource.local.ILocalRepository
import com.haikal.photos.datasource.local.LocalRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<ILocalRepository> { LocalRepositoryImpl(get()) }
    factory<IRepository> { RepositoryImpl(get()) }
}