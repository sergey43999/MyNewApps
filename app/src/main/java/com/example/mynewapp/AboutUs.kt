package com.example.mynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutUs : AppCompatActivity() {
    private lateinit var home: ImageView
    private lateinit var contacts: ImageView
    private lateinit var aboutUs: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        home = findViewById(R.id.home)
        contacts = findViewById(R.id.contacts)
        aboutUs = findViewById(R.id.aboutUs)


        contacts.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}