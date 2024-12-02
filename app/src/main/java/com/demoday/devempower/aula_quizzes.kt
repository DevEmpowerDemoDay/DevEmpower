package com.demoday.devempower

import android.app.AlertDialog
import android.content.Context
import android.view.Gravity
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import kotlinx.coroutines.delay
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.math.round


var condition = false
val correto = Color(0xFF00440C)
val errado = Color(0xFF670000)
var corborda = correto
var certoouerradocor = correto
var certoouerrado = ""
var feedbackcorreto1 = "Perfeito! A DevEmpower realmente foca no desenvolvimento das soft skills dos desenvolvedores para o sucesso no mercado de trabalho."
var feedbackerrado1 = "Quase lá! A DevEmpower ajuda desenvolvedores a aprimorar suas soft skills, essenciais para se destacarem em processos seletivos."
var feedbackcorreto2 = "Perfeito! O polvo representa inteligência, adaptabilidade e a força de uma rede de apoio na identidade da DevEmpower."
var feedbackerrado2 = "Não só inteligência! O polvo também simboliza adaptabilidade e a força de uma rede de apoio na identidade da DevEmpower."
var feedbackcorreto3 = "Isso mesmo! A DevEmpower vai além de materiais de aula, oferecendo mentorias, quizzes interativos e diversas ferramentas para aprendizado."
var feedbackerrado3 = "A DevEmpower também oferece mentorias e quizzes interativos, indo além de apenas materiais de aula para apoiar seu desenvolvimento."
var texto = ""


@Composable
fun timer(navController: NavController) {

    var seconds by remember { mutableStateOf(10) }
    var isRunning by remember { mutableStateOf(condition) }
    LaunchedEffect(key1 = isRunning) {
        while (isRunning && seconds > 0) {
            delay(1000L) // Espera 1 segundo
            seconds-- // Decrementa os segundos
        }

        if (seconds == 0) {
            condition = false
            navController.navigate("quizz2") // Navega para a próxima tela

        }
    }
    Card(
        colors = CardDefaults.cardColors(indigo_dye),
        modifier = Modifier
            .size(width = 70.dp, height = 70.dp)
            .clip(shape = androidx.compose.foundation.shape.CircleShape)
            .border(
                5.dp,
                white_smoke,
                shape = androidx.compose.foundation.shape.CircleShape
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                seconds.toString(),
                color = white_smoke,
                //fontFamily = fontPoppins,
                fontSize = 30.sp
            )
        }
    }
}


@Composable
fun card_feedback() {
    Card(
        colors = CardDefaults.cardColors(indigo_dye,),
        modifier = Modifier
            .fillMaxWidth()
            .size(width = 370.dp, height = 185.dp)
            .clip(shape = RoundedCornerShape(30.dp))
            .border(3.dp, color = corborda)


    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text( certoouerrado,
                fontSize = 19.sp,
                color = certoouerradocor,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                //fontFamily = fontPoppins,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                texto,
                fontSize = 19.sp,
                color = white_smoke,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                //fontFamily = fontPoppins,
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
    }

}
@Composable
fun Quizz_Pergunta1(navController: NavController) {
    val context = LocalContext.current
    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)

    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {

            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 1 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "A DevEmpower foca principalmente em ajudar desenvolvedores " +
                        "a melhorarem suas soft skills",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz2")
                    condition = false
                    corborda = correto
                    texto = feedbackcorreto1
                    certoouerrado = "Resposta Correta!"
                    certoouerradocor = correto
                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz2")
                    condition = false
                    corborda = errado
                    texto = feedbackerrado1
                    certoouerrado = "Resposta Incorreta!"
                    certoouerradocor = errado
                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }

    }
}


@Composable
fun Quizz_Correção1(navController: NavController) {
    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)
    val splashScreenDuration = 7000L

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        condition = true
        navController.navigate("quizz3") {
            popUpTo("quizz2") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {

            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 1 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "A DevEmpower foca principalmente em ajudar desenvolvedores " +
                        "a melhorarem suas soft skills",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {


                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = correto,
                        //fontFamily = fontPoppins,
                        style = TextStyle(corText)

                    )

                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        color = errado,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }
    }
    card_feedback()
}

@Composable
fun Quizz_Pergunta2(navController: NavController) {

    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)

    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {

            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 2 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "O polvo simboliza apenas a inteligência na identidade " +
                        "da DevEmpower.",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz4")
                    condition = false
                    corborda = errado
                    texto = feedbackerrado2
                    certoouerrado = "Resposta Inorreta!"
                    certoouerradocor = errado
                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz4")
                    condition = false
                    corborda = correto
                    texto = feedbackcorreto2
                    certoouerrado = "Resposta Correta!"
                    certoouerradocor = correto
                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }

    }
}

@Composable
fun Quizz_Correção2(navController: NavController) {
    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)
    val splashScreenDuration = 7000L
    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        condition = true
        navController.navigate("quizz5") {
            popUpTo("quizz4") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {
            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 2 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "O polvo simboliza apenas a inteligência na identidade " +
                        "da DevEmpower.",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {


                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = errado,
                        //fontFamily = fontPoppins,
                        style = TextStyle(corText)

                    )

                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        color = correto,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }
    }
    card_feedback()
}

@Composable
fun Quizz_Pergunta3(navController: NavController) {
    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)

    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {

            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 3 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "A DevEmpower oferece apenas materiais de aula e " +
                        "não oferece mentorias ou quizzes interativos.",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz6")
                    condition = false
                    corborda = errado
                    texto = feedbackerrado3
                    certoouerrado = "Resposta Incorreta!"
                    certoouerradocor = errado

                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("quizz6")
                    condition = false
                    corborda = correto
                    texto = feedbackcorreto3
                    certoouerrado = "Resposta Correta!"
                    certoouerradocor = correto

                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }

    }
}

@Composable
fun Quizz_Correção3(navController: NavController) {
    var valor = 0
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)
    val splashScreenDuration = 7000L
    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        condition = true
        navController.navigate("aprovação_quizz") {
            popUpTo("quizz6") { inclusive = true }
        }
    }
    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {
            timer(navController)

            Card(
                modifier = Modifier
                    .size(width = 200.dp, height = 200.dp)
                    .padding(top = paddingValue.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_with_text),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .fillMaxWidth()

                )
            }
            val corText = indigo_dye.copy(alpha = 0.5f)
            Text(
                "Questão 3 de 3",
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                fontSize = 18.sp,
                style = TextStyle(color = corText),
                modifier = Modifier
                    .padding(top = paddingValue.dp)
                    .fillMaxWidth()
                    .padding(start = paddingValue.dp)
            )

            val paddingValue1 = (screenWidth * 0.05)
            Text(
                "A DevEmpower oferece apenas materiais de aula e " +
                        "não oferece mentorias ou quizzes interativos.",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                //fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = paddingValue.dp,
                        end = paddingValue1.dp,
                        bottom = paddingValue.dp
                    )
            )

            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {


                    Text(
                        "True",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = errado,
                        //fontFamily = fontPoppins,
                        style = TextStyle(corText)

                    )

                }
            }
            Spacer(modifier = Modifier.padding(paddingValue1.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {},
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "False",
                        fontSize = 32.sp,
                        color = correto,
                        fontWeight = FontWeight.SemiBold,
                        //fontFamily = fontPoppins

                    )
                }
            }

        }
    }
    card_feedback()
}

@Composable
fun Aprovação_Quizz(navController: NavController) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.12)
    val paddingValue1 = (screenWidth * 0.05)
    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = paddingValue.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.aprova__o_quizz),
                contentDescription = "Aprovação",
                modifier = Modifier
                    .size(width = 350.dp, height = 350.dp)
                    .fillMaxWidth()
            )
            Box() {
                Text(
                    "PARABÉNS",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    //fontFamily = fontPoppins,
                    color = indigo_dye
                )
                Image(
                    painter = painterResource(R.drawable.parabens_icon),
                    contentDescription = "Parabéns icone",
                    modifier = Modifier
                        .size(25.dp)
                        .align(Alignment.TopEnd)
                        .offset(x = 10.dp, y = (-2).dp)
                )
            }
            Text(
                modifier = Modifier
                    .padding(
                        start = paddingValue1.dp,
                        end = paddingValue1.dp,
                        top = paddingValue1.dp
                    ),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontSize = 24.sp,
                            color = indigo_dye,
                            //fontFamily = fontPoppins
                        )
                    ) {
                        append("Você ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            //fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("concluiu")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 24.sp,
                            //fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append(" a primeira aula sobre a ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            //fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("DevEmpower ")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontSize = 24.sp,
                            //fontFamily = fontPoppins,
                            color = indigo_dye
                        )
                    ) {
                        append("agora poderá avançar ")
                    }

                },
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.padding(paddingValue.dp))
            Button(
                colors = ButtonDefaults.buttonColors(indigo_dye),
                onClick = {
                    navController.navigate("material")
                },
                modifier = Modifier
                    .size(width = 280.dp, height = 80.dp)

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "Finalizar",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        //fontFamily = fontPoppins
                    )
                }
            }

        }
    }
}


@Preview
@Composable
private fun AulaPreview() {
    DevEmpowerTheme {
        Quizz_Pergunta1(rememberNavController())

    }
}

@Preview
@Composable
private fun AulaPreview1() {
    DevEmpowerTheme {
        Quizz_Correção1(rememberNavController())

    }
}

@Preview
@Composable
private fun AulaPreview2() {
    DevEmpowerTheme {
        Quizz_Pergunta2(rememberNavController())
    }
}

@Preview
@Composable
private fun AulaPreview3() {
    DevEmpowerTheme {
        Quizz_Correção2(rememberNavController())
    }
}

@Preview
@Composable
private fun AulaPreview4() {
    DevEmpowerTheme {
        Quizz_Pergunta3(rememberNavController())
    }
}

@Preview
@Composable
private fun AulaPreview5() {
    DevEmpowerTheme {
        Quizz_Correção3(rememberNavController())
    }
}

@Preview
@Composable
private fun AulaPreview6() {
    DevEmpowerTheme {
        Aprovação_Quizz(rememberNavController())
    }
}

