package com.avss.mvvmwithdagger

import android.app.Application
import com.avss.mvvmwithdagger.di.ApplicationComponent
import com.avss.mvvmwithdagger.di.DaggerApplicationComponent
import dagger.Component

class FakerApplication : Application() {
   lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}