package com.sde.appwingclass3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<MaterialButton>(R.id.btnNxt)

        btn.setOnClickListener {
            Toast.makeText(this, "Guess Kariye", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OptionsActivity::class.java)
            startActivity(intent)
        }
    }
}