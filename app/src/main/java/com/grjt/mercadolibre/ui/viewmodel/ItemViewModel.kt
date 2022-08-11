package com.grjt.mercadolibre.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grjt.mercadolibre.data.model.Items
import com.grjt.mercadolibre.domain.GetItemUseCase
import kotlinx.coroutines.launch

class ItemViewModel : ViewModel() {

    val itemModel = MutableLiveData<Items>()
    val getItemUseCase = GetItemUseCase()

    fun onSearch(search: String) {
        viewModelScope.launch {
            val result = getItemUseCase(search)
            if(result != null) {
                itemModel.postValue(result!!)
            }
        }
    }

}