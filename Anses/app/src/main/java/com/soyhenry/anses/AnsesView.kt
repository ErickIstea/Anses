package com.soyhenry.anses

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AnsesView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Hola Juan Carlos",
            style = MaterialTheme.typography.titleLarge
        )

        Row(
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            Text("Ingresa tu cuenta")
            Spacer(modifier = Modifier.weight(1f))
            Text("Cambiar usuario")
        }
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = "Clave de la Seguridad social",
            onValueChange = {}
        )

        Button(
            modifier = Modifier.padding(10.dp),
            onClick = {}
        ) {
            Text("Ingresar")
        }
        Spacer(modifier = Modifier.height(40.dp))

        Text("olvide mi clave")
    }
}

@Preview(showBackground = true)
@Composable
fun AnsesPreview() {
    AnsesView()
}