package com.demoday.devempower

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animate
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextField
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.flow.collectLatest


class Calendario {

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun calendarioDisponivel(navController: NavController) {
        var openDatePicker by remember { mutableStateOf(false) }
        var date by remember { mutableStateOf("") }

        // Usando LaunchedEffect para disparar a ação de abrir o calendário automaticamente
        LaunchedEffect(Unit) {
            openDatePicker = true
        }

        Column {

            if (date.isNotEmpty()) {
                Text(text = "Data selecionada: $date")
            }

            val state = rememberDatePickerState()

            AnimatedVisibility(visible = openDatePicker) {
                DatePickerDialog(
                    onDismissRequest = {
                        openDatePicker = false
                    },
                    confirmButton = {
                        Button(onClick = {
                            date = state.selectedDateMillis?.toString() ?: ""
                            openDatePicker = false
                            navController.navigate("mentores")
                        }) {
                            Text("Confirmar")
                        }
                    },
                    dismissButton = {
                        Button(onClick = {
                            openDatePicker = false
                            navController.navigate("home")
                        }) {
                            Text("Cancelar")
                        }
                    }
                ) {
                    DatePicker(state = state)
                }
            }
        }
    }}
