package com.example.retrofitcoin.data

class Repository(private val apiHelper: ApiHelper) {
    suspend fun getPopularMovies() = apiHelper.getPopularMovies()

}