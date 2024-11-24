package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun PerfilAtividade(navController: NavController) {

    Box(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 60.dp, start = 25.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.return_icon),
                    contentDescription = "botão de voltar",
                   modifier = Modifier
                        .size(40.dp)
                       .clickable { navController.navigate("home") }
               )
               Spacer(modifier = Modifier.padding(start = 100.dp))
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(vertical = 9.dp)
                        .size(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(white_smoke)
                        .padding(horizontal = 6.dp)

                )
            }

            Text("DevKotlin",
                fontSize = 36.sp,
                fontWeight = FontWeight.SemiBold,
                color = indigo_dye,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth())
            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = indigo_dye, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    modifier = Modifier
                        .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {
                        NavegaçãoPerfil(navController)

                    }
                    Spacer(modifier = Modifier.padding(top = 18.dp))
                    Text("Andamento",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = indigo_dye,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth())

                    Button(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(top = 10.dp)
                            .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()



                        ) {
                            Image(
                                painter = painterResource(R.drawable.testes_tecnicos_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier
                                    .size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text("Testes técnicos",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_testes_tecnicos),
                                    contentDescription = "Barra de progresso da atividade testes técnicos",
                                    modifier = Modifier
                                        .height(18.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    Button(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.live_coding_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier
                                    .size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text("Live Coding",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_live_coding),
                                    contentDescription = "Barra de progresso da atividade live Coding",
                                    modifier = Modifier
                                        .height(18.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(top = 18.dp))
                    Text("Finalizadas",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = indigo_dye,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            )
                    Button(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .padding(top=10.dp)
                            .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.orat_ria_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier
                                    .size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text("Oratória",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_100_),
                                    contentDescription = "Barra de progresso da oratória",
                                    modifier = Modifier
                                        .height(18.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button (
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                            .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults
                            .buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.pitch_perfeito_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier
                                    .size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text("Pitch perfeito",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_100_),
                                    contentDescription = "Barra de progresso da atividade Pitch Perfeito",
                                    modifier = Modifier
                                        .height(18.dp)
                                )
                            }
                        }
                    }

                }
            }
        }
    }


}

@Composable
fun PerfilDesempenho(navController: NavController) {
    var selected1 by remember { mutableStateOf(false) }
    var selected2 by remember { mutableStateOf(true) }
    var selected3 by remember { mutableStateOf(false) }
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        uranium_blue
    )
    Box(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize(),

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 88.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
//                Image(
//                    painter = painterResource(R.drawable.return_icon),
//                    contentDescription = "botão de voltar",
//                    modifier = Modifier
//                        .size(40.dp)
//                )
//                Spacer(modifier = Modifier.padding(start = 132.dp))
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(vertical = 13.dp)
                        .size(70.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(white_smoke)
                        .padding(horizontal = 10.dp)

                )
            }
            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                        .fillMaxSize()
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {
                        NavegaçãoPerfil(navController)

                    }
Spacer(modifier = Modifier.padding(top = 50.dp))
                    Text(
                        "MANUTENÇÃO",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = midnight_blue
                    )

                    Image(painter = painterResource(R.drawable.logo_with_text),
                        contentDescription = "",
                        modifier = Modifier
                            .size(200.dp))

                }
            }
        }
    }
}

@Composable
fun PerfilPontuação(navController: NavController) {
    var selected1 by remember { mutableStateOf(true) }
    var selected2 by remember { mutableStateOf(false) }
    var selected3 by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .paint(
                painter = painterResource(R.drawable.background_color),
                contentScale = ContentScale.Crop
            )
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 88.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
//                Image(
//                    painter = painterResource(R.drawable.return_icon),
//                    contentDescription = "botão de voltar",
//                    modifier = Modifier
//                        .size(40.dp)
//                )
//                Spacer(modifier = Modifier.padding(start = 132.dp))
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(vertical = 13.dp)
                        .size(70.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(white_smoke)
                        .padding(horizontal = 10.dp)

                )
            }
            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
                        .fillMaxSize()
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {
                        NavegaçãoPerfil(navController)

                    }
                    Spacer(modifier = Modifier.padding(top = 50.dp))
                    Text(
                        "MANUTENÇÃO",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = midnight_blue
                    )

                    Image(painter = painterResource(R.drawable.logo_with_text),
                        contentDescription = "",
                        modifier = Modifier
                            .size(200.dp))

                }
            }
        }
    }
}


@Composable
fun NavegaçãoPerfil(navController: NavController) {
    var selected1 by remember { mutableStateOf(false) }
    var selected2 by remember { mutableStateOf(false) }
    var selected3 by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .border(2.dp, color = Color.Transparent, shape = RoundedCornerShape(topStart = 20.dp))
            .background(if (selected1) midnight_blue else Color.Transparent)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topStart = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    selected1 = true
                    selected2 = false
                    selected3 = false
                    navController.navigate("perfil3")
                }
        ) {
            Image(
                painter = painterResource(R.drawable.pontuacao_icon),
                contentDescription = "pontuação",
                colorFilter = ColorFilter.tint(if (selected1) Color.White else midnight_blue),
                modifier = Modifier
                    .size(if (selected1) 30.dp else 25.dp)
            )
            Text(
                "pontuação",
                color = if (selected1) white_smoke else midnight_blue,
                fontSize = 13.sp
            )
        }
    }

    Box(
        modifier = Modifier
            .border(2.dp, color = Color.Transparent, shape = RoundedCornerShape(topStart = 20.dp))
            .background(if (selected2) midnight_blue else Color.Transparent)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topStart = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    selected1 = false
                    selected2 = true
                    selected3 = false
                    navController.navigate("perfil2")
                }
        ) {
            Image(
                painter = painterResource(R.drawable.desempenho_icon),
                contentDescription = "desempenho",
                colorFilter = ColorFilter.tint(if (selected2) Color.White else midnight_blue),
                modifier = Modifier
                    .size(if (selected2) 30.dp else 25.dp)
            )
            Text(
                "desempenho",
                color = if (selected2) white_smoke else midnight_blue,
                fontSize = 13.sp
            )
        }
    }

    Box(
        modifier = Modifier
            .border(2.dp, color = Color.Transparent, shape = RoundedCornerShape(topStart = 20.dp))
            .background(if (selected3) midnight_blue else Color.Transparent)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topStart = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    selected1 = false
                    selected2 = false
                    selected3 = true
                    navController.navigate("perfil1")
                }
        ) {
            Image(
                painter = painterResource(R.drawable.atividade_icon),
                contentDescription = "pontuação",
                colorFilter = ColorFilter.tint(if (selected3) Color.White else midnight_blue),
                modifier = Modifier
                    .size(if (selected3) 30.dp else 25.dp)
            )
            Text(
                "Atividades",
                color = if (selected3) white_smoke else midnight_blue,
                fontSize = 13.sp
            )
        }
    }
}

@Preview
@Composable
private fun perfilPreview() {
    DevEmpowerTheme {
        PerfilAtividade(rememberNavController())
    }
}

@Preview
@Composable
private fun perfil2Preview() {
    DevEmpowerTheme {
        PerfilDesempenho(rememberNavController())
    }
}