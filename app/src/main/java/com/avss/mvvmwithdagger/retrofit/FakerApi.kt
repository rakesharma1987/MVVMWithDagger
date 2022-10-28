package com.avss.mvvmwithdagger.retrofit

import com.avss.mvvmwithdagger.module.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {
    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}