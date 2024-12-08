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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import kotlinx.coroutines.delay

@Composable
fun Cadastro(navController: NavController) {
    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .padding(top = 45.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo DevEmpower",
                modifier = Modifier.size(65.dp)
            )
            Text(
                text = "Cadastro",
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = fontPoppins,
                color = indigo_dye,
                modifier = Modifier.padding(top = 20.dp)

            )
            Image(
                painter = painterResource(R.drawable.gradient_line),
                contentDescription = "Linha azul",
                modifier = Modifier
                    .width(175.dp)
                    .height(10.dp)
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                androidx.compose.material.Text(
                    "Nome: ",
                    fontSize = 18.sp,
                    color = midnight_blue,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins,
                )
            }

            Spacer(modifier = Modifier.padding(top = 5.dp))


            var nome by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = nome,
                onValueChange = { novoTexto -> nome = novoTexto },
                modifier = Modifier
                    .width(321.62.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(7.dp),
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                androidx.compose.material.Text(
                    "Email: ",
                    fontSize = 18.sp,
                    color = midnight_blue,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins,
                )
            }

            Spacer(modifier = Modifier.padding(top = 5.dp))


            var email by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = email,
                onValueChange = { novoTexto -> email = novoTexto },
                modifier = Modifier
                    .width(321.62.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(7.dp),
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                androidx.compose.material.Text(
                    "Senha: ",
                    fontSize = 18.sp,
                    color = midnight_blue,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins,
                )
            }

            Spacer(modifier = Modifier.padding(top = 5.dp))


            var senha by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = senha,
                onValueChange = { novoTexto -> senha = novoTexto },
                modifier = Modifier
                    .width(321.62.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(7.dp),
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.padding(top = 10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                androidx.compose.material.Text(
                    "Confirmar Senha: ",
                    fontSize = 18.sp,
                    color = midnight_blue,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins,
                )
            }

            Spacer(modifier = Modifier.padding(top = 5.dp))


            var senha1 by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = senha1,
                onValueChange = { novoTexto -> senha1 = novoTexto },
                modifier = Modifier
                    .width(321.62.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(7.dp),
                textStyle = TextStyle(
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    textAlign = TextAlign.Start
                ),
                singleLine = true
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Button(
                onClick = { navController.navigate("novocadastro") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = indigo_dye
                ),

                modifier = Modifier
                    .size(width = 159.dp, height = 42.dp),
                shape = RoundedCornerShape(7.dp)
            ) {
                androidx.compose.material3.Text(
                    text = "Cadastrar",
                    color = white_smoke,
                    fontSize = 20.sp,
                     fontFamily = fontPoppins,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
            }

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Column {
                Row {
                    Text(
                        "Ao continuar, estou de acordo com os",
                        fontSize = 13.sp,
                        fontFamily = fontPoppins
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Termos de Uso",
                        fontSize = 13.sp,
                        color = indigo_dye,
                        fontFamily = fontPoppins,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
                Row {
                    Text(
                        "e com o ",
                        fontSize = 13.sp,
                        fontFamily = fontPoppins,
                        modifier = Modifier
                            .padding(start = 70.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Aviso de Privacidade ",
                        fontSize = 13.sp,
                        color = indigo_dye,
                        fontFamily = fontPoppins,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
            }

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Image(
                painter = painterResource(R.drawable.gradient_line),
                contentDescription = "Linha azul",
                modifier = Modifier
                    .width(175.dp)
                    .height(10.dp)
            )

            Spacer(modifier = Modifier.padding(top = 15.dp))

            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = indigo_dye
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .size(width = 281.dp, height = 48.dp)
                    .fillMaxSize()
            ) {

                Row {

                    Text(
                        text = "Já tem uma conta ?",
                        color = Color.White,
                        fontSize = 14.sp,
                         fontFamily = fontPoppins,
                        modifier = Modifier.align(alignment = Alignment.CenterVertically)
                    )
                    Text(
                        text = "Conecte-se",
                        color = Color.White,
                        fontSize = 14.sp,
                         fontFamily = fontPoppins,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                            .padding(start = 5.dp)
                    )
                }
            }


        }
    }
}


@Composable
fun NewCadastro(navController: NavController) {
    val splashScreenDuration = 1000L // 1000 ms = 1 segundos

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("login") {
            popUpTo("login") { inclusive = true }
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        androidx.compose.material.Text(
            "Conta cadastrada " +
                    "com sucesso!",
            fontSize = 28.sp,
            textAlign = TextAlign.Center,

            fontFamily = fontPoppins,
            fontWeight = FontWeight.SemiBold,
            color = midnight_blue
        )
    }
}


@Preview
@Composable
private fun CadastroPreview() {
    DevEmpowerTheme {
        Cadastro(rememberNavController())
    }
}

@Preview
@Composable
private fun NewPreview() {
    DevEmpowerTheme {
        NewCadastro(rememberNavController())
    }
}