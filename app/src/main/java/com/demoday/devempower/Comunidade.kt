package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun ComunidadeSplash(navController: NavController) {
    val splashScreenDuration = 1000L // 1000 ms = 1.0 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("comentario") {
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
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo DevEmpower",
            modifier = Modifier
                .padding(top = 180.dp)
                .size(width = 270.dp, height = 185.dp)

        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            "Comunidade",
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium,
            color = indigo_dye
        )



        Image(
            modifier = Modifier.padding(top = 180.dp),
            painter = painterResource(R.drawable.logo_proa),
            contentDescription = "LogoDevEmpower"
        )
    }

}

@Composable
fun Comunidade(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 50.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottomback),
                contentDescription = "Botão de voltar",
                modifier = Modifier
                    .size(35.68.dp)
                    .clickable { navController.navigate("home") }
            )

            Spacer(modifier = Modifier.padding(end = 20.dp))

            Card(
                modifier = Modifier
                    .size(width = 230.dp, height = 40.dp),
                colors = CardDefaults.cardColors(containerColor = indigo_dye),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    "Comunidade",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 5.dp)
                )
            }
        }

        Spacer(modifier = Modifier.padding(top = 520.dp))
        
        var comentario by remember { mutableStateOf("") }
        Row {

            OutlinedTextField(
                value = comentario,
                onValueChange = { novoTexto -> comentario = novoTexto },
                label = {
                    Text(
                        "Fazer uma postagem ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
//                            fontFamily = fontPoppins,
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource( id = R.drawable.arrow_blue),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(27.dp).offset(x = 300.dp)
                    )
                },
                modifier = Modifier
                    .width(360.62.dp)
                    .height(70.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = indigo_dye,
                    unfocusedBorderColor = indigo_dye,
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White

                ),
                shape = RoundedCornerShape(15.dp),
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        BottomBar(navController)

    }
}

@Preview
@Composable
private fun Preview() {
    DevEmpowerTheme {
        ComunidadeSplash(rememberNavController())
    }

}

@Preview
@Composable
private fun ComunidadePreview() {
    DevEmpowerTheme {
        Comunidade(rememberNavController())
    }

}