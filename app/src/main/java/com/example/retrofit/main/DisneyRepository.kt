package com.example.retrofit.main

class DisneyRepository (
    private val api: DisneyApi
) {
    suspend fun getCharacters(): List<Data> {
        val response = api.getCharacters().data

        return api.getCharacters().data
    }

    private fun 
}