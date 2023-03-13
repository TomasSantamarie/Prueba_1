package com.example.prueba_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba_1.databinding.ActivityTerceroBinding

class tercero : AppCompatActivity() {
    private lateinit var binding: ActivityTerceroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceroBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        binding.textView2.setText(lista.getLista().toString())
        var bundle = intent.extras
        var aux2 = bundle?.getInt("aux")


        binding.atras.setOnClickListener{
            if (aux2 != null) {
                lista.deletePelicula(aux2-1)
            }

            var intent = Intent(this, segundo::class.java)
            startActivity(intent)
        }

        binding.nuevo.setOnClickListener{
            var intent =Intent(this, primero::class.java)
            startActivity(intent)
        }

        binding.seguir.setOnClickListener{
            var intent = Intent(this, cuarto::class.java)
            startActivity(intent)
        }
    }
}