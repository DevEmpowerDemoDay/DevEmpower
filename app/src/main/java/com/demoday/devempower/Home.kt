package com.demoday.devempower

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.demoday.devempower.ui.theme.DevEmpowerTheme

@Composable
fun BottomNavigationMenu(navController: NavController) {
    val uranium_blue = colorResource(id = R.color.uranium_blue)
    val celadon = colorResource(id = R.color.celadon)
    val davys_gray = colorResource(id = R.color.davys_gray)
    val white_smoke = colorResource(id = R.color.white_smoke)
    val indigo_dye = colorResource(id = R.color.indigo_dye)

    val selectedIndex = remember { mutableStateOf(0) }

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
                    modifier = Modifier.weight(1f)
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

@Preview
@Composable
private fun BottomPreview() {
    DevEmpowerTheme {
        BottomNavigationMenu(rememberNavController())
    }
}