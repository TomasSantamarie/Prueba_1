package com.example.prueba_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.example.prueba_1.databinding.ActivitySegundoBinding
import com.example.prueba_1.databinding.ActivityTerceroBinding

class segundo : AppCompatActivity() {
    private lateinit var binding: ActivitySegundoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundoBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var aux  = 0
        binding.director.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                pelicula.setDirector(binding.director.text.toString())
            }
        })

        binding.ano.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                pelicula.setAno(binding.ano.text.toString().toInt())
            }
        })

        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val duracion = bundle?.getInt("duracion")
        val favorito = bundle?.getBoolean("favorito")
        binding.seguir.setOnClickListener{


            lista.addPelicula(Pelicula(pelicula.getNombre(),pelicula.getDuracion(),
                pelicula.getFavorito(), pelicula.getAno(), pelicula.getDirector()))
            aux = lista.getLista().size
            var intent = Intent(this, tercero::class.java).apply {
                putExtra("nombre", nombre)
                putExtra("duracion", duracion)
                putExtra("favorito", favorito)
                putExtra("director", pelicula.getDirector())
                putExtra("ano", pelicula.getAno())
                putExtra("aux",aux)
            }
            startActivity(intent)
        }

        binding.atras.setOnClickListener{
            var intent = Intent(this, segundo::class.java)
            startActivity(intent)
        }
    }
}