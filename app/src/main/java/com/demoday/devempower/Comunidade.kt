package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottomback),
                contentDescription = "Botão de voltar",
                modifier = Modifier
                    .offset(x = (-35).dp)
                    .size(35.68.dp)
                    .clickable { navController.navigate("home") }
            )

            Card(
                modifier = Modifier
                    .size(width = 230.dp, height = 40.dp)
                    .offset(x = (-20).dp),
                colors = CardDefaults.cardColors(containerColor = indigo_dye),
                shape = RoundedCornerShape(30.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "Comunidade",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.buttons ),
            contentDescription = "",
            modifier = Modifier.size(45.dp)
        )
        Card(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(width = 360.dp, height = 563.dp)
                .clip(RoundedCornerShape(30.dp)),
            colors = CardDefaults.cardColors(containerColor = indigo_dye),


            ) {
            Spacer(modifier = Modifier.padding(top = 10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Text(
                    "Comentários",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                   // fontFamily = fontPoppins,
                    color = Color(0xFFFFAEDFF7)
                )
            }
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("camera") },
            modifier = Modifier
                .size(width = 320.dp, height = 40.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
        ) {
            Row {
                Text(
                    "Fazer uma postagem ",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier.padding(top = 2.dp)
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Image(
                    painter = painterResource(id = R.drawable.arrow_blue),
                    contentDescription = "Enviar",
                    modifier = Modifier
                        .size(22.dp)
                        .offset(x = 20.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
        }



        Spacer(modifier = Modifier.padding(top = 20.dp))

        BottomBar(navController)


    }
}

@Composable
fun Camera(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottomback),
                contentDescription = "Botão de voltar",
                modifier = Modifier
                    .offset(x = (-35).dp)
                    .size(35.68.dp)
                    .clickable { navController.navigate("home") }
            )

            Card(
                modifier = Modifier
                    .size(width = 230.dp, height = 40.dp)
                    .offset(x = (-20).dp),
                colors = CardDefaults.cardColors(containerColor = indigo_dye),
                shape = RoundedCornerShape(30.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "Comunidade",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.buttons_meio ),
            contentDescription = "",
            modifier = Modifier.size(45.dp)
        )


        Text(
            "Lembre-se de Sorrir ",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
           // fontFamily = fontPoppins,
            color = pale_hex,
        )


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
        Camera(rememberNavController())
    }

}