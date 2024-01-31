package com.example.formfomulario

import android.media.MediaCodec.CryptoInfo.Pattern
import androidx.appcompat.app.AppCompatActivity
import com.example.formfomulario.databinding.ActivityMainBinding
import android.os.Bundle

import android.util.Patterns

import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*
        emailFocusListener()
        passwordFocusListener()
        phoneFocusListener()

        binding.submitButton.setOnClickListener{submitForm()}*/
    }


}