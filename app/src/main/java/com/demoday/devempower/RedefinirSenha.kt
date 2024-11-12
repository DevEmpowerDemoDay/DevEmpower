package com.demoday.devempower

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme




@Composable


fun RedefinirSenha(navController: NavController) {
    val uranium_blue = Color(0xFFAEDFF7)
    val celadon = Color(0xFFA8D5BA)
    val davys_gray = Color(0xFF5C5C5C)
    val white_smoke = Color(0xFFF5F5F5)
    val indigo_dye = Color(0xFF005377)
    val bright_blue = Color(0xFF009ADD)


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue)
    ) {
        Text(
            "Redefinir a senha",
            fontSize = 25.sp,
            fontWeight = FontWeight.Medium,
            color = indigo_dye
        )

        Image(
            painter = painterResource(R.drawable.blue_line),
            contentDescription = "linha az",
            modifier = Modifier
                .size(width = 163.dp, height = 4.dp)
        )

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Column() {
            Row {
                Text("Esqueceu sua senha?")
                Text("Sem problemas! Vamos ajudá-lo a criar uma nova")
            }
        }

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Text("Por favor, insira o endereço de e-mail associado à sua conta. Enviaremos um link para redefinir sua senha.")

        Spacer(modifier = Modifier.padding(top = 50.dp))

        var email by remember {
            mutableStateOf("")
        }

       OutlinedTextField(
            value = email,
            onValueChange = { newText -> email = newText },
            label = {
                Text(
                    "Email",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
            },
            modifier = Modifier
                .padding(top = 8.dp)
                .width(334.82.dp),
            singleLine = true
        )

        Spacer(modifier = Modifier.padding(top = 50.dp))

        Button(
            onClick = { /* ação ao clicar */ }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),

            modifier = Modifier
                .size(width = 234.dp, height = 42.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(indigo_dye, bright_blue)
                    ), shape = RoundedCornerShape(10.dp)
                )
        ) {
            androidx.compose.material3.Text(
                text = "Enviar",
                color = white_smoke,
                fontSize = 25.sp,
                modifier = Modifier.align(alignment = Alignment.CenterVertically)

            )

        }
    }
}

@Preview
@Composable
private fun Passpreview() {
    DevEmpowerTheme {
        RedefinirSenha(rememberNavController())
    }
}