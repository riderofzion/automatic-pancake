package com.example.mod9d01

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonVM(val pokemonDao: PokemonDao) : ViewModel() {
    val listPokemon = MutableLiveData<List<Pokemon>>()
    val pokemonIdAdded = MutableLiveData<Long>()
    fun fetchListPokemon(){
        viewModelScope.launch(Dispatchers.IO) {
            listPokemon.postValue(pokemonDao.getAll())
        }
    }
    fun addPokemon(pokemon: Pokemon) {
        viewModelScope.launch(Dispatchers.IO) {
            pokemonIdAdded.postValue(pokemonDao.insert(pokemon))
        }
    }

    companion object {
        val Factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(
                modelClass: Class<T>, extras: CreationExtras): T {
                // Depuis les extras de l'API ViewModelProviderFactory, on récupère l'instance d'app
                val application = checkNotNull(extras[APPLICATION_KEY])
                return PokemonVM(
                    pokemonDao = PokemonDB.getInstance(application).pokemonDao()
                )as T
            }
        }
    }
}