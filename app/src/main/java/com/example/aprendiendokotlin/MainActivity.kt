package com.example.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma()
        comparaciones()
        sentenciaWhen()
    }
    private fun suma(){
        val a:Int=5+4
        Log.d("TAG","Resultado de suma: "+a )
    }
    private fun comparaciones(){
        val myVariable="Hola mundo en Kotlin"
        Log.d("V",myVariable)
        if(myVariable.length>10){
            Log.d("V","El tamaño de la cadena es ${myVariable.length}")
        }else{
            Log.d("V","Tamaño ,menor o igual a 10")
        }
    }
    private fun sentenciaWhen(){
        // Esta sentencia funciona como un switch
        val pais = "Mexico"
        when(pais.uppercase()){
            "ESPAÑA" -> {
                Log.d("V","El idioma es español")
            } "MEXICO"->{
                Log.d("V","Español latino")
            } else ->{
                Log.d("V","Este es como el default")
            }
        }

        val edad = 5
        when (edad) {
            1 -> {
                // Código para cuando la variable 'edad' es igual a 1
            }
            in 2..7 -> {
                // Código para cuando 'edad' está en el rango de 2 a 7 (inclusive)
            }
            else -> {
                // Código que se ejecutará si ninguna de las condiciones anteriores se cumple
            }
        }
    }
    private fun arrays(){

    }
    private fun ciclosFor(){

    }

}