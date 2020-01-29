package com.example.iyad.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btnGetAge.setOnClickListener({
            val yearOfBirth:Int=etBirthYear.text.toString().toInt()
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            val age = currentYear - yearOfBirth
            tvAge.text = "Your age is "+age +" year"
        })*/
        fun clickGetAge(view: View){
            val yearOfBirth:Int=etBirthYear.text.toString().toInt()
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            val age = currentYear - yearOfBirth
            tvAge.text = "Your age is "+age +" year"
        }
    }
}
