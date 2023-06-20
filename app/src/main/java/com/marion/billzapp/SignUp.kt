package com.marion.billzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marion.billzapp.databinding.ActivityMainBinding
import com.marion.billzapp.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding :ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        binding.btndone.setOnClickListener {
            clearErrors()
            validation()
        }
    }
    fun validation(){
        val name = binding.etname.text.toString()
        val number = binding.etnumber.text.toString()
        val email = binding.etemail.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.tilname.error = "Enter User name"
            error = true
        }
        if (number.isBlank()) {
            binding.tilnumber.error = "Enter phone Number"
            error = true
        }
        if (email.isBlank()) {
            binding.tilemail.error = "Enter E-mail"
            error = true
        }
        if (!error) {
            binding.btndone.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    fun clearErrors() {
        binding.tilname.error = null
        binding.tilnumber.error = null
        binding.tilemail.error = null
    }
}