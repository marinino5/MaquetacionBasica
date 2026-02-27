package me.mariananino.maquetacionbasica

import android.R.attr.lineHeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { Punto1_Taller() }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Punto1_Taller() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(1.dp, Color(0xFFE0E0E0)),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {

                Box(modifier = Modifier.fillMaxWidth()) {

                    Image(
                        painter = painterResource(id = R.drawable.computador_img),
                        contentDescription = "Producto",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp),
                        contentScale = ContentScale.Crop
                    )

                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "Favorito",
                        tint = Color(0xFFFFD400),
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(16.dp)
                            .size(22.dp)
                    )
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                    Text(
                        text = "Set Computador y Cpu",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "$99.99",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1DB954)
                    )

                    Divider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp, bottom = 8.dp),
                        color = Color(0xFFE0E0E0),
                        thickness = 1.dp
                    )

                    Text(
                        text = "Potente computador de escritorio con alto rendimiento y diseño moderno.Ofreciendo rapidez, estabilidad y eficiencia en cada tarea.",
                        fontSize = 14.sp,
                        color = Color(0xFF555555)

                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Button(
                onClick = { },
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF7B1FA2)
                )
            ) {
                Icon(Icons.Filled.Edit, contentDescription = "Editar", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Editar", fontWeight = FontWeight.Bold, color = Color.White)
            }

            Button(
                onClick = { },
                modifier = Modifier
                    .weight(1f)
                    .height(40.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE53935)
                )
            ) {
                Icon(Icons.Filled.Delete, contentDescription = "Eliminar", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Eliminar", fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Punto2_Taller() {

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            Image(
                painter = painterResource(id = R.drawable.img_h),
                contentDescription = "Imagen Jetpack Compose",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop)

            Text(
                text = "Jetpack Compose tutorial",
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp))

            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify)

            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify)
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Punto3_Taller() {

    val morado = Color(0xFF6A4FB3)
    val grisChip = Color(0xFFE0E0E0)
    val grisProyecto = Color(0xFF9E9E9E)
    val bordeGris = Color(0xFFB0B0B0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.m_img),
            contentDescription = "Foto perfil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Mariana Niño",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Desarrolladora Android apasionada por la tecnología y el diseño.",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 40.dp)
        )

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Posts", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Seguidores", fontSize = 12.sp, color = Color.Gray)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text("Likes", fontSize = 12.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = morado,
                    contentColor = Color.White
                )
            ) {
                Text("Seguir")
            }

            OutlinedButton(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, bordeGris),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = morado
                )
            ) {
                Text("Mensaje")
            }
        }

        Spacer(modifier = Modifier.height(22.dp))

        Text(
            text = "Intereses",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("Ciclismo", fontSize = 12.sp) }

            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("Programación", fontSize = 12.sp) }

            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("UI/UX", fontSize = 12.sp) }
        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("Música", fontSize = 12.sp) }

            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("Viajes", fontSize = 12.sp) }

            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = grisChip,
                    contentColor = Color.Black
                ),
                elevation = ButtonDefaults.buttonElevation(0.dp),
                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                modifier = Modifier.height(34.dp)
            ) { Text("Gaming", fontSize = 12.sp) }
        }

        Spacer(modifier = Modifier.height(22.dp))


        Text(
            text = "Proyectos Recientes",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .background(Color(0xFF9E9E9E)),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.bici_img),
                contentDescription = "Proyecto",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(140.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .padding(12.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Column {
                    Text(
                        text = "App de Ciclismo",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.",
                        fontSize = 12.sp,
                        color = Color.Black,
                        lineHeight = 16.sp
                    )
                }

                Button(
                    onClick = { },
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6A4FB3),
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .align(Alignment.End)
                        .height(36.dp),
                    contentPadding = PaddingValues(horizontal = 18.dp, vertical = 6.dp)
                ) {
                    Text("Ver más", fontSize = 12.sp)
                }
            }
        }
        Spacer(modifier = Modifier.height(18.dp))
    }
}