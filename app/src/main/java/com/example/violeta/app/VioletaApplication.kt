package com.example.violeta.app

import android.app.Application
import com.example.violeta.di.AppModuleImpl
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class VioletaApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@VioletaApplication)
            modules(AppModuleImpl)
        }
    }
}