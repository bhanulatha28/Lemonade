package com.example.spdemo

import android.annotation.SuppressLint
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.coroutines.newFixedThreadPoolContext

class MainActivity : AppCompatActivity() {
    private val select="SELECT"
    private val squeeze="SQUEEZE"
    private val drink="DRINK"
    private val restart="RESTART"
    private val lemonadeState="LEMONADE_STATE"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);
        setContentView(R.layout.activity_main)
        val settingBtn=findViewById<ImageView>(R.id.setting)
        val lemonTree=findViewById<ImageView>(R.id.lemontree)
        val loginProfile=findViewById<ImageView>(R.id.profile_login)

        lemonTree.setOnClickListener{
            moveToSquezeLemonActivity()
        }
        val text = findViewById<TextView>(R.id.lemontext)
        text.setOnClickListener {
            moveToSquezeLemonActivity()
        }
        settingBtn.setOnClickListener{
            moveToSettingPage()
        }
        loginProfile.setOnClickListener {
            moveToProfileToLogin()
        }
    }

    private fun moveToProfileToLogin() {
        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun moveToSquezeLemonActivity(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
        finish()
    }
    private fun moveToSettingPage(){
        val intent= Intent(this,SettingActivity::class.java)
        startActivity(intent)
        finish()

    }


}