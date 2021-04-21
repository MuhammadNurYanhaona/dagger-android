package com.example.testkotlin2

import android.app.Application
import com.example.testkotlin2.module.DriverModule

class TestApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Adeel Hosain"))
    }

    public fun getComponent() : AppComponent {
        return appComponent
    }
}