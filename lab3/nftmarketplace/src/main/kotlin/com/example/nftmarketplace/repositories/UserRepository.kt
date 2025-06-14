package com.example.nftmarketplace.repositories

import com.example.nftmarketplace.models.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun findByEmail(email: String): User?
}