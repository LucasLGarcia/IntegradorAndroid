package com.example.notbored.App.UI.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityActivitiesBinding
import com.example.notbored.databinding.ActivityActivitiesHardBinding

class ActivitiesHard : AppCompatActivity() {
    private lateinit var binding: ActivityActivitiesHardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityActivitiesHardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val activities: List<String> = listOf(
            "Education", "Recreational", "Social", "Diy",
            "Charity", "Cooking", "Relaxation", "Music", "Busywork"
        )

        val btnEducation = binding.btEducation
        val btnRecreational = binding.btnRecreational
        val btnSocial = binding.btnSocial
        val btnDiy = binding.btnDiy
        val btnCharity = binding.btnCharity
        val btnCooking = binding.btnCooking
        val btnRelaxation = binding.btnRelaxation
        val btnMusic = binding.btnMusic
        val btnBusywork = binding.tvBusywork
        val btRandom = binding.btRandom

        btnEducation.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "education")
            }
            startActivity(intent)
        }
        btnRecreational.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "recreational")
            }
            startActivity(intent)
        }
        btnSocial.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "social")
            }
            startActivity(intent)
        }
        btnDiy.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "diy")
            }
            startActivity(intent)
        }
        btnCharity.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "Charity")
            }
            startActivity(intent)
        }
        btnCooking.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "cooking")
            }
            startActivity(intent)
        }
        btnRelaxation.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "relaxation")
            }
            startActivity(intent)
        }
        btnMusic.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "music")
            }
            startActivity(intent)
        }
        btnBusywork.setOnClickListener {
            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", "busywork")
            }
            startActivity(intent)
        }
        btRandom.setOnClickListener {


            var randomElement = activities.random()


            val intent = Intent(this, Suggestions::class.java).apply {
                putExtra("type", randomElement)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            startActivity(intent)
        }

    }
}