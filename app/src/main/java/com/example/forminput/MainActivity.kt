package com.example.forminput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   lateinit var txtnama: EditText
   lateinit var txtnpm: EditText
   lateinit var txtaspirasi: EditText

   lateinit var radiogroup: RadioGroup
   lateinit var btnaspirasi: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnaspirasi.setOnClickListener {
            if (!txtnama.text.toString().isEmpty()) {
                Toast.makeText(this, "Nama tidak boleh kosong!", Toast.LENGTH_SHORT).show()
            } else if (txtnpm.text.toString().length <= 8) {
                Toast.makeText(this, "NPM harus berjumlah 8!", Toast.LENGTH_SHORT).show()
            } else if (txtaspirasi.text.toString().length <= 30) {
                Toast.makeText(this, "Aspirasi minimal 30 karakter!", Toast.LENGTH_SHORT).show()
            } else if (radiogroup.checkedRadioButtonId == -1) {
                Toast.makeText(this, "Harus pilih prodi!", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, Beranda_Aspirasi::class.java)
                startActivity(intent)
            }
        }
    }

    private fun init() {
        txtnama = findViewById(R.id.txt_nama)
        txtnpm = findViewById(R.id.txt_npm)
        txtaspirasi = findViewById(R.id.txt_aspirasi)

        radiogroup = findViewById(R.id.radio_group)
        btnaspirasi = findViewById(R.id.btn_aspirasi)

    }
}