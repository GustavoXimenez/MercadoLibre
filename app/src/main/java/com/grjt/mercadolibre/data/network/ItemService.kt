package com.grjt.mercadolibre.data.network

import com.grjt.mercadolibre.core.RetrofitHelper
import com.grjt.mercadolibre.data.model.Items
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ItemService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getItems(search: String): Items {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(ItemApiClient::class.java).getItemsSearch(search)
            response.body() ?: Items()
        }
    }

}