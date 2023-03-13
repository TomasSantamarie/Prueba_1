package com.example.prueba_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.prueba_1.databinding.ActivityPrimeroBinding

class primero : AppCompatActivity() {
    private lateinit var binding: ActivityPrimeroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimeroBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        binding.nombre.addTextChangedListener( object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                pelicula.setNombre(binding.nombre.text.toString())
            }
        })

        binding.duracion.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
            override fun afterTextChanged(s: Editable?) {
                pelicula.setDuracion(binding.duracion.text.toString().toInt())
            }
        })
        binding.seguir.setOnClickListener{
            var intent = Intent(this,segundo::class.java).apply {
                putExtra("nombre", pelicula.getNombre())
                putExtra("duracion", pelicula.getDuracion())
                putExtra("favorito", pelicula.getFavorito())
            }
            startActivity(intent)
        }
        binding.si.setOnClickListener{ pelicula.setFavorito(true)}
        binding.no.setOnClickListener{ pelicula.setFavorito(false)}
    }
}