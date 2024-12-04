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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

@Composable
fun Materiais(navController: NavController) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.11)
    val paddingValue1 = (screenWidth * 0.05)
    val paddingValue2 = (screenWidth * 0.20)
    val paddingValue3 = (screenWidth * 0.09)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxSize()
        ) {
            Text(
                "  Aulas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp)
                    .padding(10.dp)
            )
            Text(modifier = Modifier
                .padding(start = 25.dp, end = 10.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            color = indigo_dye,
                            // fontFamily = fontPoppins
                        )
                    ) {
                        append("Assista os vídeos e teste seus conhecimentos com ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            // fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("quizzes interativos")
                    }
                }
            )
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(19.dp))
                    .background(pale_sky_blue)
                    .size(width = 375.dp, height = 200.dp)
                    .clickable {
                        navController.navigate("introdução1")
                    }
            ) {

                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "material de aula DevEmpower",
                    modifier = Modifier
                        .size(width = 297.dp, height = 180.dp)
                        .fillMaxSize()
                        .align(alignment = Alignment.Center)
                )


                Card(
                    colors = CardDefaults.cardColors(indigo_dye),
                    shape = RoundedCornerShape(bottomStart = 19.dp, bottomEnd = 19.dp),
                    modifier = Modifier
                        .size(width = 375.dp, height = 45.dp)
                        .fillMaxSize()
                        .align(alignment = Alignment.BottomCenter)

                ) {
                    Text(
                        " Sobre nós",
                        color = white_smoke,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        // fontFamily = fontPoppins,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp)

                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 12.dp)
            ) {


                Botões_Materiais(
                    Text_descrição = "Imagem aula de entrevistas",
                    Text_titulo = "Case",
                    Text_aula = "Entrevistas",
                    Painter = painterResource(R.drawable.entrevistas_material),
                    navController
                )


                Spacer(
                    modifier = Modifier
                        .padding(10.dp)
                )
                Botões_Materiais(
                    Text_descrição = "Imagem aula de testes técnicos",
                    Text_titulo = "Live Coding",
                    Text_aula = "Testes Técnicos",
                    Painter = painterResource(R.drawable.testes_tecnicos_material),
                    navController
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 12.dp)
            ) {
                Botões_Materiais(
                    Text_descrição = "Imagem aula comunicação",
                    Text_titulo = "Oratória",
                    Text_aula = "Comunicação",
                    Painter = painterResource(R.drawable.orat_ria_material),
                    navController
                )
                Spacer(
                    modifier = Modifier
                        .padding(10.dp)
                )
                Botões_Materiais(
                    Text_descrição = "Imagem aula de curriculo",
                    Text_titulo = "Currículo Ideal",
                    Text_aula = "Profissional",
                    Painter = painterResource(R.drawable.profissional_material),
                    navController
                )
            }
            Spacer(
                modifier = Modifier
                    .padding(top = 75.dp)
            )
            Box(
                modifier = Modifier
                    .size(width = 357.dp, height = 66.dp)
                    .background(indigo_dye, shape = RoundedCornerShape(37.94.dp))
                    .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))
                    .fillMaxWidth()
                    .align(alignment = Alignment.CenterHorizontally)


            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(R.drawable.comunidade_icon),
                        contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                navController.navigate("comunidade")
                            }
                    )

                    Image(
                        painter = painterResource(R.drawable.home_icon),
                        contentDescription = "",
                        modifier = Modifier
                            .offset(x = 10.dp)
                            .size(26.dp)
                            .clickable { navController.navigate("home") }
                    )


                    Card(
                        shape = RoundedCornerShape(50.dp),
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 55.dp, height = 56.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterVertically)
                            .offset(y = (-30).dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                                .border(
                                    5.dp,
                                    uranium_blue,
                                    shape = androidx.compose.foundation.shape.CircleShape
                                )
                        ) {
                            Image(
                                painter = painterResource(R.drawable.material_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(26.dp)
                            )
                        }
                    }

                }
                Box(
                    modifier = Modifier
                        .size(width = 357.dp, height = 66.dp)
                        .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))


                )

            }
        }

    }


}

@Composable
fun Botões_Materiais(
    Text_descrição: String,
    Text_titulo: String,
    Text_aula: String,
    Painter: Painter,
    navController: NavController
) {
    Box(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(19.dp))
            .background(pale_sky_blue)
            .size(width = 171.dp, height = 150.dp)
    ) {
        Image(
            painter = Painter,
            contentDescription = Text_descrição,
            modifier = Modifier
                .size(width = 297.dp, height = 198.dp)
                .fillMaxSize()
                .align(alignment = Alignment.Center)
        )
        Card(
            colors = CardDefaults.cardColors(indigo_dye),
            shape = RoundedCornerShape(bottomStart = 19.dp, bottomEnd = 19.dp),
            modifier = Modifier
                .size(width = 171.dp, height = 51.dp)
                .fillMaxSize()
                .align(alignment = Alignment.BottomCenter)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = Text_titulo,
                    color = white_smoke,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    // fontFamily = fontPoppins,
                    textAlign = TextAlign.Center
                )


                Text(
                    text = Text_aula,
                    color = white_smoke,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    // fontFamily = fontPoppins,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .offset(y = (-5).dp)
                )

            }
        }
    }
}


@Preview
@Composable
private fun Materiaspreview() {
    DevEmpowerTheme {
        Materiais(rememberNavController())
    }
}
