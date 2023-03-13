package com.example.prueba_1

import java.io.Serializable

class Pelicula(private var nombre : String, private var duracion : Int, private var favorito : Boolean, private var ano : Int, private var director : String) :
    Serializable{


    fun getNombre(): String{
        return nombre
    }
    fun setNombre(nombre: String){
        this.nombre = nombre
    }
    fun getDuracion(): Int{
        return duracion
    }
    fun setDuracion(duracion : Int){
        this.duracion = duracion
    }
    fun getFavorito():Boolean{
        return favorito
    }
    fun setFavorito(favorito: Boolean){
        this.favorito = favorito
    }

    fun getAno():Int{
        return ano
    }
    fun setAno(ano: Int){
        this.ano = ano
    }
    fun getDirector():String{
        return director
    }
    fun setDirector(director: String){
        this.director = director
    }

    override fun toString(): String {
        return "[Pelicula ( Nombre $nombre, $duracion, $director, $ano, $favorito) ]"
    }
    }

class ListaPeliculas() : Serializable{
    private var lista= ArrayList<Pelicula>()

    fun encontrarPelicula(nombre: String): Int {
        for ((indice,item) in lista.withIndex()){
            if (item.getNombre().equals(nombre))
                return indice
        }
        return -1
    }

    fun deletePelicula(i:Int){
        lista.removeAt(i)
    }
    fun addPelicula(Pelicula : Pelicula){
        lista.add(Pelicula)
    }

    fun getLista(): ArrayList<Pelicula>{
        return lista
    }


}

var lista = ListaPeliculas()
var pelicula = Pelicula("",0,false,0,"")