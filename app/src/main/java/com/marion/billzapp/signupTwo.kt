package com.marion.billzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marion.billzapp.databinding.ActivitySignUpBinding
import com.marion.billzapp.databinding.ActivitySignupTwoBinding

class SignUpTwo : AppCompatActivity() {
    lateinit var binding : ActivitySignupTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignupTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        binding.btdone.setOnClickListener {
            clearErrors()
            validation()
        }
    }
    fun validation(){
        val name = binding.etname.text.toString()
        val number = binding.tnumber.text.toString()
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
            binding.btdone.setOnClickListener {
                val intent = Intent(this, login::class.java)
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