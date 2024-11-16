package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
    val systemUiController = rememberSystemUiController()

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
                .padding(horizontal = 5.dp)
                .width(399.dp)
                .height(263.dp)
                .clip(RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp))
                .background(indigo_dye),
        ) {

            Column(
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(vertical = 20.dp)
                        .size(70.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(white_smoke)
                        .padding(horizontal = 14.dp)
                )

                Column(verticalArrangement = Arrangement.spacedBy((-15).dp)) {
                    Text("Bem vindo,", color = white_smoke, fontSize = 15.sp)
                    Text(
                        " Desenvolvedor",
                        color = white_smoke,
                        fontSize = 40.sp,
                        fontFamily = fontPoppins,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        textAlign = TextAlign.Center
                    )
                }


            }
        }

        // Botão Acessar Perfil
        Button(
            onClick = { /* Ação do botão */ },
            modifier = Modifier
                .width(200.dp)
                .height(40.dp)
                .offset(y = (-20).dp)
                .clip(RoundedCornerShape(4.dp))
                .background(bright_blue)
                .align(Alignment.CenterHorizontally),
            contentPadding = PaddingValues(0.dp),
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
                    fontFamily = fontPoppins
                )
                Spacer(modifier = Modifier.width(8.dp))

                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "Icon",
                    modifier = Modifier
                        .size(20.dp)
                        .border(2.dp, white_smoke, RoundedCornerShape(50.dp))
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
                            fontWeight = FontWeight.Bold, fontSize = 20.sp, fontFamily = fontPoppins
                        )
                    ) {
                        append("Categorias")
                    }
                }, color = indigo_dye, modifier = Modifier.align(Alignment.Center)
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
                    .paint(
                        painter = painterResource(R.drawable.comunidade_asset),
                        contentScale = ContentScale.FillWidth
                    )
                    .weight(1f)
                    .padding(horizontal = 5.dp)
            ) {
                ContentBox(
                    "Comunidade",
                    Modifier
                        .width(150.dp)
                        .height(30.dp)
                        .offset(y = 22.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(indigo_dye)
                        .align(Alignment.BottomCenter)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
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
                        .offset(y = 22.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(indigo_dye)
                        .align(Alignment.BottomCenter)
                        .zIndex(2f)  // Garantir que o texto fique acima da borda
                )
            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            ContainerEvents("Eventos")
            ContainerEvents("Materiais")
        }


    }
}


@Composable
fun ContainerEvents(text: String) {

    Box(
        modifier = Modifier
            .width(326.dp)
            .height(63.dp)
            .border(1.dp, color = indigo_dye, shape = RoundedCornerShape(8.dp))

    ) {

        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.event_asset),
                contentDescription = "Icon",
                modifier = Modifier
                    .padding(10.dp)
                    .size(50.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (-25).dp, y = (-2).dp)
            ) {
                Text(
                    text,
                    color = indigo_dye,
                    fontFamily = fontPoppins,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )
                Text(
                    "10 $text disponíveis",
                    color = indigo_dye,
                    fontFamily = fontPoppins,
                    fontWeight = FontWeight.Bold
                )
            }
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
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontFamily = fontPoppins,
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
        ContainerEvents("teste")
    }
}