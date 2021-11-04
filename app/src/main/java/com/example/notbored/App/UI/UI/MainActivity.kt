package com.example.notbored.App.UI.UI

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val btnStart = binding.btnStart
        btnStart.setOnClickListener {

            val participantsValue = binding.etCantParticipantes.text

            val sharedPref = getSharedPreferences("Participants", Context.MODE_PRIVATE)

            val editSharedPref = sharedPref.edit()

            editSharedPref.putString("Participants", participantsValue.toString())

            editSharedPref.apply()

            val intent = Intent(this, Activities::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

        val termsAndConditions = binding.tvTerminosYCondiciones
        termsAndConditions.setOnClickListener {
            val intent = Intent(this, TermsAndConditions::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)


        }

    }

}