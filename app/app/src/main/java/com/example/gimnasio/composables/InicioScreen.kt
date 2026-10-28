package com.example.gimnasio.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// La pantalla de inicio: el título y las tarjetas de todo el grupo, una debajo de otra
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InicioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()                // que no quede debajo de la barra de arriba
            .verticalScroll(rememberScrollState()) // para poder bajar con el dedo
            .padding(8.dp)
    ) {
        Text("Gimnasio PowerFit", fontSize = 28.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
        Text("Elige una actividad", modifier = Modifier.padding(horizontal = 8.dp))
        Seccion1()
        Seccion2()
        Seccion3()
        Seccion4()
    }
}
