package com.demoday.devempower

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

@Composable
fun Aula(navController: NavController) {
Column(
    modifier = Modifier
        .background(uranium_blue)
        .fillMaxSize()
) {  }
}

@Preview
@Composable
private fun AulaPreview() {
    DevEmpowerTheme {
        Aula(rememberNavController())

    }
}