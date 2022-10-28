package com.avss.mvvmwithdagger.di

import com.avss.mvvmwithdagger.retrofit.FakerApi
import com.avss.mvvmwithdagger.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    fun provideFakerApi(retrofit: Retrofit) : FakerApi {
        return retrofit.create(FakerApi::class.java)
    }
}