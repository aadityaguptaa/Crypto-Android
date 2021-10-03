package com.adityagupta.crypto_main.presentation.coin_detail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.adityagupta.crypto_main.R

@Composable
fun CoinLinks(
    links: List<String>
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
             ,
        elevation = 10.dp,
        backgroundColor = Color.White
    ){
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(
                painter = painterResource(id = R.drawable.facebooklogo),
                contentDescription = "Contact profile picture",
                modifier = Modifier.padding(8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.redditsociallogocharacter),
                contentDescription = "Contact profile picture",
                modifier = Modifier.padding(8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.opensource),
                contentDescription = "Contact profile picture",
                modifier = Modifier.padding(8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.youtube),
                contentDescription = "Contact profile picture",
                modifier = Modifier.padding(8.dp)
            )


        }
    }
}