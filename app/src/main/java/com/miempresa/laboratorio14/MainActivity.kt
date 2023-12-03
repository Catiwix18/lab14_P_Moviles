package com.miempresa.laboratorio14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<EjemploViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploApp(viewModel = viewModel)
        }
    }
}
@Composable
fun EjemploApp(viewModel: EjemploViewModel){
    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
                          viewModel.conectDataCor()
        }
        ) {
        Text(text = "Calcular radicación")
        }
        Text(text = viewModel.mensaje)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewClimaApp() {
    val viewModel = EjemploViewModel()
    EjemploApp(viewModel = viewModel)
}