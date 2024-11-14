package com.example.boardingapp.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import androidx.compose.foundation.Image
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.boardingapp.R

@Composable
fun SplashScreen(navController: NavController, store: Boolean?){
    var screen by remember { mutableStateOf("")}
    screen=if(store == true) "home" else "onBoarding"
    LaunchedEffect (key1 = true) {
        delay(300)
        navController.navigate(screen){
            popUpTo(0)
        }
    }

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.gato), contentDescription = "Logo")
    }
}