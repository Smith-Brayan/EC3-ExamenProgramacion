package com.example.pe.evaluacioncontinua3.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pe.evaluacioncontinua3.databinding.ActivityLoginBinding
import com.example.pe.evaluacioncontinua3.util.AppUtil

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }


    private fun setupListeners() {
        binding.butLogin.setOnClickListener {
            if (isCorrectUserAndPassword()) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isCorrectUserAndPassword(): Boolean {
        if (getEmail() == AppUtil.USER && getPassword() == AppUtil.PASSWORD) {
            return true
        }
        return false
    }

    private fun getEmail() = binding.eteEmail.text.toString()
    private fun getPassword() = binding.edtPassword.text.toString()
}