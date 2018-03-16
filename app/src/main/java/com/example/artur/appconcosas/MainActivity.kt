package com.example.artur.appconcosas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autodestruccion.setOnClickListener {
            object : CountDownTimer(10000, 1000){

                override fun onTick(millisUntilFinished: Long) {
                    segundos.setText(""+millisUntilFinished/1000)
                }

                override fun onFinish() {
                    val intent = Intent(this@MainActivity,Main2Activity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
