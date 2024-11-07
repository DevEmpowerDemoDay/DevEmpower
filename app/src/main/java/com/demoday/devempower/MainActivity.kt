package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.demoday.devempower.ui.theme.DevEmpowerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevEmpowerTheme {
                val primaryColor = colorResource(id = R.color.celadon)
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = primaryColor) { innerPadding ->
                    Greeting(
                        name = "CurtisTeste",
                        modifier = Modifier.padding(innerPadding)
                    )
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DevEmpowerTheme {
        Greeting("Android")
    }
}