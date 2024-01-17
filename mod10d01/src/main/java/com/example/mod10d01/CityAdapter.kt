package com.example.mod10d01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10d01.databinding.TemplateCityBinding

class CityAdapter(val arrayListCity : List<City>, val onCityClick : (city:City)-> Unit) : RecyclerView.Adapter<CityAdapter.CityVH>() {
    class CityVH(val binding : TemplateCityBinding) : ViewHolder(binding.root)
    //Créer le conteneur réutilisable grâce au TemplateCityBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityVH {
        //Récupérer un instance du binding et retourner une instance de CityVH
        val binding = TemplateCityBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        )
        return CityVH(binding)
    }

    override fun getItemCount() = arrayListCity.size

    override fun onBindViewHolder(holder: CityVH, position: Int) {
        holder.binding.city = arrayListCity[position]
        //Détecte l'appui sur un élément de liste (une ville)
        //et déclenche la fonction onCityClick qui a été définit par le constructeur
        holder.itemView.setOnClickListener { onCityClick(arrayListCity[position]) }
    }

}