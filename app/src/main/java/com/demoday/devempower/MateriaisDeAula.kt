package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 75.dp)
                .fillMaxSize()
        ) {
            Text(
                "  Aulas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text( modifier = Modifier
                .padding(start = 10.dp, end = 10.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            color = indigo_dye,
                            fontFamily = fontPoppins
                        )
                    ) {
                        append("Assista os vídeos e teste seus conhecimentos com ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("quizzes interativos")
                    }
                }
            )
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(19.dp))
                    .background(pale_sky_blue)
                    .size(width = 375.dp, height = 200.dp)
                    .clickable {

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
                        " DevEmpower",
                        color = white_smoke,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = fontPoppins,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 5.dp)

                        )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(19.dp))
                        .background(pale_sky_blue)
                        .size(width = 171.dp, height = 150.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.entrevistas_material),
                        contentDescription = "material de aula entrevistas",
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
                                "case",
                                color = white_smoke,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                            )


                            Text(
                                "Entrevistas",
                                color = white_smoke,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                            )

                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(10.dp)
                )
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(19.dp))
                        .background(pale_sky_blue)
                        .size(width = 171.dp, height = 150.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.testes_tecnicos_material),
                        contentDescription = "material de aula testes técnicos",
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
                                "live Coding",
                                color = white_smoke,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                            )


                            Text(
                                "Testes Técnicos",
                                color = white_smoke,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                            )

                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(19.dp))
                        .background(pale_sky_blue)
                        .size(width = 171.dp, height = 150.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.entrevistas_material),
                        contentDescription = "material de aula entrevistas",
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
                                "case",
                                color = white_smoke,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                            )


                            Text(
                                "Entrevistas",
                                color = white_smoke,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                            )

                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .padding(10.dp)
                )
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(19.dp))
                        .background(pale_sky_blue)
                        .size(width = 171.dp, height = 150.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.testes_tecnicos_material),
                        contentDescription = "material de aula testes técnicos",
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
                                "live Coding",
                                color = white_smoke,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = fontPoppins,
                                textAlign = TextAlign.Center,
                            )


                            Text(
                                "Testes Técnicos",
                                color = white_smoke,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                            )

                        }
                    }
                }
            }
            BottomBar(navController)
        }
    }


}


@Composable
fun IntroduçãoAula1(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {}
}


@Preview
@Composable
private fun Materiaspreview() {
    DevEmpowerTheme {
        Materiais(rememberNavController())
    }
}

@Preview
@Composable
private fun IntroduçãoMateriaspreview () {
    DevEmpowerTheme {
        IntroduçãoAula1()
    }
}