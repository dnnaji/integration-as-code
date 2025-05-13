package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloWorldApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldApplication>(*args)
}

@RestController
class HelloWorldController {
    @GetMapping("/api/hello")
    fun getHello(): Map<String, String> {
        return mapOf("message" to "Hello, World! (Kotlin/Spring/Gradle)")
    }
}