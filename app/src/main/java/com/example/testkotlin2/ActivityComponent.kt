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

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine capacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }
}