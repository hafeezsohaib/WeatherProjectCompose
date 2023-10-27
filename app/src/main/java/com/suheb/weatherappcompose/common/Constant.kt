package com.suheb.weatherappcompose.common

import android.icu.text.DecimalFormat

class Constant {

    companion object{
       val a:String="Dev3 code to Dev1...."
        val b:String="taken......"
        const val Base_URL="https://api.openweathermap.org/data/2.5/"

        fun kelvinToCelsius(temp: Float?): String? {
            val celsius=temp?.minus(273.15f)
            val decimalFormat = DecimalFormat("0")
            return decimalFormat.format(celsius)
        }

    }



}