package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme


val uranium_blue = Color(0xFFAEDFF7)
val midnight_blue = Color(0xFF16144D)
val celadon = Color(0xFFA8D5BA)
val davys_gray = Color(0xFF5C5C5C)
val white_smoke = Color(0xFFF5F5F5)
val indigo_dye = Color(0xFF005377)
val bright_blue = Color(0xFF009ADD)
val pale_sky_blue = Color(0xFFD2EAF6)
val fontPoppins = FontFamily(Font(R.font.poppins, FontWeight.Normal))


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
                    composable("home") { Home(navController) }
                    composable("telaalt") { TelaAlt(navController) }
                    composable("login") { Login(navController) }
                    composable("recsenha") { RedefinirSenha(navController) }
                    composable("mudarsenha") { MudarSenha(navController) }
                    composable("senhaalterada") { SenhaAlterada(navController) }
                    composable("cadastro") { Cadastro(navController) }
                    composable("novocadastro") { NewCadastro(navController) }
                    composable("perfil1") { PerfilAtividade(navController) }
                    composable("perfil2") { PerfilInformacoes(navController) }
                    composable("perfil3") { PerfilPontuacao(navController) }
                }
            }
        },

        )
}





@Preview
@Composable
private fun preview() {
    DevEmpowerTheme {
        Splash(rememberNavController())
    }
}

@Preview
@Composable
private fun preview2() {
    DevEmpowerTheme {
        TelaAlt(rememberNavController())
    }
}

@Preview
@Composable
private fun preview3() {
    DevEmpowerTheme {
        Login(rememberNavController())
    }
}
