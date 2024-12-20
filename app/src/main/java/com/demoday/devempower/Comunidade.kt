package com.demoday.devempower

import android.view.Gravity
import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
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
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
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


var listaDeComentarios = mutableStateListOf<String>()
var listaDeImagens = mutableStateListOf(
    R.drawable.murilo,
    R.drawable.andressa,
    R.drawable.anna,
    R.drawable.maykon,
    R.drawable.lusbel,
    R.drawable.matheus,
    R.drawable.victor,
    R.drawable.hudson
)
var listaDeNomes = mutableStateListOf<String>()
var escolha_foto = 0

@Composable
fun CardComentario(nome1: String = "", comentario1: String = "",foto_comunidade1: Int = 0) {




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
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 20.dp)
            ) {
                Spacer(modifier = Modifier.padding(start = 20.dp))

                Image(
                    painter = painterResource(id = foto_comunidade1),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(40.dp)
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text(
                    text = nome1,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                   fontFamily = fontPoppins,
                    color = pale_hex,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth()

            ) {

                Text(
                    text = comentario1,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                   fontFamily = fontPoppins,
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
fun Comunidade(navController: NavController) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    val paddingValue = (screenWidth * 0.11)
    val paddingValue1 = (screenWidth * 0.05)
    val paddingValue2 = (screenWidth * 0.20)
    val paddingValue3 = (screenWidth * 0.09)
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
                        fontFamily = fontPoppins,
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
                .size(width = 360.dp, height = 518.dp)
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
                    fontFamily = fontPoppins,
                    color = Color(0xFFFFAEDFF7)
                )

                Spacer(modifier = Modifier.padding(top = 10.dp))

                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {

                    for (i in listaDeComentarios.indices) {
                        val nomeAtual = listaDeNomes[i]
                        val comentarioAtual = listaDeComentarios[i]
                        val fotoAtual = listaDeImagens[i]

                        CardComentario(
                            foto_comunidade1 = fotoAtual,
                            nome1 = nomeAtual,
                            comentario1 = comentarioAtual
                        )
                    }
                }
                val context = LocalContext.current
                if (listaDeComentarios.count() == 7) {
                listaDeImagens.add(
                    R.drawable.mentoria_murilo
                )
                    if (listaDeComentarios.count() == 20) {
                        listaDeImagens.add(R.drawable.mentoria_murilo)
                    }
                }
                else if (listaDeComentarios.count() == 50) {
                    val toast = Toast.makeText(context, "Material Bloqueado", Toast.LENGTH_SHORT)
                    toast.setGravity(
                        Gravity.TOP,
                        0,
                        100
                    ) // TOP posiciona no topo, com deslocamento vertical
                    toast.show()
                }

                Spacer(modifier = Modifier.padding(top = 10.dp))


            }
        }

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("camera") },
            modifier = Modifier
                .size(width = 320.dp, height = 50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye)
        ) {
            Row {
                Text(
                    "Fazer uma postagem ",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins    ,
                    color = Color.White,
                    modifier = Modifier.padding(top = 2.dp)
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Image(
                    painter = painterResource(id = R.drawable.arrow_blue),
                    contentDescription = "Enviar",
                    modifier = Modifier
                        .size(25.dp)
                        .offset(x = 20.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }
        }





        Spacer(modifier = Modifier.width(8.dp))

        Spacer(
            modifier = Modifier
                .padding(bottom = paddingValue3.dp)
        )


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
                Box( ){

                    Image(
                        painter = painterResource(R.drawable.bottombar),
                        contentDescription = "",
                        modifier = Modifier
                            .size(80.dp)
                            .offset(y = (-11).dp)
                            .offset(x = (-10).dp)
                    )
                androidx.compose.material3.Card(
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(indigo_dye),
                    modifier = Modifier
                        .size(width = 55.dp, height = 56.dp)
                        .fillMaxWidth()
                        .offset(y = (-20).dp)
                        .offset(x = 2.dp)
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
                            painter = painterResource(R.drawable.comunidade_icon),
                            contentDescription = "",
                            modifier = Modifier
                                .size(25.dp)
                        )
                    }
                }
                }
                Image(
                    painter = painterResource(R.drawable.home_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .size(26.dp)
                        .offset(x = (-25).dp)
                        .clickable { navController.navigate("home") }
                )

                Image(
                    painter = painterResource(R.drawable.material_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .offset(x = (-5).dp)
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
                        fontFamily = fontPoppins,
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
            fontFamily = fontPoppins,
            color = pale_hex,
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { navController.navigate("comentario") },
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
                fontFamily = fontPoppins,
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
                fontFamily = fontPoppins,
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
                    listaDeComentarios.add(comentario1)
                    listaDeNomes.add(nome1)
                   // nome1 = ""
                   // comentario1 = ""
                    escolha_foto = (0..6).random()
                    listaDeImagens.add(listaDeImagens[escolha_foto])


                    // Limpa os campos

                }

            },
            colors = ButtonDefaults.buttonColors(containerColor = indigo_dye),
            modifier = Modifier
                .size(width = 156.dp, height = 42.dp),
            shape = RoundedCornerShape(10.dp),

            ) {
            Text(
                "Publicar",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                fontFamily = fontPoppins,
                textAlign = TextAlign.Center,
                color = Color.White,
            )

        }


    }
}


@Preview
@Composable
private fun ComuniPreview() {
    DevEmpowerTheme {
        Comunidade(rememberNavController())
    }

}

@Preview
@Composable
private fun ComunidaPreview() {
    DevEmpowerTheme {
        Camera(rememberNavController())
    }

}