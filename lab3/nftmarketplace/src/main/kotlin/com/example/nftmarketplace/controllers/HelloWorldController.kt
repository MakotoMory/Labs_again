package com.example.nftmarketplace.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World"
    }
}