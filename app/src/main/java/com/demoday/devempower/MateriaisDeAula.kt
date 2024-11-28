package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            color = indigo_dye
                        )
                    ) {
                        append("Assista os vídeos e teste seus conhecimentos com ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
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
                    .size(width = 375.dp, height = 214.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.devempower_material),
                    contentDescription = "material de aula DevEmpower",
                    modifier = Modifier
                        .size(width = 297.dp, height = 198.dp)
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
                        "DevEmpower",
                        color = white_smoke,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Medium,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxSize(),

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
                        .size(width = 171.dp, height = 168.dp)
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
                            .size(width = 171.dp, height = 56.dp)
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
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(5.dp)
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
                        .size(width = 171.dp, height = 168.dp)
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
                            .size(width = 171.dp, height = 56.dp)
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
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .padding(5.dp)
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