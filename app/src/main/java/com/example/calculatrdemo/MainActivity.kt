package com.example.calculatrdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val etfst = findViewById<EditText>(R.id.etfirst)
//        val etsecond = findViewById<EditText>(R.id.etsecond)
//        val tv = findViewById<TextView>(R.id.tv)

    }


    fun plus (v: View){
        val etFirst:EditText = findViewById(R.id.etfirst)
        val etSecond:EditText = findViewById(R.id.etsecond)
        val tv :TextView = findViewById(R.id.tv)

        val num1 = etFirst.text.toString().toInt()
        val num2  = etSecond.text.toString().toInt()
        val res = num1 + num2
        tv.setText(res.toString())

    }
    fun minus (v: View){

        val etFirst:EditText = findViewById(R.id.etfirst)
        val etSecond:EditText = findViewById(R.id.etsecond)
        val tv :TextView = findViewById(R.id.tv)

        val num1 = etFirst.text.toString().toInt()
        val num2  = etSecond.text.toString().toInt()
        val res = num1 - num2
        tv.setText(res.toString())


    }
    fun multiply (v: View){

        val etFirst:EditText = findViewById(R.id.etfirst)
        val etSecond:EditText = findViewById(R.id.etsecond)
        val tv :TextView = findViewById(R.id.tv)

        val num1 = etFirst.text.toString().toInt()
        val num2  = etSecond.text.toString().toInt()
        val res = num1 * num2
        tv.setText(res.toString())

    } fun Divede (v: View){

        val etFirst:EditText = findViewById(R.id.etfirst)
        val etSecond:EditText = findViewById(R.id.etsecond)
        val tv :TextView = findViewById(R.id.tv)

        val num1 = etFirst.text.toString().toInt()
        val num2  = etSecond.text.toString().toInt()
        val res = num1 / num2
        tv.setText(res.toString())

    }


}