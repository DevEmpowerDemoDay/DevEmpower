package com.demoday.devempower

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.demoday.devempower.ui.theme.DevEmpowerTheme

@Composable
fun passoword() {

    val uranium_blue = colorResource(id = R.color.uranium_blue)
    val celadon = colorResource(id = R.color.celadon)
    val davys_gray = colorResource(id = R.color.davys_gray)
    val white_smoke = colorResource(id = R.color.white_smoke)
    val indigo_dye = colorResource(id = R.color.indigo_dye)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = uranium_blue)
    ) {  }
}

@Preview
@Composable
private fun preview() {
DevEmpowerTheme {
    passoword()
}
}