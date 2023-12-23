package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);
        setContentView(R.layout.activity_third)
        val juiceimage=findViewById<ImageView>(R.id.juice_image)
        val jucicetext=findViewById<TextView>(R.id.glasstextjuice)
        val settingBtn=findViewById<ImageView>(R.id.setting)
        val back=findViewById<ImageView>(R.id.backbtn)
        val home_Btn=findViewById<ImageView>(R.id.homebtn)

        back.setOnClickListener{
            backArrow()
        }
        jucicetext.setOnClickListener {
            glassJuice()
        }
        juiceimage.setOnClickListener{
            glassJuice()
        }
        settingBtn.setOnClickListener{
            moveToSettingPage()
        }
        home_Btn.setOnClickListener {
            moveToHomePage()
        }

    }
    fun glassJuice(){
        var intent= Intent(this,FourthActivity::class.java)
        startActivity(intent)
    }
    fun backArrow(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)

    }
    private fun moveToSettingPage(){
        val intent= Intent(this,SettingActivity::class.java)
        startActivity(intent)

    }
    private fun moveToHomePage(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}