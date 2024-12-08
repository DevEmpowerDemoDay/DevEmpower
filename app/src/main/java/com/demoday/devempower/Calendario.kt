package com.demoday.devempower

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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


import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale

class Calendario {

    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    fun calendarioDisponivel(navController: NavController) {


        var openDatePicker by remember { mutableStateOf(false) }
        var data by remember { mutableStateOf("") } // Variável para armazenar a data selecionada
        date = data
        // Usando LaunchedEffect para disparar a ação de abrir o calendário automaticamente
        LaunchedEffect(Unit) {
            openDatePicker = true
        }

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            if (date.isNotEmpty()) {
                Text(text = "Data selecionada: $date", color = Color.Black, fontFamily = fontPoppins)
            }

            // Estado do DatePicker
            val state = rememberDatePickerState()

            AnimatedVisibility(visible = openDatePicker) {
                DatePickerDialog(
                    onDismissRequest = {
                        openDatePicker = false
                    },
                    confirmButton = {
                        Button(
                            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye),
                            onClick = {
                                val selectedMillis = state.selectedDateMillis
                                data = if (selectedMillis != null) {
                                    val localDate = Instant.ofEpochMilli(selectedMillis)
                                        .atZone(ZoneId.systemDefault())
                                        .toLocalDate()
                                    localDate.format(
                                        DateTimeFormatter.ofPattern(
                                            "dd/MM/yyyy",
                                            Locale.getDefault()
                                        )
                                    )
                                } else {
                                    ""
                                }
                                openDatePicker = false
                                navController.navigate("mentores")
                            }
                        ) {
                            Text("Confirmar")
                        }
                    },
                    dismissButton = {
                        Button(
                            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye),
                            onClick = {
                                openDatePicker = false
                                navController.navigate("home")
                            }
                        ) {
                            Text("Cancelar")
                        }
                    }
                ) {
                    DatePicker(state = state)
                }
            }
        }
    }
}
