package com.example.gimnasio.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gimnasio.R

// Sección 1 · Spinning: la tarjeta de una actividad
@Preview(showBackground = true)
@Composable
fun Seccion1() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFFE1F5FE), RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.actividad_spinning),
            contentDescription = "Dibujo de la actividad Spinning: una bicicleta estática",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
        Text("Imagen: dibujo propio", fontSize = 12.sp)
        Text("Spinning", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Clases de bicicleta con música")
        Text("Cuarenta y cinco minutos de pedaleo al ritmo de la música.")
        Text("3 clases a la semana")
        Button(onClick = { }) {
            Text("Ver horarios")
        }
    }
}
