package com.moneytracking

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.moneytracking.di.appModule
import com.moneytracking.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, viewModelModule))
        }
        context = this
    }
}