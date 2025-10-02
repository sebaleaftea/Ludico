package com.example.test.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            // Barra de aplicación superior con colores del tema para consistencia
            TopAppBar(
                title = { Text("Ludico App") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,  // Usando color del tema para el contenedor
                    titleContentColor = MaterialTheme.colorScheme.primary  // Usando color del tema para el texto del título
                )
            )
        }
    ) { innerPadding ->
        // Contenido principal de la pantalla, envuelto en una Column para organización vertical
        Column(
            modifier = Modifier
                .padding(innerPadding)  // Aplicar padding interno proporcionado por Scaffold
                .fillMaxSize()  // Ocupar todo el espacio disponible
                .padding(16.dp),  // Padding adicional alrededor del contenido
            verticalArrangement = Arrangement.spacedBy(20.dp),  // Espaciado uniforme entre elementos (20.dp entre cada uno)
            horizontalAlignment = Alignment.CenterHorizontally  // Alineación horizontal central para todos los elementos hijos
        ) {
            // Texto de bienvenida con estilo del tema
            Text(
                text = "!Bienvenido¡",
                style = MaterialTheme.typography.headlineMedium,  // Usando tipografía del tema para consistencia
                color = MaterialTheme.colorScheme.onBackground  // Usando color del tema para texto sobre fondo
            )

            // Botón de ejemplo con colores del tema
            Button(
                onClick = { /* Acción Futura */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,  // Color primario del tema para el botón
                    contentColor = MaterialTheme.colorScheme.onPrimary  // Color de contenido sobre primario
                )
            ) {
                Text("Presioname")
            }

            // Imagen del logo con escalado para ajuste
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo App",
                modifier = Modifier
                    .fillMaxWidth()  // Ocupar todo el ancho disponible
                    .height(150.dp),  // Altura fija para la imagen
                contentScale = ContentScale.Fit  // Escalar la imagen para que quepa sin distorsión
            )

            // Tarjeta con un interruptor, usando elevación para profundidad visual
            Card(
                modifier = Modifier.padding(top = 16.dp),  // Padding superior adicional para separación
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),  // Elevación predeterminada para sombra
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface  // Usando color de superficie del tema
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)  // Padding interno en la fila
                        .fillMaxWidth(),  // Ocupar todo el ancho
                    verticalAlignment = Alignment.CenterVertically,  // Alineación vertical central
                    horizontalArrangement = Arrangement.SpaceBetween  // Espacio entre elementos (texto e interruptor)
                ) {
                    Text(
                        "Activar modo oscuro",
                        color = MaterialTheme.colorScheme.onSurface  // Color del tema para texto sobre superficie
                    )
                    var checked by remember { mutableStateOf(false) }  // Estado local para el interruptor
                    Switch(
                        checked = checked,
                        onCheckedChange = { checked = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = MaterialTheme.colorScheme.primary  // Color primario cuando activado
                        )
                    )
                }
            }

            // Nuevo elemento visual: Un Divider para separación temática
            Divider(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.onSurfaceVariant,  // Color del tema para el divisor
                thickness = 1.dp  // Grosor del divisor
            )

            // Nuevo elemento visual: Un TextField para entrada de usuario (ejemplo de interacción)
            var text by remember { mutableStateOf("") }  // Estado local para el campo de texto
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Ingresa tu nombre") },  // Etiqueta para el campo
                modifier = Modifier.fillMaxWidth(),  // Ocupar todo el ancho
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = MaterialTheme.colorScheme.primary,  // Indicador enfocado con color primario
                    unfocusedIndicatorColor = MaterialTheme.colorScheme.onSurfaceVariant  // Indicador no enfocado
                )
            )

            // Nuevo elemento visual: Un IconButton para acción rápida (ejemplo de icono interactivo)
            IconButton(
                onClick = { /* Acción para el icono */ },
                modifier = Modifier.align(Alignment.CenterHorizontally)  // Alineación central
            ) {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_info_details),  // Icono de ejemplo (puedes cambiarlo)
                    contentDescription = "Información",
                    tint = MaterialTheme.colorScheme.primary  // Tinte con color primario del tema
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    TestTheme { // Asegúrate de envolver la vista previa con tu tema
        HomeScreen()
    }
}