package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val regb : Button = findViewById(R.id.regb)
        val nextb : Button = findViewById(R.id.nextb)
        regb.setOnClickListener {
            val Intent : Intent = Intent(this, registration::class.java)
            startActivity(Intent)
        }
        nextb.setOnClickListener {
            val Intent2 : Intent = Intent(this@Login, pinCode::class.java)
            startActivity(Intent2)
        }
    }
}{
}