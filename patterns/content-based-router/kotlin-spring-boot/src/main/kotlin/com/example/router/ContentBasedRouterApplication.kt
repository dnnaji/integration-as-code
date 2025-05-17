package com.example.router

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class ContentBasedRouterApplication

fun main(args: Array<String>) {
    runApplication<ContentBasedRouterApplication>(*args)
}

data class Message(val type: String, val payload: String)

@RestController
class RouterController {
    @PostMapping("/route")
    fun route(@RequestBody message: Message): String {
        return when (message.type.lowercase()) {
            "a" -> "channel-a"
            "b" -> "channel-b"
            else -> "default-channel"
        }
    }
}
