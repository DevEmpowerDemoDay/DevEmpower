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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
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
                .height(263.dp)
                .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 30.dp))
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
            onClick = { navController.navigate("perfil1") },
            modifier = Modifier
                .width(200.dp)
                .height(40.dp)
                .offset(y = (-20).dp)
                .clip(RoundedCornerShape(8.dp))
                .background(bright_blue)
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
                    fontFamily = fontPoppins
                )
                Spacer(modifier = Modifier.width(4.dp))
                Image(
                    painter = painterResource(R.drawable.icon),
                    contentDescription = "Icon",
                    modifier = Modifier
                        .fillMaxSize()
                        .offset(y = 2.dp)
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
                    .padding(10.dp)
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
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            ContainerEvents("Mentorias")
            ContainerEvents("Materiais")
        }

        Spacer(modifier = Modifier.height(20.dp))

        BottomBar(navController)

    }
}

@Composable
fun BottomBar(navController: NavController) {
    val selectedIndex = remember { mutableIntStateOf(1) }

    Box(modifier = Modifier.fillMaxSize()) {
        // Elemento de fundo (decorativo)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .align(Alignment.Center) // Centralizado dentro do BottomBar
                .background(indigo_dye, shape = RoundedCornerShape(38.dp))
        )

        BottomNavigation(
            modifier = Modifier.fillMaxSize(),
            backgroundColor = Color.Transparent,
            elevation = 0.dp
        ) {
            val selectedItem = Modifier
                .width(30.dp)
                .height(50.dp)
                .offset(y = (-20).dp)
                .padding(horizontal = 40.dp)
                .border(4.dp, color = uranium_blue, shape = RoundedCornerShape(30.dp))
                .align(Alignment.CenterVertically)
                .background(indigo_dye, shape = RoundedCornerShape(30.dp))

            val unselectedItem = Modifier
                .width(30.dp)
                .height(50.dp)
                .padding(horizontal = 40.dp)
                .align(Alignment.CenterVertically)

            // Primeiro item de navegação
            BottomNavigationItem(
                icon = {
                    BottomIcon(
                        painterResource(R.drawable.comunidade_icon),
                        "Ícone da aba de Comunidade, um grupo de pessoas"
                    )
                },
                onClick = {
                    selectedIndex.intValue = 0 // Define o índice do item selecionado como 0
                },
                selected = selectedIndex.intValue == 0,
                modifier = if (selectedIndex.intValue == 0) selectedItem else unselectedItem
            )

            // Segundo item de navegação
            BottomNavigationItem(
                icon = {
                    BottomIcon(
                        painterResource(R.drawable.home_icon),
                        "Ícone da aba de Home, Casa"
                    )
                },
                onClick = {
                    selectedIndex.intValue = 1 // Define o índice do item selecionado como 1
                },
                selected = selectedIndex.intValue == 1,
                modifier = if (selectedIndex.intValue == 1) selectedItem else unselectedItem
            )

            // Terceiro item de navegação
            BottomNavigationItem(
                icon = {
                    BottomIcon(
                        painterResource(R.drawable.material_icon),
                        "Ícone da aba de Material, quebra-cabeça"
                    )
                },
                onClick = {
                    selectedIndex.intValue = 2 // Define o índice do item selecionado como 2
                },
                selected = selectedIndex.intValue == 2,
                modifier = if (selectedIndex.intValue == 2) selectedItem else unselectedItem
            )
        }
    }
}


@Composable
fun BottomIcon(painter: Painter, description: String) {
    val iconSize = 22.dp
    Icon(
        painter = painter,
        contentDescription = description,
        tint = white_smoke,
        modifier = Modifier
            .size(iconSize)
            .background(indigo_dye)
    )
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
        ) {
            Image(
                painter = painterResource(R.drawable.event_asset),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(60.dp)
            )
            Text(
                text,
                color = indigo_dye,
                fontFamily = fontPoppins,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                letterSpacing = 2.sp,
                modifier = Modifier.padding(end = 15.dp)
            )
            Image(
                painter = painterResource(R.drawable.arrow),
                contentDescription = "Icon",
                modifier = Modifier
                    .size(35.dp)

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
        Home(rememberNavController())
    }
}