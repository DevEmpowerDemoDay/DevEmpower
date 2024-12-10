package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
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
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun Home(navController: NavController) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.11)
    val paddingValue1 = (screenWidth * 0.05)
    val paddingValue2 = (screenWidth * 0.20)
    val paddingValue3 = (screenWidth * 0.09)

    val systemUiController = rememberSystemUiController()

    foto_avatar = when (avatar_escolhido) {
        1 -> R.drawable.debora
        2 -> R.drawable.andressa
        3 -> R.drawable.anna
        4 -> R.drawable.murilo
        5 -> R.drawable.lusbel
        6 -> R.drawable.hudson
        7 -> R.drawable.matheus
        8 -> R.drawable.victor
        else -> R.drawable.maykon

    }


    // define cores da barra de status e da barra de navegação
    systemUiController.setStatusBarColor(
        indigo_dye
    )

    systemUiController.setNavigationBarColor(
        uranium_blue, darkIcons = true
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(uranium_blue)
    ) {
        //Menu suspenso
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 30.dp))
                .background(indigo_dye),
        ) {

            Column(
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(foto_avatar),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(width = 87.19.dp, height = 85.4.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .padding(horizontal = 14.dp)
                        .clickable {
                            navController.navigate("personalização")
                        }
                )

                Column() {
                    Text(
                        "Bem vindo,",
                      color = white_smoke,
                      fontSize = 15.sp,
                     // fontFamily = fontPoppins
                                )
                    Text(
                        "$nome_usuario",
                        color = white_smoke,
                        fontSize = 40.sp,
                       // fontFamily = fontPoppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center
                    )
                }


            }
        }

        // Botão Acessar Perfil
        Button(
            onClick = { navController.navigate("perfil1") },
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .offset(y = (-20).dp)
                .clip(RoundedCornerShape(8.dp))
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = bright_blue, contentColor = white_smoke
            )
        ) {
            Row(
                Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Acessar perfil",
                    color = white_smoke,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                  // fontFamily = fontPoppins
                )
                Spacer(modifier = Modifier.padding(start = 6.dp))
                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "Icon",
                    modifier = Modifier
                        .size(25.dp)
                        .fillMaxSize()
                        .align(Alignment.CenterVertically)
                )
            }
        }

        // Texto do "Explorar por Categorias"
        Box(
            Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = buildAnnotatedString {
                    append("Explorar por ")
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, fontSize = 22.sp,
                          //  fontFamily = fontPoppins
                        )
                    ) {
                        append("Categorias",)
                    }
                }, color = indigo_dye,
                modifier = Modifier
                    .align(Alignment.Center)
            )
        }

        Row(
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .padding(10.dp)
                    .paint(
                        painter = painterResource(R.drawable.comunidade_asset),
                        contentScale = ContentScale.FillWidth
                    )
                    .weight(1f)
                    .padding(horizontal = 5.dp)
                    .clickable { navController.navigate("comentario") }
            ) {
                ContentBox(
                    "Comunidade",
                    Modifier
                        .width(150.dp)
                        .height(30.dp)
                        .offset(y = 24.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(indigo_dye)
                        .align(Alignment.BottomCenter)
                        .clickable { }
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .clickable {
                        navController.navigate("home")
                    }
                    .width(150.dp)
                    .height(150.dp)
                    .padding(10.dp)
                    .paint(
                        painter = painterResource(R.drawable.conteudo_asset),
                        contentScale = ContentScale.FillWidth
                    )
                    .weight(1f)

            ) {
                ContentBox(
                    "Conteúdo",
                    Modifier
                        .width(150.dp)
                        .height(30.dp)
                        .offset(y = 24.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(indigo_dye)
                        .align(Alignment.BottomCenter)
                        .clickable {}
                )
            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            ContainerEvents(
                "Mentorias Dev",
                onClick = {
                    navController.navigate("mentoria")

                })
            ContainerEvents(
                "Materiais de Aula",
                onClick = { navController.navigate("material") })
        }



        Spacer(modifier = Modifier.padding(top = paddingValue3.dp))

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
                            navController.navigate("comentario")
                        }
                )

                Box(){

                    Image(
                        painter = painterResource(R.drawable.bottombar),
                        contentDescription = "",
                        modifier = Modifier
                            .size(82.dp)
                            .align(Alignment.Center)
                            .offset(y = (-11).dp)
                            .offset(x = 0.5.dp)
                    )

                androidx.compose.material3.Card(
                    colors = CardDefaults.cardColors(indigo_dye),
                    shape = androidx.compose.foundation.shape.CircleShape,
                    modifier = Modifier
                        .size(width = 55.dp, height = 56.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.Center)
                        .offset(y = (-22).dp)

                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
//                            .border(
//                                5.dp,
//                                uranium_blue,
//                                shape = androidx.compose.foundation.shape.CircleShape
//                            )
                    ) {

                            Image(
                                painter = painterResource(R.drawable.home_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(26.dp)
                            )


                    }
                }
                }


                Image(
                    painter = painterResource(R.drawable.material_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .size(26.dp)
                        .clickable {
                            navController.navigate("material")
                        }
                )

            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .size(width = 357.dp, height = 66.dp)
                    .border(5.dp, color = Color.Transparent, shape = RoundedCornerShape(50.dp))


            )

        }
    }
}

@Composable
fun ContainerEvents(text_titulo: String, onClick: () -> Unit) {

    Box(
        modifier = Modifier
            .width(326.dp)
            .height(70.dp)
            .border(1.dp, color = indigo_dye, shape = RoundedCornerShape(8.dp))
            .clickable { onClick() }

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.event_asset),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(60.dp)
            )
            Column {

                Text(
                    text = text_titulo,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                   // fontFamily = fontPoppins,
                    color = indigo_dye,
                    modifier = Modifier
                        .padding(start = 2.dp)
                )
            }
            Image(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(35.dp)
                    .padding(start = 10.dp)

            )
        }

    }
}


@Composable
fun ContentBox(text: String, modifier: Modifier) {
    Box(
        modifier = modifier

    ) {
        Text(
            text,
            color = white_smoke,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            //fontFamily = fontPoppins,
            modifier = Modifier
                .align(Alignment.Center)
                .zIndex(1f)
        )
    }
}

@Preview
@Composable
private fun BottomPreview() {
    DevEmpowerTheme {
        Home(rememberNavController())
    }
}