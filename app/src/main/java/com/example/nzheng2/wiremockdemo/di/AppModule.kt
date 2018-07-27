package com.example.nzheng2.wiremockdemo.di

import com.example.nzheng2.core.common.BaseUrlChangingInterceptor
import com.example.nzheng2.wiremockdemo.BuildConfig
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class AppModule {
    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(gson: Gson) {
        val builder = OkHttpClient.Builder()
        if(BuildConfig.DEBUG){
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(interceptor)
        }
        builder.addInterceptor(BaseUrlChangingInterceptor.get())
        return
    }
}