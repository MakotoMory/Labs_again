package com.example.nftmarketplace.datasource

import com.example.nftmarketplace.models.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}