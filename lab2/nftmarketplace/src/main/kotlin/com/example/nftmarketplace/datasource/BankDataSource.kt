package com.example.nftmarketplace.datasource

import com.example.nftmarketplace.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}