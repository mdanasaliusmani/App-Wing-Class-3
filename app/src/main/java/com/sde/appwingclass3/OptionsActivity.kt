package com.sde.appwingclass3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class OptionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_options)

        val ans = findViewById<TextView>(R.id.tvAns)
        val o1 = findViewById<MaterialButton>(R.id.btnOp1)
        val o2 = findViewById<MaterialButton>(R.id.btnOp2)
        val o3 = findViewById<MaterialButton>(R.id.btnOp3)
        val o4 = findViewById<MaterialButton>(R.id.btnOp4)

        o1.setOnClickListener {
            ans.text = "Are Haan bhai haan!"
        }

        o2.setOnClickListener {
            ans.text = "Aapko kyun batayen? Aap hamare hein kon?"
        }

        o3.setOnClickListener {
            ans.text = "Guess Kariye"
        }

        o4.setOnClickListener {
            ans.text = "Nhi!"
        }

    }
}