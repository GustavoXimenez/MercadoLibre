package com.grjt.mercadolibre.domain

import com.grjt.mercadolibre.data.model.Items
import com.grjt.mercadolibre.data.repository.ItemRepository

class GetItemUseCase {

    private val repository = ItemRepository()

    suspend operator fun invoke(search: String):Items? {
        return repository.getItems(search)
    }

}