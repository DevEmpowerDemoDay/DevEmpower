package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun TelaAlt(navController: NavController) {
    val splashScreenDuration = 2000L // 2000 ms = 2 segundos

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("login") {
            popUpTo("login") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.background_color),
                contentScale = ContentScale.Crop
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Bem vindo (a) ,",
            fontSize = 20.sp,
            color = indigo_dye,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )


        Text(
            "Junte-se a nós na jornada de transformação para o " + "mundo da tecnologia. Aqui, você irá desenvolver suas soft " + "skills e se preparar para brilhar no mercado de trackball.",
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier.padding(20.dp)
        )
        Image(
            painter = painterResource(R.drawable.woman_phone_asset),
            contentDescription = "Mulher com celular",
            modifier = Modifier
                .size(width = 346.dp, height = 346.dp)
                .padding(top = 29.dp)
        )
    }
}