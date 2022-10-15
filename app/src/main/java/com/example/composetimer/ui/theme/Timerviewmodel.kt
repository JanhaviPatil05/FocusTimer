package com.example.composetimer.ui.theme

import com.example.composetimer.data.Timeruistate
import androidx.lifecycle.ViewModel
//import com.example.composetimer.ui.theme.Timeruistate

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

    class Timerviewmodel : ViewModel() {
        val _uiState = MutableStateFlow(Timeruistate())
        val uiState: StateFlow<Timeruistate> = _uiState.asStateFlow()
        var totalTime: Long =45L *60L* 1000L

    }