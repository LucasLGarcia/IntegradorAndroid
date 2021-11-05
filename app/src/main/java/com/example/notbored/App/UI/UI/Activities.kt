/*package com.example.notbored.App.UI.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.databinding.ActivityActivitiesBinding


class Activities : AppCompatActivity() {

    private lateinit var participants: Number

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
}*/