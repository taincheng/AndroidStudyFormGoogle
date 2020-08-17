package com.example.addbuttonexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun countUp() {
        val rollText: TextView = findViewById(R.id.roll_text)
        val text = rollText.text
        if (text.length > 1) {
            rollText.text = "1"
        } else {
            if (!text.equals("6")) {
                rollText.text = (text.toString().toInt() + 1).toString()
            }
        }
    }

    private fun rollDice() {
        val rollText: TextView = findViewById(R.id.roll_text)
        rollText.text = (1..6).random().toString()
        Toast.makeText(this, "button click", Toast.LENGTH_SHORT).show()
    }
}