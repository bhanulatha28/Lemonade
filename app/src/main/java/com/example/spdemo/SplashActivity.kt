package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat

class SplashActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);

        setContentView(R.layout.activity_splash)
        this.handler =Handler()
            handler.postDelayed({
           val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
                finish()
        },2000)
    }
}