package com.example.nftmarketplace.service

import com.example.nftmarketplace.datasource.BankDataSource
import com.example.nftmarketplace.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}