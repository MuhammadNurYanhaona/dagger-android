package com.example.testkotlin2

import com.example.testkotlin2.module.DieselEngineModule
import com.example.testkotlin2.module.PetrolEngineModule
import com.example.testkotlin2.module.WheelsModule
import com.example.testkotlin2.parts.Car
import com.example.testkotlin2.scope.PerActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun getCar() : Car
    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horse power") horsePower: Int,
                   @BindsInstance @Named("engine capacity") engineCapacity: Int):
                ActivityComponent
    }
}