package com.adityagupta.crypto_main.domain.repository

import com.adityagupta.crypto_main.data.remote.dto.CoinDetailDto
import com.adityagupta.crypto_main.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}