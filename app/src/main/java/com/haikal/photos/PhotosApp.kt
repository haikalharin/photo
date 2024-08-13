package com.haikal.photos

import android.app.Application
import com.haikal.photos.di.appModule
import com.haikal.photos.di.dataBaseModule
import com.haikal.photos.di.repositoryModule
import com.haikal.photos.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PhotosApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PhotosApp)
            modules(
                listOf(
                    dataBaseModule,
                    repositoryModule,
                    vmModule,
                    appModule,
                )
            )
        }
    }
}