package com.walter.digivice.digimons.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.walter.digivice.digimons.domain.DigimonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class DigimonViewModel @Inject constructor(private val repository: DigimonRepository): ViewModel() {

    fun getDigimons(){
        viewModelScope.launch {
            val list = repository.getAllDigimons()
            list.size
        }
    }

}