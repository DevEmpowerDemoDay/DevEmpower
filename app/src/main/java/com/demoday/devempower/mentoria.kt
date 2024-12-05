package com.demoday.devempower

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

var fotos_button = 0
var foto_mentor = 1
var nome_mentor = ""

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
        ) {

            Box(
                modifier = Modifier
                    .size(width = 370.dp, height = 690.dp)
                    .border(3.dp, indigo_dye, shape = RoundedCornerShape(50.dp))
                    .clip(shape = RoundedCornerShape(50.dp))
            ) {
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Top,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 15.dp)
                        .verticalScroll(
                            rememberScrollState()
                        )
                ) {
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_murilo),
                        Text_descricao = "Foto Murilo",
                        Text_nome = "Murilo",
                        onClick = {
                            nome_mentor = "Murilo"
                            fotos_button = 1
                            navController.navigate("mentoria_confirmação")
                        },

                        )
                    Mentores1(
                        Text_nome = "Andressa P.",
                        Text_descricao = "Foto Andressa",
                        painter = painterResource(id = R.drawable.mentoria_andressa),
                        onClick = {
                            nome_mentor = "Andressa"
                            fotos_button = 2
                            navController.navigate("mentoria_confirmação")

                        },


                        )
                    Mentores1(
                        Text_nome = "Anna Cristina",
                        Text_descricao = "Foto Anna",
                        painter = painterResource(id = R.drawable.mentoria_anna),
                        onClick = {
                            nome_mentor = "Anna"
                            fotos_button = 3
                            navController.navigate("mentoria_confirmação")
                        },

                        )
                    Mentores1(
                        Text_nome = "Maykon S.",
                        Text_descricao = "Foto Maykon",
                        painter = painterResource(id = R.drawable.mentoria_maykon),
                        onClick = {
                            nome_mentor = "Maykon"
                            fotos_button = 4
                            navController.navigate("mentoria_confirmação")
                        },
                    )
                    Mentores1(
                        Text_nome = "Kauan L.",
                        Text_descricao = "Foto Kauan",
                        painter = painterResource(id = R.drawable.mentoria_kauan),
                        onClick = {
                            nome_mentor = "Kauan"
                            fotos_button = 5
                            navController.navigate("mentoria_confirmação")
                        },
                    )
                    Mentores1(
                        Text_nome = "Victor de C.",
                        Text_descricao = "Foto Victor",
                        painter = painterResource(id = R.drawable.mentoria_victor),
                        onClick = {
                            nome_mentor = "Victor"
                            fotos_button = 7
                            navController.navigate("mentoria_confirmação")
                        },
                    )
                    Mentores1(
                        Text_nome = "Matheus O.",
                        Text_descricao = "Foto Matheus",
                        painter = painterResource(id = R.drawable.mentoria_matheus),
                        onClick = {
                            nome_mentor = "Matheus"
                            fotos_button = 6
                            navController.navigate("mentoria_confirmação")
                        },

                        )
                }
            }
        }
    }
}

@Composable
fun Mentores1(Text_nome: String, Text_descricao: String, painter: Painter, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(width = 320.dp, height = 181.dp)
            .padding(top = 20.dp)
            .border(3.dp, Color.Transparent, shape = RoundedCornerShape(30.dp))
            .background(indigo_dye.copy(alpha = 0.5f), shape = RoundedCornerShape(30.dp))
            .clickable {
                onClick()

            }
    ) {
        Box(
            modifier = Modifier
                .size(width = 320.dp, height = 181.dp)
                .border(3.dp, white_smoke, shape = RoundedCornerShape(30.dp))

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
            )
            Column {
                Text(
                    Text_nome,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    //fontFamily = fontPoppins,
                    color = Color.White,
                )
                Card(
                    backgroundColor = white_smoke,
                    modifier = Modifier
                        .size(width = 178.dp, height = 0.8.dp)
                ) { }
                Spacer(modifier = Modifier.padding(top = 18.dp))
                Card(
                    backgroundColor = bright_blue,
                    modifier = Modifier
                        .size(width = 92.dp, height = 32.59.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            "9:00",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium,
                            //  fontFamily = fontPoppins,
                            color = Color.White,
                        )
                    }
                }
            }
        }

    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Confirmação_mentoria(navController: NavController) {


    var fotos by remember {
        mutableStateOf(1)
    }


    foto_mentor = when (fotos_button) {

        1 -> R.drawable.mentoria_murilo
        2 -> R.drawable.mentoria_andressa
        3 -> R.drawable.mentoria_anna
        4 -> R.drawable.mentoria_maykon
        5 -> R.drawable.mentoria_kauan
        6 -> R.drawable.mentoria_matheus
        7 -> R.drawable.mentoria_victor
        else -> R.drawable.mentoria_victor

    }
    Text(
        text = "mentoria confirmada",
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        //fontFamily = fontPoppins,
        color = Color.Black
    )
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
            Text(
                "Você deseja confirmar\n" +
                        "sua mentoria com \n" +
                        "$nome_mentor no dia $date  às 9 horas?",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                // fontFamily = fontPoppins,
            )
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
private fun Mentoria_Preview1() {
    DevEmpowerTheme {
        Confirmação_mentoria(rememberNavController())
    }
}



