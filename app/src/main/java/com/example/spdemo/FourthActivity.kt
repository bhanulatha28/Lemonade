package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);
        setContentView(R.layout.activity_fourth)
        val text=findViewById<TextView>(R.id.emptyglass_text)
        val image=findViewById<ImageView>(R.id.emptyglass)
        val back=findViewById<ImageView>(R.id.backbtn)
        val settingBtn=findViewById<ImageView>(R.id.setting)
        val home_Btn=findViewById<ImageView>(R.id.homebtn)

        back.setOnClickListener{
            backArrow()
        }
        text.setOnClickListener {
            afterDrinkJuice()
        }
        image.setOnClickListener{
            afterDrinkJuice()
        }
        settingBtn.setOnClickListener {
            moveToSettingPage()
        }
home_Btn.setOnClickListener {
    moveToHomePage()
}
    }
    private fun afterDrinkJuice(){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun backArrow(){
        val intent = Intent(this,ThirdActivity::class.java)
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