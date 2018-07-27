package com.example.nzheng2.bitcoinpricetracker.data

import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory

@GsonTypeAdapterFactory
abstract class BitCoinPriceTypeFactory:TypeAdapterFactory{
//    fun create(): TypeAdapterFactory {
//        return AutoValueGson_BitCoinPriceTypeFactory()
//    }
}