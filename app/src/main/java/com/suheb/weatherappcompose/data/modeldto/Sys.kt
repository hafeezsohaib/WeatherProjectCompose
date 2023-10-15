package com.suheb.weatherappcompose.data.modeldto

import com.google.gson.annotations.SerializedName


data class Sys (

  @SerializedName("pod" ) var pod : String? = null

)