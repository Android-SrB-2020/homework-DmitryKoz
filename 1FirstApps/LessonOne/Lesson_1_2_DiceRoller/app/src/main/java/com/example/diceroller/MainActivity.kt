package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countButton: Button = findViewById(R.id.countUp_button)
        countButton.setOnClickListener {addCount()}
    }

    private fun rollDice(){

        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
      //  Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun addCount(){
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text != "Hello World!"){

            var resultInt = resultText.text.toString().toInt()

            if (resultInt <6 ){
                resultInt++
                resultText.text=resultInt.toString()
            }
        }
        else{
            resultText.text="1"
        }
    }

}
