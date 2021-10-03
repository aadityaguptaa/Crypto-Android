package com.adityagupta.crypto_main.presentation.coin_detail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleBlue
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleYellow

@Composable
fun CoinTag(
    tag: String
){
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = GoogleBlue,
                shape = RoundedCornerShape(100.dp),

            )

            .background(GoogleBlue, RoundedCornerShape(100.dp))
            .padding(10.dp)

    ) {
        Text(
            text = tag,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body2,
            fontWeight = FontWeight.Bold
        )
    }
}