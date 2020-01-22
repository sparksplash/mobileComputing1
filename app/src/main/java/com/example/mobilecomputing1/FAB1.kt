package com.example.mobilecomputing1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FAB1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab1)

        val fab1_button = findViewById(R.id.button2) as Button
        fab1_button.setOnClickListener {
            Toast.makeText(this, "Current Activity",Toast.LENGTH_SHORT).show()
        }

        val fab2_button = findViewById(R.id.button3) as Button
        fab2_button.setOnClickListener {
            val intent = Intent(this, FAB2::class.java)
            startActivity(intent)
        }

        val fab3_button = findViewById(R.id.button4) as Button
        fab3_button.setOnClickListener {
            val intent = Intent(this, FAB3::class.java)
            startActivity(intent)
        }
    }
}
