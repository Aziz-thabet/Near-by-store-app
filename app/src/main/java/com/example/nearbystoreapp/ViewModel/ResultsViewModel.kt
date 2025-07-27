package com.example.nearbystoreapp.ViewModel

import androidx.lifecycle.LiveData
import com.example.nearbystoreapp.Domain.CategoryModel
import com.example.nearbystoreapp.Domain.StoreModel
import com.example.nearbystoreapp.Repository.ResultsRepository

class ResultsViewModel {
    private val repository= ResultsRepository()
    fun loadSubCategory(id: String): LiveData<MutableList<CategoryModel>>{
        return repository.loadSubCategory(id)
    }
    fun loadPopular(id: String): LiveData<MutableList<StoreModel>>{
        return repository.loadPopular(id)
    }
    fun loadNearest(id: String): LiveData<MutableList<StoreModel>>{
        return repository.loadNearest(id)
    }
}