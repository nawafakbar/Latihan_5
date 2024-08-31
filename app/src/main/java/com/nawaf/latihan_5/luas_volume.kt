package com.nawaf.latihan_5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class luas_volume : AppCompatActivity() {

    private lateinit var p : EditText
    private lateinit var l : EditText
    private lateinit var t : EditText
    private lateinit var luass : Button
    private lateinit var volum : Button
    private lateinit var hasilnya : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_volume)

        p = findViewById(R.id.panjang)
        l = findViewById(R.id.lebar)
        t = findViewById(R.id.lebar)
        luass = findViewById(R.id.luas)
        volum = findViewById(R.id.volume)
        hasilnya = findViewById(R.id.hasil)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        luass.setOnClickListener(){
            val panjang = p.text.toString().toDouble()
            val lebar = l.text.toString().toDouble()
            val tinggi = t.text.toString().toDouble()
            val hasilna = 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi))
            hasilnya.setText("Luas Permukaan = " + hasilna)
        }

        volum.setOnClickListener(){
            val panjang = p.text.toString().toDouble()
            val lebar = l.text.toString().toDouble()
            val tinggi = t.text.toString().toDouble()
            val hasilna = panjang * lebar * tinggi
            hasilnya.setText("Luas Permukaan = " + hasilna)
        }

    }
}