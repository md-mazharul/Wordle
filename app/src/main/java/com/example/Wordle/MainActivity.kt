package com.example.Wordle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fourLetterWords = listOf("java", "help", "rust", "four", "goat")

        fun guess1(myString: String){
            var guess2 =findViewById<EditText>(R.id.first_guess)
            var guess2_string = guess2.text.toString()
            var show_first_guess= findViewById<TextView>(R.id.first_guess_display)

            val myArray = Array(4) { index -> "Element ${index + 1}" }

            for (i in 0 until 4) {
                if (guess2_string[i] == myString[i]) {
                    myArray[i] = "O"
                } else {
                    myArray[i] = "X"
                }
            }
            val arrayAsString = myArray.joinToString("")
            var value1 = arrayAsString.toString()


            show_first_guess.setText(value1)

        }

        fun guess2(myString: String){

            var guess2 =findViewById<EditText>(R.id.secend_guess)
            var guess2_string = guess2.text.toString()
            val myArray = Array(4) { index -> "Element ${index + 1}" }

            for (i in 0 until 4) {
                if (guess2_string[i] == myString[i]) {
                    myArray[i] = "O"
                } else {
                    myArray[i] = "X"
                }
            }
            val arrayAsString = myArray.joinToString("")
            var value2 = arrayAsString.toString()

            var show_secend_guess= findViewById<TextView>(R.id.secend_guess_display)


            show_secend_guess.setText(value2)

        }
        fun guess3(myString: String){
            var guess3 =findViewById<EditText>(R.id.third_guess)
            var guess3_string = guess3.text.toString()
            val myArray = Array(4) { index -> "Element ${index + 1}" }

            for (i in 0 until 4) {
                if (guess3_string[i] == myString[i]) {
                    myArray[i] = "O"
                } else {
                    myArray[i] = "X"
                }
            }
            val arrayAsString = myArray.joinToString("")
            var value3 = arrayAsString.toString()

            var show_third_guess= findViewById<TextView>(R.id.third_guess_display)
            show_third_guess.setText(value3)
        }


        val button = findViewById<Button>(R.id.button);

        button.setOnClickListener {
            val randomWord1 = fourLetterWords.random()

            guess1(randomWord1)

            val randomWord2 = fourLetterWords.random()
            guess2(randomWord2)

            val randomWord3 = fourLetterWords.random()
            guess3(randomWord3)

        }

    }
}