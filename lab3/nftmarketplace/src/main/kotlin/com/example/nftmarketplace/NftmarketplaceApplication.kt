package com.example.nftmarketplace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class NftmarketplaceApplication

fun main(args: Array<String>) {
    runApplication<NftmarketplaceApplication>(*args)
} 