package com.example.prueba_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba_1.databinding.ActivityCuartoBinding

class cuarto : AppCompatActivity() {
    private lateinit var binding: ActivityCuartoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuartoBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        var listafavoritos = ListaPeliculas()

        for ((indice,item) in lista.getLista().withIndex()){
            if (item.getFavorito())
                listafavoritos.addPelicula(item)
        }

        binding.textView3.setText(listafavoritos.getLista().toString())

        
    }
}