package com.demoday.devempower

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demoday.devempower.ui.theme.DevEmpowerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevEmpowerTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = { BottomNavigationMenu() }) { innerPadding ->
                    Greeting(name = "Matheus", Modifier.padding(innerPadding))                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun BottomNavigationMenu() {

    Box(modifier = Modifier.fillMaxSize()) {
        NavigationBar(
            containerColor = Color.Gray,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .size(width = 357.dp, height = 66.dp)
                .offset(y = (-66).dp)
                .clip(RoundedCornerShape(38.dp))
        ) {

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