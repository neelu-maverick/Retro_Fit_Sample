package com.example.retro_fit_sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val venueApi = ApiService.getInstance().create(ApiInterface::class.java)


        GlobalScope.launch {
            val result = venueApi.getVenues()

            if (result.body() != null){
                Log.d("VENUE_DATA","onCreate: ${result.body()}")
            }
        }


    }
}