package com.adityagupta.crypto_main.presentation.coin_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.adityagupta.crypto_main.data.remote.dto.TeamMember
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleBlue
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleGreen
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleRed
import com.adityagupta.crypto_main.presentation.ui.theme.GoogleYellow

@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.h4,
            color = GoogleYellow
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.body2,
            fontStyle = FontStyle.Italic,
        )
    }


}