package com.example.filter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class MessageFilterApplication

fun main(args: Array<String>) {
    runApplication<MessageFilterApplication>(*args)
}

data class Message(val id: Int, val payload: String)

@RestController
class FilterController {
    @PostMapping("/filter")
    fun filter(@RequestBody messages: List<Message>): List<Message> =
        messages.filter { it.payload.isNotBlank() }
}
