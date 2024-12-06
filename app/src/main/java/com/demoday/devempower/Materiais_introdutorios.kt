package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun IntroduçãoAula1(navController: NavController) {

    val splashScreenDuration = 2500L // 2500 ms = 2,5 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

//    LaunchedEffect(Unit) {
//        delay(splashScreenDuration)
//        navController.navigate("introdução2") {
//            popUpTo("introdução1") { inclusive = true }
//        }
//    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
            .clickable { navController.navigate("introdução2") }
    ) {
        Box(
            modifier = Modifier
                .size(width = 345.dp, height = 642.dp)
                .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))


        ) {
            Card(
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(indigo_dye),
                modifier = Modifier
                    .size(width = 250.dp, height = 100.dp)
                    .fillMaxWidth()
                    .align(alignment = Alignment.TopCenter)
                    .offset(y = (-65).dp)
            ) {


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Text(
                        "DevEmpower",
                        fontSize = 25.sp,
                        color = white_smoke,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        fontFamily = fontPoppins,
                        textDecoration = TextDecoration.Underline,

                        )
                }
            }
            Text(modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 60.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            color = indigo_dye,
                            fontFamily = fontPoppins
                        )
                    ) {
                        append("Você já ouviu falar sobre  ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("DevEmpower")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append(", uma plataforma inovadora para ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("desenvolvedores se destacarem em processos seletivos?")
                    }
                }
            )
            Box(
                modifier = Modifier
                    .size(width = 345.dp, height = 642.dp)
                    .border(5.dp, color = indigo_dye, shape = RoundedCornerShape(50.dp))


            )
            Image(
                painter = painterResource(R.drawable.mulher_materialdeaula),
                contentDescription = "",
                modifier = Modifier
                    .size(width = 286.dp, height = 388.dp)
                    .offset(-20.dp, 230.dp)
            )
            Card(
                colors = CardDefaults.cardColors(pale_sky_blue),
                modifier = Modifier
                    .size(width = 360.dp, height = 49.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .fillMaxSize()
            )
            {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 160.dp, height = 14.dp)
                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .padding(start = 10.dp)
                            .alpha(0.5f)
                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .padding(start = 10.dp)
                            .alpha(0.5f)
                    ) { }
                }
            }

        }
    }
}

@Composable
fun IntroduçãoAula2(navController: NavController) {

    val splashScreenDuration = 2500L // 2500 ms = 2,5 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )
//
//    LaunchedEffect(Unit) {
//        delay(splashScreenDuration)
//        navController.navigate("introdução3") {
//            popUpTo("introdução2") { inclusive = true }
//        }
//    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
            .clickable { navController.navigate("introdução3") }
    ) {
        Box(
            modifier = Modifier
                .size(width = 345.dp, height = 642.dp)
                .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))


        ) {
            Card(
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(indigo_dye),
                modifier = Modifier
                    .size(width = 250.dp, height = 100.dp)
                    .fillMaxWidth()
                    .align(alignment = Alignment.TopCenter)
                    .offset(y = (-65).dp)
            ) {


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Text(
                        "DevEmpower",
                        fontSize = 25.sp,
                        color = white_smoke,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                         fontFamily = fontPoppins,
                        textDecoration = TextDecoration.Underline,

                        )
                }
            }
            Text(modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 75.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            color = indigo_dye,
                            fontFamily = fontPoppins
                        )
                    ) {
                        append("A ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("DevEmpower")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append(", oferece uma experiência completa e prática para aprimorar suas ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("habilidades interpessoais.")
                    }
                }
            )
            Box(
                modifier = Modifier
                    .size(width = 345.dp, height = 642.dp)
                    .border(5.dp, color = indigo_dye, shape = RoundedCornerShape(50.dp))


            )
            Image(
                painter = painterResource(R.drawable.homem_materialdeaula),
                contentDescription = "",
                modifier = Modifier
                    .size(width = 350.dp, height = 450.dp)
                    .offset(-30.dp, 230.dp)
            )
            Card(
                colors = CardDefaults.cardColors(pale_sky_blue),
                modifier = Modifier
                    .size(width = 360.dp, height = 49.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .fillMaxSize()
            )
            {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .alpha(0.5f)
                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 160.dp, height = 14.dp)
                            .padding(start = 10.dp)

                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .padding(start = 10.dp)
                            .alpha(0.5f)
                    ) { }
                }
            }

        }
    }
}

@Composable
fun IntroduçãoAula3(navController: NavController) {
    val splashScreenDuration = 2500L // 2500 ms = 2,5 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

//    LaunchedEffect(Unit) {
//        delay(splashScreenDuration)
//        navController.navigate("material") {
//            popUpTo("introdução3") { inclusive = true }
//        }
//    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
            .clickable {
                navController.navigate("quizz")
                condition = true
            }
    ) {
        Box(
            modifier = Modifier
                .size(width = 345.dp, height = 642.dp)
                .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))


        ) {
            Card(
                shape = RoundedCornerShape(50.dp),
                colors = CardDefaults.cardColors(indigo_dye),
                modifier = Modifier
                    .size(width = 250.dp, height = 100.dp)
                    .fillMaxWidth()
                    .align(alignment = Alignment.TopCenter)
                    .offset(y = (-65).dp)
            ) {


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Text(
                        "DevEmpower",
                        fontSize = 25.sp,
                        color = white_smoke,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Medium,
                        fontFamily = fontPoppins,
                        textDecoration = TextDecoration.Underline,

                        )
                }
            }
            Text(modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 60.dp),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            color = indigo_dye,
                            fontFamily = fontPoppins
                        )
                    ) {
                        append("Com conteúdos práticos e simulações, a  ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                             fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("DevEmpower")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append(", fortalece sua confiança e ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("destaca seu potencial para conquistar a vaga dos seus sonhos.")
                    }
                }
            )
            Box(
                modifier = Modifier
                    .size(width = 345.dp, height = 642.dp)
                    .border(5.dp, color = indigo_dye, shape = RoundedCornerShape(50.dp))


            )
            Image(
                painter = painterResource(R.drawable.mulher_materialdeaula),
                contentDescription = "",
                modifier = Modifier
                    .size(width = 286.dp, height = 388.dp)
                    .offset(-20.dp, 230.dp)
            )
            Card(
                colors = CardDefaults.cardColors(pale_sky_blue),
                modifier = Modifier
                    .size(width = 360.dp, height = 49.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .fillMaxSize()
            )
            {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()

                ) {
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .alpha(0.5f)
                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 60.dp, height = 14.dp)
                            .padding(start = 10.dp)
                            .alpha(0.5f)
                    ) { }
                    Card(
                        colors = CardDefaults.cardColors(indigo_dye),
                        modifier = Modifier
                            .size(width = 160.dp, height = 14.dp)
                            .padding(start = 10.dp)

                    ) { }
                }
            }

        }
    }

}

@Preview
@Composable
private fun IntroduçãoMateriaspreview1() {
    DevEmpowerTheme {
        IntroduçãoAula1(rememberNavController())
    }
}

@Preview
@Composable
private fun IntroduçãoMateriaspreview2() {
    DevEmpowerTheme {
        IntroduçãoAula2(rememberNavController())

    }
}

@Preview
@Composable
private fun IntroduçãoMateriaspreview3() {
    DevEmpowerTheme {
        IntroduçãoAula3(rememberNavController())
    }
}
