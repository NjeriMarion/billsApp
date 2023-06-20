package com.marion.billzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marion.billzapp.databinding.ActivityLoginBinding
import com.marion.billzapp.databinding.ActivityMainBinding

class login : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnlogin.setOnClickListener {
            clearErrors()
            validation()
        }
    }
    fun validation(){
        val name = binding.etusername.text.toString()
        val number = binding.password.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.tilusername.error = "Enter User name"
            error = true
        }
        if (number.isBlank()) {
            binding.password.error = "Enter password Number"
            error = true
        }
        if (!error) {
            binding.btnlogin.setOnClickListener {
                val intent = Intent(this, SignUpTwo::class.java)
                startActivity(intent)
            }
        }
    }
    fun clearErrors() {
        binding.tilusername.error = null
        binding.password.error = null
    }
}