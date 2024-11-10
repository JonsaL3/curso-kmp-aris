package com.gonzaloracerogalan.cursokmparis

import android.app.Application
import com.gonzaloracerogalan.cursokmparis.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class CursoArisApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger(Level.INFO)
            androidContext(this@CursoArisApp)
        }
    }
}