package com.example.testkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testkotlin2.parts.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject lateinit var car1: Car
   @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this work when modules do not take any initialization arguments
        // val component: CarComponent = DaggerCarComponent.create();

        // this is needed because a module now need runtime argument
        //val component: CarComponent = DaggerCarComponent.builder().dieselEngineModule(
        //        DieselEngineModule(100)).build()

        // this is needed when we use builder based assignment of runtime arguments
        // and not use application scoping of the component
        val activityComponent: ActivityComponent =
            DaggerActivityComponent.builder().horsePower(100)
                .engineCapacity(400)
                .appComponent((application as TestApplication).getComponent()).build()
        activityComponent.inject(this)

        car1.drive()
        val userView: TextView = findViewById<TextView>(R.id.userDetail)
        userView.text = car1.drive()

        car2.drive()
        val carView: TextView = findViewById<TextView>(R.id.carDetail)
        carView.text = car2.drive()
    }
}