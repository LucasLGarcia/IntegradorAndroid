package com.example.notbored.App.UI.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notbored.databinding.ActivityActivitiesBinding

class Activities : AppCompatActivity() {
    private lateinit var binding: ActivityActivitiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityActivitiesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val activities: List<String> = listOf(
            "Education", "Recreational", "Social", "Diy",
            "Charity", "Cooking", "Relaxation", "Music", "Busywork"
        )

        binding.rvActivities.layoutManager = LinearLayoutManager(this)
        binding.rvActivities.adapter = AdapterActivities(activities)


    }
}