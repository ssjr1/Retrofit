package com.example.retrofit.main

import androidx.lifecycle.ViewModel

class DisneyViewModel(
    private val repository: DisneyRepository = DisneyRepository(DisneyApi.instance)
) : ViewModel() {
    init {
        viewModelScope.launch {
            repository.getCharacters().onSuccess {
                println()
            }.onFailure {
                println()
            }
        }
    }
}