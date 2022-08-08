package com.moneytracking

import android.app.Application
import com.moneytracking.di.appModule
import com.moneytracking.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, viewModelModule))
        }
    }
}