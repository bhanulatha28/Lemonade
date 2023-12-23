package com.example.spdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {

    var lemonTappedCount:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.yellow);
        setContentView(R.layout.activity_second)
        val text=findViewById<TextView>(R.id.lemontext)
        val image=findViewById<ImageView>(R.id.lemon_img)
        val back=findViewById<ImageView>(R.id.backbtn)
        val settingBtn=findViewById<ImageView>(R.id.setting)
        val home_Btn=findViewById<ImageView>(R.id.homebtn)


        text.setOnClickListener {
            lemonTappedCount+=1
            if (lemonTappedCount >= 3){
               squeezeFunction()
            }else{
                Toast.makeText(this, "Tap more", Toast.LENGTH_SHORT).show()
            }
        }
        image.setOnClickListener{
            lemonTappedCount+=1
            if (lemonTappedCount>=3){
               squeezeFunction()
            }
            else{

                Toast.makeText(this, "Keep squeezing!", Toast.LENGTH_SHORT).show()
            }
        }
        back.setOnClickListener{
            backArrow()
        }
        settingBtn.setOnClickListener{
            moveToSettingPage()
        }
        home_Btn.setOnClickListener {
            moveToHomePage()
        }

    }
    private fun squeezeFunction(){
        val intent = Intent(this,ThirdActivity::class.java)
        startActivity(intent)
        finish()

    }
   private fun backArrow(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()

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