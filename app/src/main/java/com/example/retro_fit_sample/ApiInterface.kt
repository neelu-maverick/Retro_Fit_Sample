package com.example.retro_fit_sample

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/api/v1/venues/")
    suspend fun getVenues(): Response<Venues>
}
