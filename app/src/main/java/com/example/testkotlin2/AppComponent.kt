package com.example.testkotlin2

import com.example.testkotlin2.module.DieselEngineModule
import com.example.testkotlin2.module.DriverModule
import com.example.testkotlin2.parts.thirdparty.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }
}