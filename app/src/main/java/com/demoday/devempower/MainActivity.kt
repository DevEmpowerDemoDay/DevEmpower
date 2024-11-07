package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevEmpowerTheme {
                Inicio()
            }}}}


            @Composable
fun Inicio() {
                val uranium_blue = colorResource(id = R.color.uranium_blue)
                val celadon = colorResource(id = R.color.celadon)
                val davys_gray = colorResource(id = R.color.davys_gray)
                val white_smoke = colorResource(id = R.color.white_smoke)
                val indigo_dye = colorResource(id = R.color.indigo_dye)
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        Column(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){

                            NavHost(navController = navController, startDestination = "login") {
                                composable("login") { Splash(navController) }
                                composable("login") { BottomNavigationMenu(navController) }



                            }
                        }
                    },

                    )
            }

@Composable
fun Splash(navController: NavController) {
    val uranium_blue = colorResource(id = R.color.uranium_blue)
    val celadon = colorResource(id = R.color.celadon)
    val davys_gray = colorResource(id = R.color.davys_gray)
    val white_smoke = colorResource(id = R.color.white_smoke)
    val indigo_dye = colorResource(id = R.color.indigo_dye)

Column(
    modifier = Modifier
    .fillMaxSize()
        .background(color = uranium_blue),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
)
{
    Image(
        painter = painterResource(R.drawable.vector),
        contentDescription = ""
    )
    Text(text ="DevEmpower",
        fontSize = 32.sp,
        color = Color(0xFFFF005377))

    Image(
        painter = painterResource(R.drawable.logotipo),
contentDescription = ""    )
}
}



@Preview
@Composable
private fun preview() {
    DevEmpowerTheme {
        Splash(rememberNavController())
    }
}
