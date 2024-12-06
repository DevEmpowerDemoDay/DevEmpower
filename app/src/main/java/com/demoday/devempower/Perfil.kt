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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun TopBar(navController: NavController) {

    Box(
        modifier = Modifier
            .border(
                2.dp,
                color = Color.Transparent,
                shape = RoundedCornerShape(topStart = 20.dp)
            )
            .background(Color.Transparent)
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topStart = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    navController.navigate("perfil3")
                }) {
            Image(
                painter = painterResource(R.drawable.pontuacao_icon),
                contentDescription = "pontuação",
                colorFilter = ColorFilter.tint(indigo_dye),
                modifier = Modifier.size(25.dp)
            )
            Text(
                "Pontuação",
                color = indigo_dye,
                fontSize = 13.sp,
                fontFamily = fontPoppins
            )
        }
    }

    Box(modifier = Modifier
        .background(midnight_blue)
        .drawBehind {
            val borderWidth = 2.dp.toPx()
            drawRect(
                color = indigo_dye,
                topLeft = androidx.compose.ui.geometry.Offset(
                    0f, size.height - borderWidth
                ),
                size = androidx.compose.ui.geometry.Size(
                    size.width, borderWidth
                )
            )
        }
        .border(
            2.dp,
            color = Color.Transparent,
            shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
        )) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 20.dp))
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    navController.navigate("perfil2")
                }) {
            Image(
                painter = painterResource(R.drawable.informa__es_icon),
                contentDescription = "informações",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier.size(30.dp)
            )
            Text(
                "Informações",
                color = white_smoke,
                fontSize = 13.sp,
                fontFamily = fontPoppins
            )
        }
    }

    Box(modifier = Modifier
        .clip(RoundedCornerShape(topEnd = 20.dp))
        .background(Color.Transparent)
        .drawBehind {
            val borderWidth = 2.dp.toPx()
            drawRect(
                color = indigo_dye,
                topLeft = androidx.compose.ui.geometry.Offset(
                    0f, size.height - borderWidth
                ),
                size = androidx.compose.ui.geometry.Size(
                    size.width, borderWidth
                )
            )
        }
        .border(
            2.dp,
            color = Color.Transparent,
            shape = RoundedCornerShape(topEnd = 20.dp)
        )) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 20.dp))
                .border(
                    2.dp,
                    color = Color.Transparent,
                    shape = RoundedCornerShape(topEnd = 20.dp)
                )
                .size(height = 97.dp, width = 118.dp)
                .clickable {
                    navController.navigate("perfil1")
                }) {
            Image(
                painter = painterResource(R.drawable.atividade_icon),
                contentDescription = "atidades",
                colorFilter = ColorFilter.tint(indigo_dye),
                modifier = Modifier.size(25.dp)
            )
            Text(
                "Atividades",
                color = indigo_dye,
                fontSize = 13.sp,
                fontFamily = fontPoppins
            )
        }
    }

}

@Composable
fun PerfilAtividade(navController: NavController) {
    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )
    Box(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
//                Image(
//                    painter = painterResource(R.drawable.return_icon),
//                    contentDescription = "botão de voltar",
//                   modifier = Modifier
//                        .size(40.dp)
//                       .clickable { navController.navigate("home") }
//               )
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

            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = indigo_dye, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    modifier = Modifier
                        .border(
                            2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)
                        )
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .border(
                                    2.dp,
                                    color = Color.Transparent,
                                    shape = RoundedCornerShape(topStart = 20.dp)
                                )
                                .background(Color.Transparent)
                        ) {
                            Column(verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .border(
                                        2.dp,
                                        color = Color.Transparent,
                                        shape = RoundedCornerShape(topStart = 20.dp)
                                    )
                                    .size(height = 97.dp, width = 118.dp)
                                    .clickable {
                                        navController.navigate("perfil3")
                                    }) {
                                Image(
                                    painter = painterResource(R.drawable.pontuacao_icon),
                                    contentDescription = "pontuação",
                                    colorFilter = ColorFilter.tint(indigo_dye),
                                    modifier = Modifier.size(25.dp)
                                )
                                Text(
                                    "Pontuação",
                                    color = indigo_dye,
                                    fontSize = 13.sp,
                                    fontFamily = fontPoppins
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .border(
                                    2.dp,
                                    color = Color.Transparent,
                                    shape = RoundedCornerShape(topStart = 20.dp)
                                )
                                .background(Color.Transparent)
                        ) {
                            Column(verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .border(
                                        2.dp,
                                        color = Color.Transparent,
                                        shape = RoundedCornerShape(topStart = 20.dp)
                                    )
                                    .size(height = 97.dp, width = 118.dp)
                                    .clickable {
                                        navController.navigate("perfil2")
                                    }) {
                                Image(
                                    painter = painterResource(R.drawable.informa__es_icon),
                                    contentDescription = "informações",
                                    colorFilter = ColorFilter.tint(indigo_dye),
                                    modifier = Modifier.size(25.dp)
                                )
                                Text(
                                    "informações",
                                    color = indigo_dye,
                                    fontSize = 13.sp,
                                    fontFamily = fontPoppins
                                )
                            }
                        }

                        Box(modifier = Modifier
                            .clip(RoundedCornerShape(topEnd = 20.dp))
                            .background(midnight_blue)
                            .drawBehind {
                                val borderWidth = 2.dp.toPx()
                                drawRect(
                                    color = indigo_dye,
                                    topLeft = androidx.compose.ui.geometry.Offset(
                                        0f, size.height - borderWidth
                                    ),
                                    size = androidx.compose.ui.geometry.Size(
                                        size.width, borderWidth
                                    )
                                )
                            }
                            .border(
                                2.dp,
                                color = Color.Transparent,
                                shape = RoundedCornerShape(topEnd = 20.dp)
                            )) {
                            Column(verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(topEnd = 20.dp))
                                    .border(
                                        2.dp,
                                        color = Color.Transparent,
                                        shape = RoundedCornerShape(topEnd = 20.dp)
                                    )
                                    .size(height = 97.dp, width = 118.dp)
                                    .clickable {
                                        navController.navigate("perfil1")
                                    }) {
                                Image(
                                    painter = painterResource(R.drawable.atividade_icon),
                                    contentDescription = "atidades",
                                    colorFilter = ColorFilter.tint(Color.White),
                                    modifier = Modifier.size(30.dp)
                                )
                                Text(
                                    "Atividades",
                                    color = white_smoke,
                                    fontSize = 13.sp,
                                    fontFamily = fontPoppins
                                )
                            }
                        }

                    }
                    Spacer(modifier = Modifier.padding(top = 18.dp))
                    Text(
                        "Andamento",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = indigo_dye,
                        fontFamily = fontPoppins,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Button(modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 10.dp)
                        .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.testes_tecnicos_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier.size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text(
                                    "Testes técnicos",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = fontPoppins
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_testes_tecnicos),
                                    contentDescription = "Barra de progresso da atividade testes técnicos",
                                    modifier = Modifier.height(18.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    Button(modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.live_coding_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier.size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text(
                                    "Live Coding",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = fontPoppins
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_live_coding),
                                    contentDescription = "Barra de progresso da atividade live Coding",
                                    modifier = Modifier.height(18.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(top = 18.dp))
                    Text(
                        "Finalizadas",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = indigo_dye,
                        fontFamily = fontPoppins,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Button(modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(top = 10.dp)
                        .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.orat_ria_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier.size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text(
                                    "Oratória",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = fontPoppins
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_100_),
                                    contentDescription = "Barra de progresso da oratória",
                                    modifier = Modifier.height(18.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .size(width = 300.dp, height = 80.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = pale_sky_blue),
                        shape = RoundedCornerShape(20.dp),
                        onClick = {}) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()


                        ) {
                            Image(
                                painter = painterResource(R.drawable.pitch_perfeito_assets),
                                contentDescription = "Imagem atividade de testes técnicos",
                                modifier = Modifier.size(width = 110.5.dp, height = 73.25.dp)
                            )
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                            Column {
                                Text(
                                    "Pitch perfeito",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontFamily = fontPoppins
                                )
                                Image(
                                    painter = painterResource(R.drawable.progress_bar_100_),
                                    contentDescription = "Barra de progresso da atividade Pitch Perfeito",
                                    modifier = Modifier.height(18.dp)
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
fun PerfilInformacoes(navController: NavController) {
    val systemUiController = rememberSystemUiController()
    var nome_completo by remember { mutableStateOf("") }
    var apelido by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    var linkedin by remember { mutableStateOf("") }


    // define cores da barra de status e da barra de navegação
    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )
    Box(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
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

            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .border(
                            2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)
                        )
                        .fillMaxSize()
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {
                        TopBar(navController)
                    }
                    Spacer(modifier = Modifier.padding(top = 20.dp))
                    Image(painter = painterResource(R.drawable.edit_profile_icon),
                        contentDescription = "Icon que simboliza atualização da foto de perfil",
                        modifier = Modifier
                            .size(width = 67.33.dp, height = 65.dp)
                            .clickable { })
                    Text(
                        "Editar ícone e cores",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = indigo_dye,
                        fontFamily = fontPoppins
                    )
                    Column {
                        Text(
                            "Nome Completo:",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = indigo_dye,
                            fontFamily = fontPoppins,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .width(300.62.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                        OutlinedTextField(
                            value = nome_completo,
                            onValueChange = { newtext -> nome_completo = newtext },
                            modifier = Modifier
                                .width(300.62.dp),
                            textStyle = TextStyle(
                                fontSize = 13.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )
                    }
                    Column {
                        Text(
                            "Apelido:",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = indigo_dye,
                            fontFamily = fontPoppins,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .width(300.62.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                        OutlinedTextField(
                            value = apelido,
                            onValueChange = { newtext -> apelido = newtext },
                            modifier = Modifier.width(300.62.dp),
                            shape = RoundedCornerShape(7.dp),
                            textStyle = TextStyle(
                                fontSize = 13.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                    }
                    Column {
                        Text(
                            "E-mail:",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = indigo_dye,
                            fontFamily = fontPoppins,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .padding(top = 5.dp)
                                .width(300.62.dp)
                                .align(alignment = Alignment.CenterHorizontally)
                        )
                        OutlinedTextField(
                            value = email,
                            onValueChange = { newtext -> email = newtext },
                            modifier = Modifier.width(300.62.dp),
                            shape = RoundedCornerShape(7.dp),
                            textStyle = TextStyle(
                                fontSize = 13.sp, textAlign = TextAlign.Start
                            ),
                            singleLine = true
                        )

                    }
                    Row {
                        Column {
                            Text(
                                "Idade:",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = indigo_dye,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Start,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                                    .width(73.dp)
                                    .align(alignment = Alignment.CenterHorizontally)
                            )
                            OutlinedTextField(
                                value = idade,
                                onValueChange = {
                                    idade = it
                                },
                                keyboardOptions = KeyboardOptions.Default.copy(
                                    keyboardType = KeyboardType.Number
                                ),
                                modifier = Modifier.width(73.dp),
                                shape = RoundedCornerShape(7.dp),
                                textStyle = TextStyle(
                                    fontSize = 13.sp, textAlign = TextAlign.Start
                                ),
                                singleLine = true
                            )
                        }

                        Spacer(modifier = Modifier.padding(start = 10.dp))

                        Column {
                            Text(
                                "LinkedIn:",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = indigo_dye,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Start,
                                modifier = Modifier
                                    .padding(top = 5.dp)
                                    .width(212.dp)
                                    .align(alignment = Alignment.CenterHorizontally)
                            )
                            OutlinedTextField(
                                value = linkedin,
                                onValueChange = {
                                    linkedin = it
                                },
                                modifier = Modifier.width(212.dp),
                                shape = RoundedCornerShape(7.dp),
                                textStyle = TextStyle(
                                    fontSize = 13.sp, textAlign = TextAlign.Start
                                ),
                                singleLine = true
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PerfilPontuacao(navController: NavController) {
    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )
    Box(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
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

            Box(
                modifier = Modifier
                    .size(width = 350.dp, height = 590.dp)
                    .border(2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .border(
                            2.dp, color = Color.Black, shape = RoundedCornerShape(20.dp)
                        )
                        .fillMaxSize()
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(97.dp)
                    ) {}


                    Spacer(modifier = Modifier.padding(top = 20.dp))

                    Image(
                        painter = painterResource(R.drawable.icon_pontua__o_trofeu),
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                    )
                    Text(
                        "Pontuação",
                        color = midnight_blue,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium,
                        //fontFamily = fontPoppins
                    )
                    Text(
                        "590",
                        color = indigo_dye,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins
                    )
                    Image(
                        painter = painterResource(R.drawable.progress_bar_pontuacao),
                        contentDescription = "Barra de progresso de pontuação"
                    )
                    Text(
                        "RECOMPENSAS",
                        color = indigo_dye,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins
                    )
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Card(
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = indigo_dye
                                ),
                            modifier = Modifier.size(
                                width = 140.dp, height = 85.dp
                            )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.medalha_ouro_pontua__es),
                                    contentDescription = "Medalha de ouro",
                                    modifier = Modifier
                                        .size(55.dp)
                                )
                                Text(
                                    "Oratória",
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = fontPoppins
                                )

                            }
                        }

                        Spacer(modifier = Modifier.padding(start = 20.dp))

                        Card(
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = indigo_dye
                                ),
                            modifier = Modifier.size(
                                width = 140.dp, height = 85.dp
                            )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.medalha_ouro_pontua__es),
                                    contentDescription = "Medalha de ouro",
                                    modifier = Modifier
                                        .size(55.dp)
                                )
                                Text(
                                    "Pitch \n Perfeito",
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = fontPoppins
                                )

                            }
                        }
                    }

                    Spacer(modifier = Modifier.padding(top = 20.dp))

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Card(
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = indigo_dye
                                ),
                            modifier = Modifier.size(
                                width = 140.dp, height = 85.dp
                            )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.medalha_bronze_pontua__es),
                                    contentDescription = "Medalha de bronze",
                                    modifier = Modifier
                                        .size(55.dp)

                                )
                                Text(
                                    "Testes \n Técnicos",
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = fontPoppins
                                )


                            }
                        }

                        Spacer(modifier = Modifier.padding(start = 20.dp))

                        Card(
                            colors = CardDefaults
                                .cardColors(
                                    containerColor = indigo_dye
                                ),
                            modifier = Modifier.size(
                                width = 140.dp, height = 85.dp
                            )
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.medalha_prata_pontua__es),
                                    contentDescription = "Medalha de prata",
                                    modifier = Modifier
                                        .size(55.dp)
                                )
                                Text(
                                    "live \n Coding",
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    fontFamily = fontPoppins
                                )
                            }
                        }
                    }

                }
            }
        }
    }
}


@Preview
@Composable
private fun PerfilPreview() {
    DevEmpowerTheme {
        PerfilAtividade(rememberNavController())
    }
}

@Preview
@Composable
private fun Perfil2Preview() {
    DevEmpowerTheme {
        PerfilInformacoes(rememberNavController())
    }
}

@Preview
@Composable
private fun Perfil3Preview() {
    DevEmpowerTheme {
        PerfilPontuacao(rememberNavController())
    }
}