package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun Home(navController: NavController) {
    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        indigo_dye
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        //Menu suspenso
        Box(
            modifier = Modifier
                .padding(horizontal = 5.dp)
                .width(399.dp)
                .height(263.dp)
                .clip(RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp))
                .background(indigo_dye),
        ) {

            Column(
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                        .size(70.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(white_smoke)
                        .padding(horizontal = 14.dp)
                )

                Column(verticalArrangement = Arrangement.spacedBy((-15).dp)) {
                    Text("Bem vindo,", color = white_smoke, fontSize = 15.sp)
                    Text(
                        " Desenvolvedor",
                        color = white_smoke,
                        fontSize = 40.sp,
                        fontFamily = fontPoppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center
                    )
                }


            }
        }

        // Botão Acessar Perfil
        Button(
            onClick = { /* Ação do botão */ },
            modifier = Modifier
                .width(200.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(bright_blue)
                .align(Alignment.CenterHorizontally),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = bright_blue, contentColor = white_smoke)
        ) {
            Row(
                Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Acessar perfil",
                    color = white_smoke,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    fontFamily = fontPoppins
                )
                Spacer(modifier = Modifier.width(8.dp))

                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "Icon",
                    modifier = Modifier
                        .size(20.dp)
                        .border(2.dp, white_smoke, RoundedCornerShape(50.dp))
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Preview
@Composable
private fun BottomPreview() {
    DevEmpowerTheme {
        Home(rememberNavController())
    }
}