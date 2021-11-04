package com.example.notbored.App.UI.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.notbored.R

class AdapterActivities(private val activities: List<String>) : RecyclerView.Adapter<ActivitiesViewHolder>() {

    private lateinit var miListener: onItemClickListener


    interface onItemClickListener{

        fun onItemClick(position: Int)
    }


    fun setOnClickListener(listener: onItemClickListener){

        miListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ActivitiesViewHolder(layoutInflater.inflate(R.layout.activities_item, parent, false))
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        val activitieInPosition = activities[position]
        holder.bind(activitieInPosition)
    }

    override fun getItemCount() = activities.size

}