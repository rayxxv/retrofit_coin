package com.example.retrofitcoin.data

import com.example.retrofitcoin.data.pojo.PopularMoviesResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular")
    suspend fun getAllPopularMovies(): PopularMoviesResponse
}