package com.miempresa.laboratorio14

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EjemploViewModel: ViewModel() {
    var mensaje by mutableStateOf("")

    fun conectDataCor(){
        viewModelScope.launch {
            conectData()
        }
    }
    suspend fun conectData(){
        mensaje = "Calculando ..."
        delay(8000)
        mensaje = "El nivel de radiacion es 100 rem "
    }
}