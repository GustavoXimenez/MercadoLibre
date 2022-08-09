package com.grjt.mercadolibre.data.network

import com.grjt.mercadolibre.data.model.Items
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface ItemApiClient {

    @GET("sites/MLA/search")
    suspend fun getItemsSearch(@Query("q") searchItem: String): Response<Items>

}