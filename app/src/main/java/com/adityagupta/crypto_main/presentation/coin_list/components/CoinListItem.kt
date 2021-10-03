package com.adityagupta.crypto_main.presentation.coin_list.components

import android.content.res.Resources
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.adityagupta.crypto_main.domain.model.Coin
import com.adityagupta.crypto_main.presentation.ui.theme.*

@Composable
fun CoinListItem(
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clickable { },
        elevation = 10.dp
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onItemClick(coin) }
                .padding(8.dp)
                ,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column() {
                Text(
                    text = "${coin.rank}. ${coin.name}",
                    style = MaterialTheme.typography.body1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(8.dp),
                )
                Text(
                    text = "$ ${coin.symbol}",
                    color = GoogleBlue,
                    fontStyle = FontStyle.Italic,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(8.dp)

                )

            }
            Column() {
                Text(
                    text = if(coin.isActive) "active" else "inactive",
                    color = if(coin.isActive) GoogleBlue else GoogleRed,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.End,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(8.dp)

                )
                Text(
                    text = "${coin.type}",
                    color = GoogleBlue,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.End,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(8.dp)

                )
            }


        }
    }

}