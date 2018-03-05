package com.example.fuchsi.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener{

            // fire click button
            val userDOB:String=etDateOfBirth.text.toString()
            if (userDOB.toInt()==0){
                tvDisplay.text=" invalid input"

            }

            val year:Int= Calendar.getInstance().get(Calendar.YEAR)
            val myAge=year - userDOB.toInt()
            val avg =  myAge/userDOB.toInt()
            tvDisplay.text = "Your age is "+ myAge
        }

    }







}

