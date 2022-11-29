package com.example.nurramadhani_205410111_uts

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.nurramadhani_205410111_uts.databinding.ActivityHasilBinding

class SecondActivity  : AppCompatActivity() {
    private lateinit var binding : ActivityHasilBinding
    lateinit var txtk: TextView
    lateinit var txtl: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_hasil)
        setContentView(binding.root)
        txtk = findViewById(R.id.txtk)
        txtl = findViewById(R.id.txtl)

        val intentThatStartedThisActivity = intent
        val nama = intentThatStartedThisActivity.getStringExtra("nama").toString()
        val nim = intentThatStartedThisActivity.getStringExtra("nim").toString()
        val keliling = intent.getStringExtra("keliling").toString()
        val luas = intent.getStringExtra("luas").toString()
        binding.txtKedua.text = "<" + nama + "> . " + "<" + nim + ">"
        txtk.setText(keliling)
        txtl.setText(luas)

        binding.btnBack.setOnClickListener{
            val showMain = Intent(this, MainActivity::class.java)
            startActivity(showMain)
        }
    }
}

