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
fun RecuperarSenha(navController: NavController) {

    val uranium_blue = colorResource(id = R.color.uranium_blue)
    val celadon = colorResource(id = R.color.celadon)
    val davys_gray = colorResource(id = R.color.davys_gray)
    val white_smoke = colorResource(id = R.color.white_smoke)
    val indigo_dye = colorResource(id = R.color.indigo_dye)
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
            color = Color(0xFFFF005377)
        )

        Image(
            painter = painterResource(R.drawable.line_9),
            contentDescription = "",
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
                        colors = listOf(Color(0xFF005377), Color(0xFF009ADD))
                    ), shape = RoundedCornerShape(10.dp)
                )
        ) {
            androidx.compose.material3.Text(
                text = "Enviar",
                color = Color.White,
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
        RecuperarSenha(rememberNavController())
    }
}