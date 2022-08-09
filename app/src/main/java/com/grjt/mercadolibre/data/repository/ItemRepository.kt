package com.grjt.mercadolibre.data.repository

import com.grjt.mercadolibre.data.model.Items
import com.grjt.mercadolibre.data.network.ItemService

class ItemRepository {

    private val api = ItemService()

    suspend fun getItems(search: String): Items {
        return api.getItems(search)
    }

}