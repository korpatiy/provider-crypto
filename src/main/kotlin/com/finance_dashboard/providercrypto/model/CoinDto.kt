package com.finance_dashboard.providercrypto.model

class CoinDto(
    val name: String,
    val ticker: String = "",
    val cost: Cost? = null
)

class Cost(
    val low: Float = 0F,
    val high: Float = 0F,
    val currency: String = ""
)