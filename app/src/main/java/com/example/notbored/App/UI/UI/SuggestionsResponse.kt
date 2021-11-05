package com.example.notbored.App.UI.UI

import com.google.gson.annotations.SerializedName

data class SuggestionsResponse (
    @SerializedName("activity") var activity : String,
    @SerializedName("type") var type: String,
    @SerializedName("participants") var participants: Number,
    @SerializedName("price") var price: Number
)
