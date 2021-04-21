package com.example.testkotlin2

import android.app.Application

class TestApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    public fun getComponent() : AppComponent {
        return appComponent
    }
}