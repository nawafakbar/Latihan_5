package com.nawaf.latihan_5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konversi_suhu : AppCompatActivity() {

    private lateinit var angka : EditText
    private lateinit var fah : Button
    private lateinit var kel : Button
    private lateinit var rea : Button
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)

        angka = findViewById(R.id.input)
        fah = findViewById(R.id.fahrenheit)
        kel = findViewById(R.id.kelvin)
        rea = findViewById(R.id.reamur)
        hasil = findViewById(R.id.txthasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fah.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val hasilna = (9*nAngka/5) + 32
                hasil.setText(" " + hasilna + " F")
        }

        kel.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val hasilna = nAngka + 273.15
            hasil.setText(" " + hasilna + " K")
        }

        rea.setOnClickListener(){
            val nAngka = angka.text.toString().toDouble()
            val hasilna = (4*nAngka/5)
            hasil.setText(" " + hasilna + " R")
        }

    }
}