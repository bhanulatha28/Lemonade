package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);
        setContentView(R.layout.activity_login)
        val home_Btn=findViewById<ImageView>(R.id.homebtn)
        val signIn=findViewById<TextView>(R.id.register)
//for move to home button in login page
        home_Btn.setOnClickListener {
            moveToHomePage()
        }
        //for move to sign in page if user clicks on the register button

    }

    private fun moveToHomePage(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}