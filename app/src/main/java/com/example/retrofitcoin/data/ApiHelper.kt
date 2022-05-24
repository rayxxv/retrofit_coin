package com.example.retrofitcoin.data

class ApiHelper(private val apiService: ApiService) {
    suspend fun getPopularMovies() = apiService.getAllPopularMovies()
}