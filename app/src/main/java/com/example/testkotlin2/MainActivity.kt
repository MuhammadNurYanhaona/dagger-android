package com.example.testkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testkotlin2.module.DieselEngineModule
import com.example.testkotlin2.parts.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   @Inject lateinit var car1: Car
   @Inject lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent: ActivityComponent =
            ((application as TestApplication).getComponent())
                .getActivityComponentFactory().create(100, 50);

        activityComponent.inject(this)

        car1.drive()
        val userView: TextView = findViewById<TextView>(R.id.userDetail)
        userView.text = car1.drive()

        car2.drive()
        val carView: TextView = findViewById<TextView>(R.id.carDetail)
        carView.text = car2.drive()
    }
}