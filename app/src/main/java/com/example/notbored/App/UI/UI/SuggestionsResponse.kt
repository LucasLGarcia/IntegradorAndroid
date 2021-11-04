package com.example.notbored.App.UI.UI

import com.google.gson.annotations.SerializedName

data class SuggestionsResponse (
    @SerializedName("activity") var activity : String,
    @SerializedName("type") var type: String,
    @SerializedName("participants") var participants: Int,
    @SerializedName("price") var price: Float
)
