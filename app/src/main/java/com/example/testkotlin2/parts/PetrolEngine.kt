package com.example.testkotlin2.parts

import com.example.testkotlin2.parts.Engine
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") var horsePower: Int,
                                       @Named("engine capacity") var engineCapacity: Int): Engine {

    override fun getType(): String {
        return "Petrol (HP $horsePower Capacity $engineCapacity)"
    }

}