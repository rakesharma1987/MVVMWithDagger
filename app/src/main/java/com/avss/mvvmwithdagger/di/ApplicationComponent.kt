package com.avss.mvvmwithdagger.di

import com.avss.mvvmwithdagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity : MainActivity)
}