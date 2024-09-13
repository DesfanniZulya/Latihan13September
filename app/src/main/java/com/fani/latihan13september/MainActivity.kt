package com.fani.latihan13september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMi : Button
    private lateinit var btnTekom : Button
    private lateinit var btnPoto : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMi = findViewById(R.id.btnMI)
        btnTekom = findViewById(R.id.btnTekom)
        btnPoto = findViewById(R.id.btnPoto)

        btnMi.setOnClickListener(){
            val intent = Intent(this, Manajemen_Informatika::class.java)
            startActivity(intent)
        }
        btnTekom.setOnClickListener(){
            val intent = Intent(this, Teknik_Komputer::class.java)
            startActivity(intent)
        }
        btnPoto.setOnClickListener(){
            val intent = Intent(this, Galeri::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}