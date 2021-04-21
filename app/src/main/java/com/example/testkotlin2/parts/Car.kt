package com.example.testkotlin2.parts
import android.util.Log
import com.example.testkotlin2.parts.thirdparty.Driver
import com.example.testkotlin2.Remote
import com.example.testkotlin2.parts.thirdparty.Wheels
import com.example.testkotlin2.scope.PerActivity
import javax.inject.Inject

private const val TAG = "Car"

@PerActivity
class Car @Inject constructor(var driver: Driver,
                              var engine: Engine, var chassis: Chassis, var wheels: Wheels) {

    fun drive() : String {
        val message = (driver.name + " drives the " + chassis.getColor() + " car having "
                + engine.getType() + " engine")
        Log.d(TAG, "drive: the car")
        wheels.tires.inflate()
        return message
    }

    @Inject
    public fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}