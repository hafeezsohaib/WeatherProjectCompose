package com.suheb.weatherappcompose.data.modeldto

import com.google.gson.annotations.SerializedName
import com.suheb.weatherappcompose.common.Constant
import com.suheb.weatherappcompose.domain.model.WeatherData


data class WeatherApiResponse (

  @SerializedName("cod"     ) var cod     : String?         = null,
  @SerializedName("message" ) var message : Int?            = null,
  @SerializedName("cnt"     ) var cnt     : Int?            = null,
  @SerializedName("list"    ) var list    : List<Data> = arrayListOf(),
  @SerializedName("city"    ) var city    : City?           = City()

)



  fun WeatherApiResponse.toDomainWeatherData(): WeatherData {

    return WeatherData(
      Constant.kelvinToCelsius(this.list[0].main?.feelsLike)?: "",
      Constant.kelvinToCelsius(this.list[0].main?.temp)?: "",
      this.city?.name?:""

    )
  }





