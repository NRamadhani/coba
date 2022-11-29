package com.example.nurramadhani_205410111_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.nurramadhani_205410111_uts.databinding.ActivityMainBinding
import kotlin.Double as Double1

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var inputjari : EditText
    lateinit var btnSend : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        btnSend = findViewById(R.id.btnLihatHasil)
        inputjari = findViewById(R.id.jari)
        btnSend.setOnClickListener{
            val name = binding.editNama.text
            val jari = inputjari.text.toString().toInt()
            var txtk = 2 * 3.14 * jari
            var txtl = 3.14 * jari * jari

            val showKedua = Intent(this, SecondActivity::class.java)
            showKedua.putExtra("name", name)
            showKedua.putExtra("nama", binding.editNama.text.toString())
            showKedua.putExtra("nim", binding.editNim.text.toString())
            showKedua.putExtra("keliling", txtk.toString())
            showKedua.putExtra("luas", txtl.toString())

            startActivity(showKedua)
        }
    }
}