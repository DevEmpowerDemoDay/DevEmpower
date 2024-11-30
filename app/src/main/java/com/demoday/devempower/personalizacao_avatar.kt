package com.demoday.devempower

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    Card(modifier = Modifier
                        .size(width = 220.dp, height = 96.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally)
                        .offset(y= -75.dp),
                        colors = CardDefaults.cardColors(indigo_dye),

                    ) {
                            Text(
                                "Personalização do Avatar",
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Medium,
                                color = white_smoke,
                                textAlign = TextAlign.Center,
//                            fontFamily = fontPoppins,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 20.dp)

                            )
                    }
                    //Conteudo que vou preencher da box



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