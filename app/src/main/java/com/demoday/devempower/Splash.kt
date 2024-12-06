package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavController) {
    val splashScreenDuration = 1500L // 1500 ms = 1.5 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("telaalt") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.logo_with_text),
            contentDescription = "Logo DevEmpower",
            modifier = Modifier
                .padding(top = 180.dp)
                .size(width = 300.dp, height = 200.dp)

        )



        Image(
            modifier = Modifier.padding(top = 180.dp),
            painter = painterResource(R.drawable.logo_proa),
            contentDescription = "LogoDevEmpower"
        )
    }
}