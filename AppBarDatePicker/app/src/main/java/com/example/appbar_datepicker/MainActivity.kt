package com.example.appbar_datepicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        supportActionBar!!.title = "Testando menu"
        supportActionBar!!.subtitle = "Aprendendo a lidar com os menus"

        val tvHello = findViewById<TextView>(R.id.tv_hello)

        tvHello.setOnClickListener {
            val abrirDatePickerActivity =
                Intent(this, DatePickerActivity::class.java)

            startActivity(abrirDatePickerActivity)
        }
    }
}