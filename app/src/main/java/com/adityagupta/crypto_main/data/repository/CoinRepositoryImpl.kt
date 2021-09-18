package com.adityagupta.crypto_main.data.repository

import com.adityagupta.crypto_main.data.remote.CoinPaprikaApi
import com.adityagupta.crypto_main.data.remote.dto.CoinDetailDto
import com.adityagupta.crypto_main.data.remote.dto.CoinDto
import com.adityagupta.crypto_main.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }
}