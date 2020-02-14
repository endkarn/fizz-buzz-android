package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_fizz_buzz.*

class FizzBuzzActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fizz_buzz)

        val textResult = findViewById<TextView>(R.id.textResult)
        val textInput = findViewById<EditText>(R.id.textInput)
        val submitButton = findViewById<Button>(R.id.fb_button)

        submitButton.setOnClickListener {
            val number = textInput.text.toString()
            textResult.text = fizzbuzz(number.toInt())
        }

        mainButton.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java).apply {
                putExtra("name","Hello World")
            }
            startActivity(intent)
        }

    }


    fun fizzbuzz(number : Int): String {
        if (number % 3 == 0) {
            return "Fizz"
        }

        if (number % 5 == 0){
            return "Buzz"
        }

        if (number % 15 == 0){
            return "FizzBuzz"
        }
        return number.toString()
    }



}
