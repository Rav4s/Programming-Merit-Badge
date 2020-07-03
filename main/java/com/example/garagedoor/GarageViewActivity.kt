package com.example.garagedoor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class GarageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garage_view)

        val myWebView = WebView(this)
        setContentView(myWebView)
        myWebView.loadUrl("http://70.123.32.254:1234/sensor")

    }
}
