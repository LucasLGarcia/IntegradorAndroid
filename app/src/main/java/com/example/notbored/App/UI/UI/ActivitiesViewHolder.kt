package com.example.notbored.App.UI.UI

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.databinding.ActivitiesItemBinding

class ActivitiesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding: ActivitiesItemBinding = ActivitiesItemBinding.bind(view)
    fun bind(activitieInPosition: String) {
        binding.tvActivities.text = activitieInPosition
    }
}