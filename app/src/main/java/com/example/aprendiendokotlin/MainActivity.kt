package com.example.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma()
        variables()
    }
    private fun suma(){
        val a = 5+4
        Log.d("TAG","Resultado de suma: "+a )
    }
    private fun variables(){
        val myVariable="Hola mundo en Kotlin"
        Log.d("V",myVariable)
    }
}