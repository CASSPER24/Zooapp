package com.ayesigyederrick.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BaboonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zoo_layout)
        title = "Baboon"
    }
}