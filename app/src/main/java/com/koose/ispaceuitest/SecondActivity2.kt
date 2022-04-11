package com.koose.ispaceuitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)  }
    }
}