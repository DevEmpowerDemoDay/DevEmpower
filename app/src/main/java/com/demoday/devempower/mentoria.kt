package com.demoday.devempower

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

var fotos_button = 0
var foto_mentor = 1
var nome_mentor = ""
var condicao by mutableStateOf(false)
var horario by mutableStateOf(0)

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Mentorias(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Box(
                modifier = Modifier
                    .size(width = 370.dp, height = 690.dp)
                    .border(3.dp, indigo_dye, shape = RoundedCornerShape(50.dp))
            ) {
                var date = remember { mutableStateOf("") }
                val calendario = Calendario()
                calendario.calendarioDisponivel(navController)
            }
        }
    }
}


@Composable
fun Mentores(navController: NavController, date: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .pointerInput(Unit) {
                    detectTapGestures { // Detecta cliques na tela
                        condition = false // Quando clicar fora, define como falso
                    }
                }
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 20.dp)

                ) {
                    Text(
                        "Mentores",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        // fontFamily = fontPoppins,
                        color = if (condicao) indigo_dye.copy(alpha = 0.5f) else indigo_dye,
                    )
                    Image(
                        painter = painterResource(R.drawable.blue_line2),
                        contentDescription = "Line",
                        modifier = Modifier
                            .height(2.dp)
                            .graphicsLayer(
                                alpha = if (condicao) 0.5f else 1f
                            )

                    )
                }
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp)
                    .verticalScroll(
                        rememberScrollState()
                    )
            ) {
                Mentores1(
                    painter = painterResource(id = R.drawable.mentoria_murilo),
                    Text_descricao = "Foto Murilo",
                    Text_nome = "Murilo",
                    onClick = {
                        nome_mentor = "Murilo Coelho"
                        fotos_button = 1
                        condicao = true
                    },

                    )
                Mentores1(
                    Text_nome = "Andressa P.",
                    Text_descricao = "Foto Andressa",
                    painter = painterResource(id = R.drawable.mentoria_andressa),
                    onClick = {
                        nome_mentor = "Andressa Prudente"
                        fotos_button = 2
                        condicao = true

                    },


                    )
                Mentores1(
                    Text_nome = "Anna Cristina",
                    Text_descricao = "Foto Anna",
                    painter = painterResource(id = R.drawable.mentoria_anna),
                    onClick = {
                        nome_mentor = "Anna Cristina"
                        fotos_button = 3
                        condicao = true
                    },

                    )
                Mentores1(
                    Text_nome = "Hudson S.",
                    Text_descricao = "Foto Hudson",
                    painter = painterResource(id = R.drawable.mentoria_hudson),
                    onClick = {
                        nome_mentor = "Hudson Souza"
                        fotos_button = 8
                        condicao = true

                    },
                )

                Mentores1(
                    Text_nome = "Maykon S.",
                    Text_descricao = "Foto Maykon",
                    painter = painterResource(id = R.drawable.mentoria_maykon),
                    onClick = {
                        nome_mentor = "Maykon Silva"
                        fotos_button = 4
                        condicao = true
                    },
                )
                Mentores1(
                    Text_nome = "Kauan L.",
                    Text_descricao = "Foto Kauan",
                    painter = painterResource(id = R.drawable.mentoria_kauan),
                    onClick = {
                        nome_mentor = "Kauan Lusbel"
                        fotos_button = 5
                        condicao = true
                    },
                )
                Mentores1(
                    Text_nome = "Victor de C.",
                    Text_descricao = "Foto Victor",
                    painter = painterResource(id = R.drawable.mentoria_victor),
                    onClick = {
                        nome_mentor = "Victor Curtis"
                        fotos_button = 7
                        condicao = true
                    },
                )
                Mentores1(
                    Text_nome = "Matheus O.",
                    Text_descricao = "Foto Matheus",
                    painter = painterResource(id = R.drawable.mentoria_matheus),
                    onClick = {
                        nome_mentor = "Matheus Oliveira"
                        fotos_button = 6
                        condicao = true
                    },

                    )
            }
        }
    }
    if (condicao) {
        confirmação_horario(navController = navController)
    }
}


@Composable
fun Mentores1(Text_nome: String, Text_descricao: String, painter: Painter, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(width = 350.dp, height = 180.dp)
            .padding(top = 20.dp)
            .border(
                width = 3.dp,
                color = Color.Transparent, // Exemplo de cor condicional
                shape = RoundedCornerShape(30.dp)
            )
            .background(
                indigo_dye.copy(alpha = if (condicao) 0.5f else 1f), // Alpha condicional no background
                shape = RoundedCornerShape(30.dp)
            )
            .clickable {
                onClick()
            }
    ) {
        Box(
            modifier = Modifier
                .size(width = 360.dp, height = 180.dp)
                .border(
                    3.dp,
                    white_smoke.copy(alpha = if (condicao) 0.5f else 1f),
                    shape = RoundedCornerShape(30.dp)
                )

        ) {}
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painter,
                contentDescription = Text_descricao,
                modifier = Modifier
                    .size(width = 125.dp, height = 125.dp)
                    .offset(x = -20.dp)
                    .graphicsLayer(
                        alpha = if (condicao) 0.5f else 1f
                    )
            )
            Column {
                Text(
                    Text_nome,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Medium,
                    // fontFamily = fontPoppins,
                    color = if (condicao) white_smoke.copy(alpha = 0.5f) else white_smoke
                )
                Card(
                    backgroundColor = white_smoke,
                    modifier = Modifier
                        .size(width = 178.dp, height = 0.8.dp)
                ) { }
                Spacer(modifier = Modifier.padding(top = 18.dp))

            }
        }

    }

}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Confirmação_mentoria(navController: NavController) {

    foto_mentor = when (fotos_button) {
        1 -> R.drawable.mentoria_murilo
        2 -> R.drawable.mentoria_andressa
        3 -> R.drawable.mentoria_anna
        4 -> R.drawable.mentoria_maykon
        5 -> R.drawable.mentoria_kauan
        6 -> R.drawable.mentoria_matheus
        7 -> R.drawable.mentoria_victor
        8 -> R.drawable.mentoria_hudson
        else -> R.drawable.mentoria_murilo

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = foto_mentor),
                contentDescription = "Foto Murilo",
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
            )
            androidx.compose.material.Text(
                "Você deseja confirmar\n" +
                        "sua mentoria com \n" +
                        "$nome_mentor às $horario horas? ",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = indigo_dye,
                // fontFamily = fontPoppins,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 5.dp)
                    .width(300.62.dp)
            )

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Button(
                onClick = { navController.navigate("confirm_email") },
                modifier = Modifier
                    .size(width = 234.dp, height = 68.dp),
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
            ) {
                Text(
                    "Sim",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    // fontFamily = fontPoppins,
                )
            }

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Button(
                onClick = { navController.navigate("mentoria") },
                modifier = Modifier
                    .size(width = 234.dp, height = 68.dp),
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
            ) {
                Text(
                    "Não",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    //  fontFamily = fontPoppins,
                )
            }


        }
    }

}

@Composable
fun confirmação_horario(navController: NavController) {
    var condicao_cor_button1 by remember { mutableStateOf(false) }
    var condicao_cor_button2 by remember { mutableStateOf(false) }
    var condicao_cor_button3 by remember { mutableStateOf(false) }
    var condicao_cor_button4 by remember { mutableStateOf(false) }
    if (condicao) {
        Box(
            modifier = Modifier
                .fillMaxSize() // O Box ocupa toda a tela
                .pointerInput(Unit) {
                    detectTapGestures(onTap = {
                        // Define a condição como falsa ao clicar fora do Card
                        condicao = false
                    })
                }
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Card(
                    backgroundColor = uranium_blue,
                    shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                    modifier = Modifier
                        .fillMaxWidth() // O Card ocupa toda a largura
                        .height(390.dp) // Altura fixa para o Card
                        .pointerInput(Unit) {
                            detectTapGestures(onTap = {
                                // O clique dentro do Card não faz nada
                            })
                        }
                ) {
                    // Conteúdo do Card
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Top,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Spacer(modifier = Modifier.padding(top = 45.dp))
                            Text(
                                "Horarios disponiveis",
                                fontSize = 33.sp,
                                fontWeight = FontWeight.Bold,
                                // fontFamily = fontPoppins,
                                color = indigo_dye
                            )

                            Spacer(modifier = Modifier.padding(top = 45.dp))




                            Row(modifier = Modifier) {
                                androidx.compose.material3.Card(
                                    modifier = Modifier
                                        .clickable {
                                            condicao_cor_button1 = true
                                            condicao_cor_button2 = false
                                            condicao_cor_button3 = false
                                            condicao_cor_button4 = false
                                            horario = 9
                                        }
                                        .size(width = 124.dp, height = 48.17.dp),
                                    colors = androidx.compose.material3.CardDefaults.cardColors(
                                        if (condicao_cor_button1) Color.White else indigo_dye
                                    ),
                                    shape = RoundedCornerShape(5.dp)
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Text(
                                            "09:00",
                                            fontSize = 25.sp,
                                            fontWeight = FontWeight.Bold,
                                            // fontFamily = fontPoppins,
                                            color = if (condicao_cor_button1) indigo_dye else white_smoke
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.padding(start = 25.dp))
                                androidx.compose.material3.Card(
                                    modifier = Modifier
                                        .clickable {
                                            condicao_cor_button1 = false
                                            condicao_cor_button2 = true
                                            condicao_cor_button3 = false
                                            condicao_cor_button4 = false
                                            horario = 12
                                        }
                                        .size(width = 124.dp, height = 48.17.dp),
                                    colors = androidx.compose.material3.CardDefaults.cardColors(
                                        if (condicao_cor_button2) Color.White else indigo_dye
                                    ),
                                    shape = RoundedCornerShape(5.dp)
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Text(
                                            "12:00",
                                            fontSize = 25.sp,
                                            fontWeight = FontWeight.Bold,
                                            // fontFamily = fontPoppins,
                                            color = if (condicao_cor_button2) indigo_dye else white_smoke
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.padding(top = 20.dp))

                            Row(modifier = Modifier) {
                                androidx.compose.material3.Card(
                                    modifier = Modifier
                                        .clickable {
                                            condicao_cor_button1 = false
                                            condicao_cor_button2 = false
                                            condicao_cor_button3 = true
                                            condicao_cor_button4 = false
                                            horario = 15
                                        }
                                        .size(width = 124.dp, height = 48.17.dp),
                                    colors = androidx.compose.material3.CardDefaults.cardColors(
                                        if (condicao_cor_button3) Color.White else indigo_dye
                                    ),
                                    shape = RoundedCornerShape(5.dp)
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Text(
                                            "15:00",
                                            fontSize = 25.sp,
                                            fontWeight = FontWeight.Bold,
                                            // fontFamily = fontPoppins,
                                            color = if (condicao_cor_button3) indigo_dye else white_smoke
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.padding(start = 25.dp))
                                androidx.compose.material3.Card(
                                    modifier = Modifier
                                        .clickable {
                                            condicao_cor_button1 = false
                                            condicao_cor_button2 = false
                                            condicao_cor_button3 = false
                                            condicao_cor_button4 = true
                                            horario = 17
                                        }
                                        .size(width = 124.dp, height = 48.17.dp),
                                    colors = androidx.compose.material3.CardDefaults.cardColors(
                                        if (condicao_cor_button4) Color.White else indigo_dye
                                    ),
                                    shape = RoundedCornerShape(5.dp)
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                    ) {
                                        Text(
                                            "17:00",
                                            fontSize = 25.sp,
                                            fontWeight = FontWeight.Bold,
                                            // fontFamily = fontPoppins,
                                            color = if (condicao_cor_button4) indigo_dye else white_smoke
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.padding(top = 30.dp))
                            Button(
                                onClick = {
                                    navController.navigate("mentoria_confirmação")
                                },
                                colors = ButtonDefaults.buttonColors(indigo_dye),
                                modifier = Modifier
                                    .size(width = 156.dp, height = 42.dp),
                                shape = RoundedCornerShape(10.dp),
                            ) {
                                Text(
                                    "confirmar",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    // fontFamily = fontPoppins,
                                    color = white_smoke
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
fun Confirmação_email(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.confirm_mentoria),
                contentDescription = "",
                modifier = Modifier
                    .size(90.dp)
            )

            Spacer(modifier = Modifier.padding(top = 30.dp))

            androidx.compose.material.Text(
                "Confirmamos a sua presença, por favor verifique seu e-mail",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = indigo_dye,
                // fontFamily = fontPoppins,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 5.dp)
                    .width(300.62.dp)
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Button(
                onClick = {
                    navController.navigate("home")
                },
                modifier = Modifier
                    .size(width = 234.dp, height = 68.dp),
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
            ) {
                Text(
                    "Confirmar",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    //  fontFamily = fontPoppins,
                )
            }


        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
private fun Mentoria_Preview() {
    DevEmpowerTheme {
        Mentores(rememberNavController(), date = "")
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
private fun Mentoria_Preview2() {
    DevEmpowerTheme {
        Confirmação_email(rememberNavController())
    }
}




