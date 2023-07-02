package com.example.retro_fit_sample

data class Venue(
    val category: String,
    val created_on: Int,
    val geolocation_degrees: String,
    val id: Int,
    val lat: Double,
    val lon: Double,
    val name: String,
    val promoted: Boolean
)