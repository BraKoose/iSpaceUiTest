package com.koose.ispaceuitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<Button>(R.id.clickbutton)
        click.setOnClickListener {
            val intent = Intent(this,SecondActivity2::class.java)
            startActivity(intent)  }

    }





}