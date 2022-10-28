package com.avss.mvvmwithdagger.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.avss.mvvmwithdagger.module.Product
import com.avss.mvvmwithdagger.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(val repository : ProductRepository) : ViewModel(){
    val productLiveData : LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}