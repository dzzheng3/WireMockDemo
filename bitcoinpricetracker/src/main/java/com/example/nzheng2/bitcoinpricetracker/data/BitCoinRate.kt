package com.example.nzheng2.bitcoinpricetracker.data

import com.google.auto.value.AutoValue
import com.google.gson.annotations.SerializedName

@AutoValue
abstract class BitCoinRate {
    @SerializedName("x")
    abstract fun timePoint(): Long

    @SerializedName("y")
    abstract fun rateValue(): Float

    @AutoValue.Builder
    interface Builder {
        fun timePoint(timePoint: Long): Builder
        fun rateValue(rateValue: Float): Builder
        fun build(): BitCoinRate
    }
}