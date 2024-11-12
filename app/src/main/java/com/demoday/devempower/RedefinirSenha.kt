package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun RedefinirSenha(navController: NavController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(
                    R.drawable.background_color
                ),
                contentScale = ContentScale.Crop
            )
    ) {
        Text(
            "Redefinir a senha",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            color = midnight_blue,
            fontFamily = fontPoppins,
            modifier = Modifier
                .padding(top = 230.dp)
        )

        Image(
            painter = painterResource(R.drawable.blue_line),
            contentDescription = "linha az",
            modifier = Modifier
                .size(width = 163.dp, height = 4.dp)
        )

        Spacer(modifier = Modifier.padding(top = 25.dp))

        Column() {
            Row {
                Text(
                    "Esqueceu sua senha?",
                    fontSize = 13.sp,
                    color = bright_blue,
                    fontFamily = fontPoppins,
                )
                Spacer(modifier = Modifier.padding(start = 5.dp))
                Text(
                    "Sem problemas!",
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    color = midnight_blue
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 14.dp)
            ) {
                Text(
                    " Vamos ajudá-lo a criar uma nova",
                    fontSize = 13.sp,
                    fontFamily = fontPoppins,
                    color = midnight_blue
                )
            }
        }

        Spacer(modifier = Modifier.padding(top = 25.dp))

        Row {
            Text(
                "Por favor, insira o endereço de e-mail",
                fontSize = 13.sp,
                fontFamily = fontPoppins,
                fontWeight = FontWeight.SemiBold,
                color = midnight_blue
            )
        }
        Row {
            Text(
                "associado à sua conta. Enviaremos um",
                fontSize = 13.sp,
                fontFamily = fontPoppins,
                fontWeight = FontWeight.SemiBold,
                color = midnight_blue
            )
        }
        Row {
            Text(
                "link para redefinir sua senha.",
                fontSize = 13.sp,
                fontFamily = fontPoppins,
                fontWeight = FontWeight.SemiBold,
                color = midnight_blue
            )
        }

        Spacer(modifier = Modifier.padding(top = 15.dp))

        var email by remember {
            mutableStateOf("")
        }

        androidx.compose.material3.OutlinedTextField(
            value = email,
            onValueChange = { novoTexto -> email = novoTexto },
            label = {
                androidx.compose.material3.Text(
                    "Email",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = fontPoppins,
                )
            },
            modifier = Modifier
                .width(274.43.dp),
            shape = RoundedCornerShape(7.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF3F3F3)
            ),
            textStyle = TextStyle(
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            ),
            singleLine = true
        )





        Spacer(modifier = Modifier.padding(top = 30.dp))

        Button(
            onClick = { /* ação ao clicar */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = indigo_dye
            ),

            modifier = Modifier
                .size(width = 159.dp, height = 42.dp),
            shape = RoundedCornerShape(7.dp)
        ) {
            androidx.compose.material3.Text(
                text = "Enviar",
                color = white_smoke,
                fontSize = 20.sp,
                fontFamily = fontPoppins,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)

            )

        }
    }
}

@Preview
@Composable
fun RedefinirsenhaPreview() {
    DevEmpowerTheme {
        RedefinirSenha(rememberNavController())
    }
}

