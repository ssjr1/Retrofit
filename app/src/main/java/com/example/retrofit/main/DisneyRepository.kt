package com.example.retrofit.main

class DisneyRepository (
    private val api: DisneyApi
) {
    suspend fun getCharacters(): Result<List<DisneyCharacters>> {
        return try {
            val response = api.getCharacters().data
            val characters = response.map { convert(it) }
            Result.success(characters)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun convert(data: Data) : DisneyCharacters {
        return DisneyCharacters(
            name = data.name,
            image = data.imageUrl
        )

    }
}