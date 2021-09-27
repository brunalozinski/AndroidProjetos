package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalcular =
                findViewById<Button>(R.id.buttonCalcular)

        val editTextPeso =
                findViewById<EditText>(R.id.edit_text_peso)

        val editTextAltura =
                findViewById<EditText>(R.id.edit_text_altura)

        val textViewResultado =
                findViewById<TextView>(R.id.textViewResultado)

        buttonCalcular.setOnClickListener {
            textViewResultado.text =
                    calcularImc(
                            editTextPeso.text.toString().toInt(),
                    editTextAltura.text.toString().toDouble()).toString()
        }

    }
}