package com.walter.digivice.digimons.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.walter.digivice.digimons.domain.DigimonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@HiltViewModel
class DigimonViewModel @Inject constructor(private val repository: DigimonRepository) :
    ViewModel() {

    val state: StateFlow<DigimonsState> get() = _state
    private val _state = MutableStateFlow(DigimonsState())

    init {
        getDigimons()
    }

    fun getDigimons() {
        viewModelScope.launch {
            _state.update { it.copy(data = repository.getAllDigimons()) }
        }
    }

}