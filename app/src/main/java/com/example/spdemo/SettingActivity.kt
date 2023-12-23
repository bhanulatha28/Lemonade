package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val home_Btn=findViewById<ImageView>(R.id.homebtn)
        home_Btn.setOnClickListener {
            moveToHomePage()
        }

    }
    private fun moveToHomePage(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}