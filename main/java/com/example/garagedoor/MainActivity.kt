package com.example.garagedoor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openGarage(view: View) {
        val intent = Intent(this, GarageOpenActivity::class.java).apply {
        }
        startActivity(intent)
    }
        fun viewStatus(view: View) {
        val intent = Intent(this, GarageViewActivity::class.java).apply {
        }
        startActivity(intent)
    }
}