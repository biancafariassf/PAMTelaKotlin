package com.example.minhainterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.minhainterface.ui.theme.MinhaInterfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){
    MinhaInterfaceTheme(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF6650a4))) {
            MinhaSaudacao(
                adjetivoDoNomex = "frio",
                nomeX = "Sabado",
                modificador = Modifier
                    .border(
                        border = BorderStroke(
                            width = 2.dp,
                            brush = Brush.horizontalGradient(
                                colors = listOf(Color.Red, Color.Blue)
                            )
                        ),
                        shape = MaterialTheme.shapes.medium
                    )
                    .padding(16.dp))

            MinhaSaudacao(adjetivoDoNomex = "", modificador = Modifier
                .border(
                    border = BorderStroke(
                        width = 8.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color.Blue, Color.Red)
                        )
                    ),
                    shape = MaterialTheme.shapes.medium))

            Greeting("Android")
        }
    }
}


@Composable
fun MinhaSaudacao(
    nomeX :String = "World",
    adjetivoDoNomex: String,
    modificador : Modifier){

    Text(text = "Hello $nomeX $adjetivoDoNomex", modifier = modificador)
}
@Composable
fun Greeting(name: String, modificador: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modificador
    )
}
@Preview(showBackground = true)
@Composable
fun MinhaPreview() {
    MainScreen()
}