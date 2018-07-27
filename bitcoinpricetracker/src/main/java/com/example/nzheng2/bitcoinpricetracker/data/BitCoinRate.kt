package com.example.nzheng2.bitcoinpricetracker.data

import com.google.auto.value.AutoValue
import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.google.gson.annotations.SerializedName

data class BitCoinRate(

        @SerializedName("x")
        val timePoint: Long,

        @SerializedName("y")
        val rateValue: Float
)