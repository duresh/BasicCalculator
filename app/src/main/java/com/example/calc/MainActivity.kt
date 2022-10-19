package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtAnswer:TextView
    lateinit var editNumber01: EditText
    lateinit var editNumber02:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtAnswer = findViewById(R.id.txtAnswer)
        editNumber01 = findViewById(R.id.editNumber01)
        editNumber02 = findViewById(R.id.editNumber02)

    }
    fun addNum(view:View){
        if(editNumber01.text.toString() == "" || editNumber02.text.toString()== ""){
            txtAnswer.text = "Please fill all the value fields"
        }
        else{
            var add = (editNumber01.text.toString().toDouble() + editNumber02.text.toString().toDouble())
            txtAnswer.text = "$add"
        }
        }



    fun subsNumbers(view: View){
        if(editNumber01.text.toString() == "" || editNumber02.text.toString()== ""){
            txtAnswer.text = "Please fill all the value fields"
        }
        else{
            var sub = (editNumber01.text.toString().toDouble()-editNumber02.text.toString().toDouble())
            txtAnswer.text = "$sub"
        }

    }

    fun multiNumbers(view: View){
        if(editNumber01.text.toString() == "" || editNumber02.text.toString()== ""){
            txtAnswer.text = "Please fill all the value fields"
        }
        else{
            var mult = (editNumber01.text.toString().toDouble()*editNumber02.text.toString().toDouble())
            txtAnswer.text = "$mult"
        }

    }

    fun diviNumbers(view: View){
        if(editNumber01.text.toString() == "" || editNumber02.text.toString()== ""){
            txtAnswer.text = "Please fill all the value fields"
        }
        else{
            var division = (editNumber01.text.toString().toDouble()/editNumber02.text.toString().toDouble())
            txtAnswer.text = "$division"
        }

    }

}