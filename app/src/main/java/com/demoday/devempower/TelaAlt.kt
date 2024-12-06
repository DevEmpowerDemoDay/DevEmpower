package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun TelaAlt(navController: NavController) {
    val splashScreenDuration = 2000L // 2000 ms = 2 segundos

    val systemUiController = rememberSystemUiController()


    // define cores da barra de status e da barra de navegação
    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

//    LaunchedEffect(Unit) {
//        delay(splashScreenDuration)
//        navController.navigate("login") {
//            popUpTo("login") { inclusive = true }
//        }
//    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
            .clickable {
                navController.navigate("login")
            }

    ) {
        Text(
            text = "Bem vindo (a) ,",
            fontSize = 20.sp,
            color = indigo_dye,
            fontWeight = FontWeight.Bold,
            fontFamily = fontPoppins,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )


        Text(
            "Junte-se a nós na jornada de transformação para o " + "mundo da tecnologia. Aqui, você irá desenvolver suas soft " + "skills e se preparar para brilhar no mercado de trabalho.",
            fontSize = 14.sp,
            color = indigo_dye,
            fontFamily = fontPoppins,
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