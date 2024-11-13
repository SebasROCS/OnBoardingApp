package com.example.boardingapp.viewModel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.boardingapp.R
import com.example.boardingapp.data.PageData
import com.example.boardingapp.onBoardViews.OnBoardingPager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainViewBoarding(){
    /*val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Bienvenidos",
            "Bienvenidos a la aplicacion para mostrar el uso del OnBoarding"
        )
    )

    items.add(
        PageData(
            R.raw.page2,
            "Uso de onBoarding",
            "Esta es la segunda pagina del Boarding mostrando una descripcion"
        )
    )

    items.add(
        PageData(
            R.raw.page3,
            "Fin de Boarding",
            "Esta es la pagina final del Boarding y ya debe de aparecer el boton"
        )
    )

    val pagerState = rememberPagerState (
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(item = items, pagerState = pagerState, modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
    )*/
}