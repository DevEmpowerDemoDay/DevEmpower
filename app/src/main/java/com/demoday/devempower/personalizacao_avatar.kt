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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

var avatar_escolhido = 0
var foto_avatar = 1


@Composable
fun tela_avatares(navController: NavController) {


    Column(
        modifier = Modifier
            .background(uranium_blue)
            .fillMaxSize()

    ) {
//Conteudo
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .size(width = 373.dp, height = 642.dp)
                    .border(5.dp, color = indigo_dye, shape = RoundedCornerShape(50.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Card(
                        modifier = Modifier
                            .size(width = 242.dp, height = 99.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally)
                            .offset(y = (-48).dp),
                        colors = CardDefaults.cardColors(indigo_dye),
                        shape = RoundedCornerShape(30.dp)

                    ) {
                        Text(
                            "Escolha\n" +
                                    "um Avatar ",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium,
                            color = white_smoke,
                            textAlign = TextAlign.Center,
                            // fontFamily = fontPoppins,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 20.dp)

                        )
                    }

                    Spacer(
                        modifier = Modifier.padding(top = 10.dp)
                    )

                    //Conteudo que vou preencher da box

                    Box(
                        modifier = Modifier.align(
                            alignment = Alignment.CenterHorizontally
                        )

                    ) {
                        Column {

                            var isBlueBackground  = remember { mutableStateListOf(false, false, false, false, false, false, false, false, false) }

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.debora),
                                    contentDescription = "Avatar Murilo",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 1
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            // Alterna o estado para o índice correspondente
                                            isBlueBackground[0] = !isBlueBackground[0]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[0])  {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.andressa),
                                    contentDescription = "Avatar Andressa",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 2
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground [1] = !isBlueBackground[1]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[1]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.anna),
                                    contentDescription = "Avatar Anna",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 3
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[2] = !isBlueBackground[2]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[2]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                            }

                            Spacer(
                                modifier = Modifier.padding(top = 20.dp)
                            )

                            Row {

                                Image(
                                    painter = painterResource(id = R.drawable.murilo),
                                    contentDescription = "Avatar Murilo",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 4
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[3] = !isBlueBackground[3]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[3]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }
                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.lusbel),
                                    contentDescription = "Avatar Andressa",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 5
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[4] = !isBlueBackground[4]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[4]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.hudson),
                                    contentDescription = "Avatar Anna",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 6
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[5] = !isBlueBackground[5]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[5]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                            }

                            Spacer(
                                modifier = Modifier.padding(top = 20.dp)
                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.matheus),
                                    contentDescription = "Avatar Murilo",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 7
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[6] = !isBlueBackground[6]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[6]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }
                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.victor),
                                    contentDescription = "Avatar Andressa",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 8
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[7] = !isBlueBackground[7]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[7]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                                Spacer(
                                    modifier = Modifier.padding(end = 10.dp)
                                )

                                Image(
                                    painter = painterResource(id = R.drawable.maykon),
                                    contentDescription = "Avatar Anna",
                                    modifier = Modifier
                                        .size(width = 87.19.dp, height = 85.4.dp)
                                        .clickable {
                                            avatar_escolhido = 9
                                            // Define todos os outros itens como `false` para cada clique
                                            isBlueBackground.indices.forEach { index ->
                                                isBlueBackground[index] = false
                                            }
                                            isBlueBackground[8] = !isBlueBackground[8]
                                        }
                                        .drawBehind {
                                            val borderWidth = 90.dp.toPx()
                                            if (isBlueBackground[8]) {
                                                drawRect(
                                                    color = indigo_dye,
                                                    topLeft = androidx.compose.ui.geometry.Offset(
                                                        0f, size.height - borderWidth
                                                    ),
                                                    size = androidx.compose.ui.geometry.Size(
                                                        size.width, borderWidth
                                                    )
                                                )
                                            }
                                        }

                                )

                            }

                        }

                    }

                    Spacer(
                        modifier = Modifier.padding(top = 50.dp)
                    )

                    Button(
                        onClick = { navController.navigate("home") },
                        modifier = Modifier
                            .size(width = 156.dp, height = 50.dp)
                            .align(alignment = Alignment.CenterHorizontally),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(bright_Violet)

                    ) {
                        Text(
                            "Salvar",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = white_smoke,
                            // fontFamily = fontPoppins
                        )
                    }


                }

            }

        }

    }
}

@Preview
@Composable
private fun PreviewTelaAvatares() {
    DevEmpowerTheme {
        tela_avatares(rememberNavController())
    }

}