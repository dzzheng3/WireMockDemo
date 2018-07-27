package com.example.nzheng2.wiremockdemo.di

import android.app.Application
import com.example.nzheng2.wiremockdemo.application.BitCoinApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class])
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance fun application(app:Application):Builder
        fun build():AppComponent
    }
    fun inject(app:BitCoinApp)

}