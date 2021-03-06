package com.example.notbored.App.UI.UI

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.notbored.databinding.ActivitySuggestionsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Suggestions : AppCompatActivity() {

    private lateinit var binding: ActivitySuggestionsBinding
    private lateinit var participants: String
    private lateinit var type: String


    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySuggestionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        intent.extras?.run {
            type = getString("type").toString()
        }

        val sharedPref = getSharedPreferences("Participants", Context.MODE_PRIVATE)
        participants = sharedPref.getString("Participants", "0").toString()

        buscarSugerencia(type.toString())

        val btRelanzar = binding.btRelanzar

        btRelanzar.setOnClickListener {
            buscarSugerencia(type.toString())
        }
    }


    private fun buscarSugerencia(type: String){

        CoroutineScope(Dispatchers.IO).launch {

            val llamada = getRetroFit()
                .create(APIService::class.java)
                .getSuggestions("activity?type=$type&participants=$participants")

            val respuesta: SuggestionsResponse? = llamada.body()

            runOnUiThread {
                if(llamada.isSuccessful){

                    val nombreActividadACargar = respuesta?.activity.toString()
                    val tipoActividadACargar = respuesta?.type.toString()
                    var precioActividadACargar = respuesta?.price.toString()
                    val participantesACargar = respuesta?.participants.toString()

                    when (precioActividadACargar){
                        "0" -> precioActividadACargar = "Free"
                        "0.1","0.2" ,"0.3" -> precioActividadACargar= "Low"
                        "0.4","0.5" ,"0.6"  -> precioActividadACargar = "Medium"
                        else -> precioActividadACargar = "High"
                   }

                    binding.tvNombreActividad.text = nombreActividadACargar
                    binding.tvRespuestaPrecio.text = precioActividadACargar
                    binding.tvCantidadParticipantes.text = participantesACargar

                }
            }

        }
    }

    private fun getRetroFit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.boredapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }






}