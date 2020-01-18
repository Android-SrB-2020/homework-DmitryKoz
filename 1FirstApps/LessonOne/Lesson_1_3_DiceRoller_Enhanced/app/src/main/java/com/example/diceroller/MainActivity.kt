//Question 1
//Which <ImageView> attribute indicates a source image that should be used only in Android Studio?
//android:srcCompat
//
//Question 2
//Which method changes the image resource for an ImageView in Kotlin code? xmx
//setImageResource()
//
//Question 3
//What does the lateinit keyword in a variable declaration indicate in Kotlin code?
//The variable is only initialized at app runtime.
//
//Question 4
//Which Gradle configuration indicates the most recent API level your app has been tested with?
//targetSdkVersion
//
//Question 5
//You see an import line in your code that starts with androidx. What does this mean?
//The class is part of the Android Jetpack libraries.



package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { disappearedImage() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

    }

    private fun getRandomDiceImage() : Int {
        val randomInt = Random().nextInt(6) + 1

        return when (randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())


    }


    private fun resetImage() : Int {
        val requiredInt = 7

        return when (requiredInt) {
            7 -> R.drawable.empty_dice

            else -> R.drawable.empty_dice
        }
    }

    private fun disappearedImage() {
        diceImage.setImageResource(resetImage())
        diceImage2.setImageResource(resetImage())
    }

}
