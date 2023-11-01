package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnadd=findViewById<Button>(R.id.buttonadd)
        val btnminus=findViewById<Button>(R.id.buttonminus)
        val btnmul=findViewById<Button>(R.id.buttonmul)
        val btndiv=findViewById<Button>(R.id.buttondiv)

        val text1=findViewById<TextInputEditText>(R.id.inputText1)
        val text2=findViewById<TextInputEditText>(R.id.inputText2)
        val ans=findViewById<TextView>(R.id.tresult)
        btnadd.setOnClickListener{
            val input1=text1.text.toString().toInt()
            val input2=text2.text.toString().toInt()
            ans.text=(input1+input2).toString()
        }
        btnminus.setOnClickListener{
            val input1=text1.text.toString().toInt()
            val input2=text2.text.toString().toInt()
            ans.text=(input1-input2).toString()

        }
        btnmul.setOnClickListener{
            val input1=text1.text.toString().toInt()
            val input2=text2.text.toString().toInt()
            ans.text=(input1*input2).toString()

        }
        btndiv.setOnClickListener{
            val input1=text1.text.toString().toInt()
            val input2=text2.text.toString().toInt()
            ans.text=(input1/input2).toString()

        }
    }
}