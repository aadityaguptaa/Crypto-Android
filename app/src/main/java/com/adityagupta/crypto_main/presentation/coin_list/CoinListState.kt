package com.adityagupta.crypto_main.presentation.coin_list

import com.adityagupta.crypto_main.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
