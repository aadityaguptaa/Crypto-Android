package com.adityagupta.crypto_main.presentation.coin_detail

import com.adityagupta.crypto_main.domain.model.Coin
import com.adityagupta.crypto_main.domain.model.CoinDetail

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
