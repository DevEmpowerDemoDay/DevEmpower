package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
<<<<<<< HEAD
import androidx.compose.foundation.background
<<<<<<< HEAD
=======
=======
>>>>>>> dev
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
>>>>>>> dev
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
=======
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
>>>>>>> dev
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demoday.devempower.ui.theme.DevEmpowerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevEmpowerTheme {
<<<<<<< HEAD
                val primaryColor = colorResource(id = R.color.celadon)
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = primaryColor) { innerPadding ->
                    Greeting(
                        name = "CurtisTeste",
                        modifier = Modifier.padding(innerPadding)
                    )
=======
                val uranium_blue = colorResource(id = R.color.uranium_blue)
                val celadon = colorResource(id = R.color.celadon)
                val davys_gray = colorResource(id = R.color.davys_gray)
                val white_smoke = colorResource(id = R.color.white_smoke)
                val indigo_dye = colorResource(id = R.color.indigo_dye)

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = uranium_blue,
                    bottomBar = { BottomNavigationMenu() }) { innerPadding ->
                    Greeting(name = "Matheus", Modifier.padding(innerPadding))
>>>>>>> dev
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val customFontFamily = FontFamily(
        Font(R.font.poppins)  // Aqui, o nome do arquivo da fonte
    )

    Text(
        text = "Hello $name!",
        modifier = modifier,
        fontFamily = customFontFamily,
    )
}



@Composable
fun BottomNavigationMenu() {
    val uranium_blue = colorResource(id = R.color.uranium_blue)
    val celadon = colorResource(id = R.color.celadon)
    val davys_gray = colorResource(id = R.color.davys_gray)
    val white_smoke = colorResource(id = R.color.white_smoke)
    val indigo_dye = colorResource(id = R.color.indigo_dye)

    val selectedIndex = remember { mutableStateOf(0) } // Para rastrear qual botão está selecionado

    Box(modifier = Modifier.fillMaxSize()) {
        NavigationBar(
            containerColor = indigo_dye,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .size(width = 357.dp, height = 176.dp)
                .offset(y = (-66).dp)
                .clip(RoundedCornerShape(38.dp))
        ) {
            Row {
                NavigationBarItem(
                    selected = selectedIndex.value == 0,
                    onClick = { selectedIndex.value = 0 },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            modifier = Modifier
                                .size(width = 26.dp, height = 26.dp)
                                .clip(CircleShape),
                            tint = Color.Black,
                        )
                    },
                    modifier = Modifier.weight(1f) // Adicione esta linha
                )

                NavigationBarItem(
                    selected = selectedIndex.value == 0,
                    onClick = { selectedIndex.value = 0 },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Home",
                            modifier = Modifier
                                .size(width = 26.dp, height = 46.dp)
                                .clip(CircleShape),
                            tint = Color.Black,
                        )
                    },
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DevEmpowerTheme {
        Greeting("Android")
        }
}