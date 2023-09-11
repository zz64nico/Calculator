package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var bt1 : Button
    lateinit var bt2 : Button
    lateinit var bt3 : Button
    lateinit var bt4 : Button
    lateinit var bt5 : Button
    lateinit var bt6 : Button
    lateinit var bt7 : Button
    lateinit var bt8 : Button
    lateinit var bt9 : Button
    lateinit var bt0 : Button
    lateinit var btc : Button
    lateinit var btplusminus : Button
    lateinit var firstNumber: String = ""
    //lateinit var secondNumber : Int


    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt1 = findViewById<Button>(R.id.buOne)
        bt2 = findViewById<Button>(R.id.buTwo)
        bt3 = findViewById<Button>(R.id.buThree)
        bt4 = findViewById<Button>(R.id.buFour)
        bt5 = findViewById<Button>(R.id.buFive)
        bt6 = findViewById<Button>(R.id.buSix)
        bt7 = findViewById<Button>(R.id.buSeven)
        bt8 = findViewById<Button>(R.id.buEight)
        bt9 = findViewById<Button>(R.id.buNine)
        bt0 = findViewById<Button>(R.id.buZero)
        btc = findViewById<Button>(R.id.buC)
        btplusminus = findViewById<Button>(R.id.buPlusMinus)




        text = findViewById<EditText>(R.id.editText)

        bt1.setOnClickListener(
            {
                firstNumber = firstNumber + "1"
                text.text = firstNumber
            },
        )
        bt2.setOnClickListener(
            {
                text.text = "2"
            }
        )
        bt3.setOnClickListener(
            {
                text.text = "3"
            }
        )
        bt4.setOnClickListener(
            {
                text.text = "4"
            }
        )
        bt5.setOnClickListener(
            {
                text.text = "5"
            }
        )
        bt6.setOnClickListener(
            {
                text.text = "6"
            }
        )
        bt7.setOnClickListener(
            {
                text.text = "7"
            }
        )
        bt8.setOnClickListener(
            {
                text.text = "8"
            }
        )

        bt9.setOnClickListener(
            {
                text.text = "9"
            }
        )
        bt0.setOnClickListener(
            {
                text.text = "0"
            }
        )
        btc.setOnClickListener(
            {
                text.text = "0"
            }
        )
        btplusminus.setOnClickListener(
            {
                if ()
                text.text = ""
            }
        )



    }

    fun numberEvent(view: View) {}
}


