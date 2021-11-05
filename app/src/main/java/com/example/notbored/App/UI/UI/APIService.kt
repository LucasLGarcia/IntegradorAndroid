package com.example.notbored.App.UI.UI

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getSuggestions(@Url url:String): Response<SuggestionsResponse>

}