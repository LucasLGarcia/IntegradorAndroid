package com.example.notbored

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.notbored.App.UI.UI.APIService
import com.example.notbored.App.UI.UI.SuggestionsResponse
import com.example.notbored.databinding.ActivitySuggestionsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Suggestions : AppCompatActivity() {

    private lateinit var binding: ActivitySuggestionsBinding
    private lateinit var participants: String

    override fun onCreate(savedInstanceState: Bundle?) {


        binding = ActivitySuggestionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("Participants", Context.MODE_PRIVATE)

        participants = sharedPref.getString("Participants", "0").toString()




    }


    private fun buscarSugerencia(tipo: String){

        CoroutineScope(Dispatchers.IO).launch {

            val llamada = getRetroFit().create(APIService::class.java).getSuggestions("type=$tipo&participants=$participants")

            val respuesta: SuggestionsResponse? = llamada.body()

            runOnUiThread {
                if(llamada.isSuccessful){

                    val nombreActividadACargar = respuesta?.activity
                    val tipoActividadACargar = respuesta?.type
                    val precioActividadACargar = respuesta?.price
                    val participantesACargar = respuesta?.participants

                    binding.tvNombreActividad.text = nombreActividadACargar
                    binding.tvRespuestaPrecio.text = precioActividadACargar.toString()
                    binding.tvCantidadParticipantes.text = participantesACargar.toString()

                }
                else{
                    //val toast: Toast = Toast.makeText(, "No se encontró ninguna actividad que coincida con la busqueda", Toast.LENGTH_LONG)
                    //toast.show()
                }
            }

        }


    }


    private fun getRetroFit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://www.boredapi.com/api/activity?")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }






}