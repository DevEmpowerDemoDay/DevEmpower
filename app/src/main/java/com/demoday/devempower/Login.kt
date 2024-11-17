package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }
    var rememberMe by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.paint(
            painter = painterResource(R.drawable.background_color),
            contentScale = ContentScale.Crop
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(top = 103.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo DevEmpower",
                modifier = Modifier.size(70.dp)
            )
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium,
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
            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = {
                    Text(
                        "E-mail ou nome de usuário",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.mail_asset),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier.width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = indigo_dye, unfocusedBorderColor = indigo_dye

                ),
                singleLine = true
            )

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = { Text("Senha", fontSize = 16.sp, fontWeight = FontWeight.Medium) },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.hide_password),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .padding(top = 8.dp)
                    .width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = indigo_dye, unfocusedBorderColor = indigo_dye

                ),
                singleLine = true
            )
            Text("Esqueci minha senha",
                fontSize = 16.sp,
                color = indigo_dye,
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp)
                    .padding(end = 180.dp)
                    .clickable { navController.navigate("recsenha") })

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Lembrar de mim", fontSize = 16.sp, color = indigo_dye
                )
                Switch(
                    modifier = Modifier
                        .scale(0.8f)
                        .padding(start = 50.dp),
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = indigo_dye, checkedTrackColor = indigo_dye
                    )
                )
            }

            Button(
                onClick = {navController.navigate("home")}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                ),

                modifier = Modifier
                    .size(width = 131.dp, height = 50.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(indigo_dye, bright_blue)
                        ), shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Text(
                    text = "Entrar",
                    color = Color.White,
                    fontSize = 25.sp,
                    modifier = Modifier.align(alignment = Alignment.CenterVertically)

                )

            }


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.blue_line2),
                    contentDescription = "Linha azul",
                    modifier = Modifier.size(width = 109.dp, height = 50.dp)
                )
                Text(
                    "OU",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = indigo_dye,
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                )

                Image(
                    painter = painterResource(R.drawable.blue_line2),
                    contentDescription = "Linha azul",
                    modifier = Modifier.size(width = 109.dp, height = 50.dp)
                )
            }

            Text(
                "Entrar com contas de redes sociais:",
                color = indigo_dye,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 2.dp)
            )

            Row(
                modifier = Modifier.padding(top = 5.dp)
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.facebook_icon
                    ),
                    contentDescription = "Logo Facebook",
                    modifier = Modifier
                        .size(width = 48.15.dp, height = 47.23.dp)
                        .clickable { }
                )
                Spacer(modifier = Modifier.padding(start = 20.dp))
                Image(
                    painter = painterResource(
                        R.drawable.google_icon
                    ),
                    contentDescription = "Logo Facebook",
                    modifier = Modifier
                        .size(width = 48.15.dp, height = 47.23.dp)
                        .clickable { }

                )
            }


            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 281.dp, height = 48.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(indigo_dye, bright_blue)
                        ), shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Button(
                    onClick = { navController.navigate("cadastro") },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(width = 281.dp, height = 48.dp)
                        .fillMaxSize()
                ) {

                    Row {

                        Text(
                            text = "Não tem uma conta?",
                            color = Color.White,
                            fontSize = 14.sp,
                            modifier = Modifier.align(alignment = Alignment.CenterVertically)
                        )
                        Text(
                            text = "Cadastre-se",
                            color = Color.White,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .align(alignment = Alignment.CenterVertically)
                                .padding(start = 5.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column {
                Row {
                    Text(
                        "Ao continuar, estou de acordo com os",
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Termos de Uso",
                        fontSize = 13.sp,
                        color = indigo_dye,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
                Row {
                    Text(
                        "e com o ",
                        fontSize = 13.sp,
                        modifier = Modifier
                            .padding(start = 70.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 1.dp))
                    Text("Aviso de Privacidade ",
                        fontSize = 13.sp,
                        color = indigo_dye,
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier
                            .clickable { })
                }
            }
        }

    }
}