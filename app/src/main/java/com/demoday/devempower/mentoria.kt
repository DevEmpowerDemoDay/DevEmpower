package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme


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
                val calendario = Calendario()
                calendario.calendarioDisponivel(navController)
            }
        }
    }
}


@Composable
fun Mentores(navController: NavController) {
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
                )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_andressa),
                        Text_descricao = "Foto Andressa",
                        Text_nome = "Andressa P.",

                    )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_anna),
                        Text_descricao = "Foto Anna",
                        Text_nome = "Anna Cristina",
                    )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_maykon),
                        Text_descricao = "Foto Maykon",
                        Text_nome = "Maykon S.",
                    )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_kauan),
                        Text_descricao = "Foto Kauan",
                        Text_nome = "Kauan L.",
                    )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_victor),
                        Text_descricao = "Foto Victor",
                        Text_nome = "Victor de C.",
                    )
                    Mentores1(
                        painter = painterResource(id = R.drawable.mentoria_matheus),
                        Text_descricao = "Foto Matheus",
                        Text_nome = "Matheus O.",

                    )
            }}
        }
    }
}

@Composable
fun Mentores1(Text_nome:String,Text_descricao:String,painter: Painter) {
Box(
    modifier = Modifier
        .size(width = 300.dp, height = 181.dp)
        .padding(top = 20.dp)
        .border(3.dp, Color.Transparent, shape = RoundedCornerShape(30.dp))
        .background(indigo_dye.copy(alpha = 0.5f),shape = RoundedCornerShape(30.dp))
){
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
            .offset(x = -10.dp)
    )
    Column {
    Text(
        Text_nome,
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium,
        //fontFamily = fontPoppins,
        color = Color.White,
    )
}}
}
}

@Preview
@Composable
private fun Calendario_Preview() {
    DevEmpowerTheme {
        Mentorias(rememberNavController())
    }
}

@Preview
@Composable
private fun Mentoria_Preview() {
    DevEmpowerTheme {
        Mentores(rememberNavController())
    }
}
