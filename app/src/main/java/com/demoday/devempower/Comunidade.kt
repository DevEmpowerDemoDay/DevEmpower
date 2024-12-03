package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay



var listaDeComentarios = mutableStateListOf<String>()

var listaDeNomes = mutableStateListOf<String>()


@Composable
fun CardComentario(nome1: String = "", comentario1: String = "") {
    Spacer(modifier = Modifier.padding(top = 10.dp))

    Box(
        modifier = Modifier
            .width(346.dp)
            .wrapContentHeight(),// aumenta automaticamente a altura para o conteúdo
        contentAlignment = Alignment.Center,
    ) {
        Card(
            modifier = Modifier
                .width(346.dp)
                .wrapContentHeight(),// aumenta automaticamente a altura para o conteúdo
            colors = CardDefaults.cardColors(containerColor = pale_sky_blue),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()

            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Spacer(modifier = Modifier.padding(start = 20.dp))

                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Avatar",
                        modifier = Modifier
                            .size(30.dp)
                    )

                    Spacer(modifier = Modifier.padding(start = 10.dp))

                    Text(
                        text = nome1,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        // fontFamily = fontPoppins,
                        color = pale_hex,
                        textAlign = TextAlign.Center
                    )
                }

                Text(
                    text = comentario1,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                    // fontFamily = fontPoppins,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .padding(15.dp)
                )

            }


        }
    }
}

@Composable
fun ComunidadeSplash(navController: NavController) {


    val splashScreenDuration = 500L // 500 ms = 0.5 segundos

    val systemUiController = rememberSystemUiController()

    systemUiController.setStatusBarColor(
        uranium_blue
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("comentario") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo DevEmpower",
            modifier = Modifier
                .padding(top = 180.dp)
                .size(width = 270.dp, height = 185.dp)

        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text(
            "Comunidade",
            fontSize = 32.sp,
            fontWeight = FontWeight.Medium,
            color = indigo_dye
        )



        Image(
            modifier = Modifier.padding(top = 180.dp),
            painter = painterResource(R.drawable.logo_proa),
            contentDescription = "LogoDevEmpower"
        )
    }

}

@Composable
fun Comunidade(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottomback),
                contentDescription = "Botão de voltar",
                modifier = Modifier
                    .offset(x = (-35).dp)
                    .size(35.68.dp)
                    .clickable { navController.navigate("home") }
            )

            Card(
                modifier = Modifier
                    .size(width = 230.dp, height = 40.dp)
                    .offset(x = (-20).dp),
                colors = CardDefaults.cardColors(containerColor = indigo_dye),
                shape = RoundedCornerShape(30.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "Comunidade",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.buttons),
            contentDescription = "",
            modifier = Modifier.size(45.dp)
        )
        Card(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(width = 360.dp, height = 563.dp)
                .clip(RoundedCornerShape(30.dp)),
            colors = CardDefaults.cardColors(containerColor = indigo_dye),


            ) {
            Spacer(modifier = Modifier.padding(top = 10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Text(
                    "Comentários",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    // fontFamily = fontPoppins,
                    color = Color(0xFFFFAEDFF7)
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {
                    for (i in listaDeComentarios.indices) {
                        var nome1 = listaDeNomes[i]
                        var comentario1 = listaDeComentarios[i]
                        CardComentario(nome1 = nome1, comentario1 = comentario1)

                    }
                }

                Spacer(modifier = Modifier.padding(top = 10.dp))


            }
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("camera") },
            modifier = Modifier
                .size(width = 320.dp, height = 40.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
        ) {
            Row {
                Text(
                    "Fazer uma postagem ",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White,
                    modifier = Modifier.padding(top = 2.dp)
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Image(
                    painter = painterResource(id = R.drawable.arrow_blue),
                    contentDescription = "Enviar",
                    modifier = Modifier
                        .size(22.dp)
                        .offset(x = 20.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
        }





        Spacer(modifier = Modifier.padding(top = 20.dp))

        BottomBar(navController)


    }
}


@Composable
fun Camera(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottomback),
                contentDescription = "Botão de voltar",
                modifier = Modifier
                    .offset(x = (-35).dp)
                    .size(35.68.dp)
                    .clickable { navController.navigate("home") }
            )

            Card(
                modifier = Modifier
                    .size(width = 230.dp, height = 40.dp)
                    .offset(x = (-20).dp),
                colors = CardDefaults.cardColors(containerColor = indigo_dye),
                shape = RoundedCornerShape(30.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text(
                        "Comunidade",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.buttons_meio),
            contentDescription = "",
            modifier = Modifier.size(45.dp)
        )


        Text(
            "Lembre-se de Sorrir ",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            // fontFamily = fontPoppins,
            color = pale_hex,
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("comunidade") },
            modifier = Modifier
                .size(width = 170.dp, height = 53.6.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)

        ) {
            Text(
                "Tirar uma foto ?",
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.padding(top = 2.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            androidx.compose.material.Text(
                "Informe o seu nome: ",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = indigo_dye,
                // fontFamily = fontPoppins,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 5.dp)
                    .width(300.62.dp)
            )

            Spacer(modifier = Modifier.padding(top = 5.dp))

            OutlinedTextField(
                value = nome1,
                onValueChange = { newtext -> nome1 = newtext },
                modifier = Modifier
                    .width(300.62.dp),
                textStyle = TextStyle(
                    fontSize = 18.sp, textAlign = TextAlign.Start
                ),
                singleLine = true
            )
        }


        Spacer(modifier = Modifier.padding(top = 20.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            androidx.compose.material.Text(
                "Oque quer compartilhar com \n nossos usuários ? ",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = indigo_dye,
                // fontFamily = fontPoppins,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 5.dp)
                    .width(300.62.dp)
            )

            Spacer(modifier = Modifier.padding(top = 8.dp))

            OutlinedTextField(
                value = comentario1,
                onValueChange = { newtext -> comentario1 = newtext },
                modifier = Modifier
                    .width(300.62.dp),
                textStyle = TextStyle(
                    fontSize = 18.sp, textAlign = TextAlign.Start
                ),
                singleLine = true
            )
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = {
                navController.navigate("comentario")
                if (nome1.isNotEmpty() && comentario1.isNotEmpty()) {
                    // Adiciona o comentário à lista
                    listaDeComentarios.add(
                        "$comentario1"
                    )
                    listaDeNomes.add(
                        "$nome1"
                    )
                    nome1 = ""
                    comentario1 = ""
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = bright_Violet),
            modifier = Modifier
                .size(width = 156.dp, height = 42.dp),
            shape = RoundedCornerShape(10.dp),

            ) {
            Text(
                "Publicar",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                color = Color.White,
            )

        }


    }
}


@Preview
@Composable
private fun Preview() {
    DevEmpowerTheme {
        ComunidadeSplash(rememberNavController())
    }

}

@Preview
@Composable
private fun ComunidadPreview() {
    DevEmpowerTheme {
        Comunidade(rememberNavController())
    }

}

@Preview
@Composable
private fun ComunidadePreview() {
    DevEmpowerTheme {
        Camera(rememberNavController())
    }
}