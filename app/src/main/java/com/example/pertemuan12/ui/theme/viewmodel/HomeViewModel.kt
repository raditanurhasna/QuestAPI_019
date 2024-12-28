package com.example.pertemuan12.ui.theme.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertemuan12.model.Mahasiswa
import com.example.pertemuan12.repository.MahasiswaRepository
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.HttpException

sealed class HomeUiState {
    data class Success(val mahasiswa: List<Mahasiswa>):HomeUiState()
    object Error:HomeUiState()
    object Loading:HomeUiState()
}



