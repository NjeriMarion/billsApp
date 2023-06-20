package com.marion.billzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marion.billzapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsignup.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }

//    override fun onResume() {
//        super.onResume()
//        binding.btnsignup.setOnClickListener{
//            val intent = Intent(this, SignUp::class.java)
//            startActivity(intent)
//        }
//    }
}