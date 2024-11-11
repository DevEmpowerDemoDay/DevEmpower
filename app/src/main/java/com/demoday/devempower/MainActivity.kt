package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
=======
>>>>>>> dev
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme
import kotlinx.coroutines.delay

val uranium_blue = Color(0xFFFFAEDFF7)
val celadon = Color(0xFFFFA8D5BA)
val davys_gray = Color(0xFFFF5c5c5c)
val white_smoke = Color(0xFFFFF5F5F5)
val indigo_dye = Color(0xFFFF005377)

// cores
val uranium_blue = Color(0xFFAEDFF7)
val celadon = Color(0xFFA8D5BA)
val davys_gray = Color(0xFF5C5C5C)
val white_smoke = Color(0xFFF5F5F5)
val indigo_dye = Color(0xFF00005377)

val splashScreenDuration = 1500L // 1500 ms = 1.5 sec

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
                    composable("home") { BottomNavigationMenu(navController) }
                    composable("telaalt") { TelaAlt(navController) }
                    composable("login") { Login(navController) }
                    composable("recsenha") { RecuperaoSenha(navController) }


                }
            }
        },

        )
}

@Composable
fun Splash(navController: NavController) {
<<<<<<< HEAD
    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("telaalt") {
            popUpTo("splash") { inclusive = true }
        }
    }
=======
>>>>>>> dev

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.novo_projeto),
            contentDescription = "",
            modifier = Modifier.padding(top = 180.dp)
                .size(width = 270.dp, height = 185.dp)

        )

        Image(
            modifier = Modifier.padding(top = 180.dp),
            painter = painterResource(R.drawable.logotipo),
            contentDescription = ""
        )
    }
}

@Composable
fun TelaAlt(navController: NavController) {

    LaunchedEffect(Unit) {
        delay(splashScreenDuration)
        navController.navigate("login") {
            popUpTo("login") { inclusive = true }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.background1),
                contentScale = ContentScale.Crop
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Bem vindo (a) ,",
            fontSize = 20.sp,
            color = Color(0xFFFF005377),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        )


        Text(
            "Junte-se a nós na jornada de transformação para o " +
                    "mundo da tecnologia. Aqui, você irá desenvolver suas soft " +
                    "skills e se preparar para brilhar no mercado de trabalho.",
            fontSize = 14.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(20.dp)
        )
        Image(
            painter = painterResource(R.drawable.group_63),
            contentDescription = "",
            modifier = Modifier
                .size(width = 346.dp, height = 346.dp)
                .padding(top = 29.dp)
        )
    }
}

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
            painter = painterResource(R.drawable.background1),
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
                contentDescription = "",
                modifier = Modifier
                    .size(70.dp)
            )
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFFF005377),
                modifier = Modifier
                    .padding(top = 20.dp)

            )
            Image(
                painter = painterResource(R.drawable.line_9),
                contentDescription = ""
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
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF005377),
                    unfocusedBorderColor = indigo_dye

                )
            )

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = { Text("Senha", fontSize = 16.sp, fontWeight = FontWeight.Medium) },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector1),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .padding(top = 8.dp)
                    .width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF005377),
                    unfocusedBorderColor = indigo_dye

                )
            )
            Text("Esqueci minha senha",
                fontSize = 16.sp,
                color = Color(0xFFFF005377),
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 45.dp)
                    .clickable { navController.navigate("recsenha") }
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Lembrar de mim",
                    fontSize = 16.sp,
                    color = Color(0xFF005377)
                )
                Switch(
                    modifier = Modifier
                        .scale(0.8f)
                        .padding(start = 50.dp),
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = indigo_dye,
                        checkedTrackColor = Color(0xFFFF005377)
                    )
                )
            }

                Button(
                    onClick = { /* ação ao clicar */ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),

                    modifier = Modifier
                        .size(width = 131.dp, height = 50.dp)
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(Color(0xFF005377), Color(0xFF009ADD))
                            ),
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Text(
                        text = "Entrar",
                        color = Color.White,
                        fontSize =25.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)

                    )

            }


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.line_6),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 109.dp, height = 50.dp)
                )
                Text("OU",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF005377),
                    modifier = Modifier.
                padding(start = 10.dp, end = 10.dp))

                Image(
                    painter = painterResource(R.drawable.line_6),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 109.dp, height = 50.dp)
                )
            }

            Text(
                "Entrar com contas de redes sociais:",
                color = Color(0xFF005377),
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 2.dp)
            )
            Image(
                painter = painterResource(R.drawable.group_105),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(width = 120.dp, height = 80.dp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .size(width = 281.dp, height = 48.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFF005377), Color(0xFF009ADD))
                        ),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Button(
                    onClick = { /* ação ao clicar */ },
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
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                    )
                Text(
                    text = "Cadastre-se",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                        .padding(start = 5.dp))
                }}
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                "Ao continuar, estou de acordo com os Termos de Uso e com o Aviso de Privacidade ",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium,
                textDecoration = TextDecoration.Underline,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 2.dp)
                )

        }

    }
}


@Composable
fun RecuperaoSenha(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(R.drawable.background1),
                contentScale = ContentScale.Crop
            ),
    ) {
    }
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