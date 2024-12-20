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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
val pale_hex = Color(0xFF03022C)
val bright_Violet = Color(0xFFFF6135FF)
val fontPoppins = FontFamily(Font(R.font.poppins, FontWeight.Normal))

// variavel de nome para uso global
var nome1 by mutableStateOf("")
var nome_usuario by mutableStateOf("Desenvolvedor")
var nome2 by mutableStateOf("")


//variavel de comentario para uso da comunidade
var comentario1 by mutableStateOf("")
var date by mutableStateOf("")


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
fun  Inicio() {
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
                    composable("perfil2") { PerfilInformaçãoes(navController) }
                    composable("perfil3") { PerfilPontuação(navController) }
                    composable("material") { Materiais(navController) }
                    composable("comentario") { Comunidade(navController) }
                    composable("introdução1") { IntroduçãoAula1(navController) }
                    composable("introdução2") { IntroduçãoAula2(navController) }
                    composable("introdução3") { IntroduçãoAula3(navController) }
                    composable("personalização") { tela_avatares(navController) }
                    composable("quizz") { Quizz_Pergunta1(navController) }
                    composable("quizz2") { Quizz_Correção1(navController) }
                    composable("quizz3") { Quizz_Pergunta2(navController) }
                    composable("quizz4") { Quizz_Correção2(navController) }
                    composable("quizz5") { Quizz_Pergunta3(navController) }
                    composable("quizz6") { Quizz_Correção3(navController) }
                    composable("aprovação_quizz") { Aprovação_Quizz(navController) }
                    composable("camera") { Camera(navController) }
                    composable("mentoria") { Mentorias(navController) }
                    composable("mentores") { Mentores(navController,date = "") }
                    composable("mentoria_confirmação") { Confirmação_mentoria(navController)}
                    composable("info_alt") { informações_alt(navController) }
                    composable("confirm_email") { Confirmação_email(navController) }


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