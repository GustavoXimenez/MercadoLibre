package com.grjt.mercadolibre.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.mercadolibre.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}