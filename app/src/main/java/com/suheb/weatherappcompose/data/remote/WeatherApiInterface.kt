package com.suheb.weatherappcompose.data.remote

import com.suheb.weatherappcompose.data.modeldto.WeatherApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiInterface {

//    @GET("api/json/v1/1/search.php")
//    suspend fun getSearchMealList(@Query("s") query: String): MealsDTO



    @GET("forecast")
    suspend fun getWeatherByLocation(@Query("lat") latitude:String, @Query("lon") longitude:String):WeatherApiResponse

}