package com.example.nftmarketplace.datasource.mock

import com.example.nftmarketplace.datasource.BankDataSource
import com.example.nftmarketplace.model.Bank

class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("1234", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}