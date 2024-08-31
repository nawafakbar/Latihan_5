package com.nawaf.latihan_5

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent


class MainActivity : AppCompatActivity() {

    private lateinit var konversi : Button
    private lateinit var diskonn : Button
    private lateinit var luasvolum : Button
    private lateinit var genapganjil : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        konversi = findViewById(R.id.latihan1)
        diskonn = findViewById(R.id.latihan2)
        luasvolum = findViewById(R.id.latihan3)
        genapganjil = findViewById(R.id.latihan4)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        konversi.setOnClickListener(){
            val intent = Intent(this, konversi_suhu::class.java)
            startActivity(intent)
        }

        diskonn.setOnClickListener(){
            val intent = Intent(this, diskon::class.java)
            startActivity(intent)
        }

        luasvolum.setOnClickListener(){
            val intent = Intent(this, luas_volume::class.java)
            startActivity(intent)
        }

        genapganjil.setOnClickListener(){
            val intent = Intent(this, ganjil_genap::class.java)
            startActivity(intent)
        }

    }
}