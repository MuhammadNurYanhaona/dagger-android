package com.example.testkotlin2.module

import com.example.testkotlin2.parts.thirdparty.Rims
import com.example.testkotlin2.parts.thirdparty.Tires
import com.example.testkotlin2.parts.thirdparty.Wheels
import dagger.Module
import dagger.Provides

@Module
abstract class WheelsModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideRims(): Rims {
            return Rims()
        }

        @JvmStatic
        @Provides
        fun provideTire(): Tires {
            val tire = Tires()
            tire.inflate()
            return tire
        }

        @JvmStatic
        @Provides
        fun provideWheel(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }
}