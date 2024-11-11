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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

val uranium_blue = Color(0xFFFFAEDFF7)
val celadon = Color(0xFFFFA8D5BA)
val davys_gray = Color(0xFFFF5c5c5c)
val white_smoke = Color(0xFFFFF5F5F5)
val indigo_dye = Color(0xFFFF005377)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevEmpowerTheme {
                Inicio()
            }
        }
    }
}


@Composable
fun Inicio() {
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
            ) {

                NavHost(navController = navController, startDestination = "splash") {
                    composable("splash") { Splash(navController) }
                    composable("login") { BottomNavigationMenu(navController) }


                }
            }
        },

        )
}

@Composable
fun Splash(navController: NavController) {

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
            contentDescription = "",
            modifier = Modifier.padding(top = 180.dp)
        )

        Text(
            modifier = Modifier.padding(19.dp),
            text = AnnotatedString.Builder().apply {
                append("Dev")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("Empower")
                }
            }.toAnnotatedString(),
            fontSize = 32.sp,
            color = Color(0xFFFF005377)
        )

        Image(
            modifier = Modifier.padding(top =180.dp),
            painter = painterResource(R.drawable.logotipo),
            contentDescription = ""
        )
    }
}


@Preview
@Composable
private fun preview() {
    DevEmpowerTheme {
        Splash(rememberNavController())
    }
}
