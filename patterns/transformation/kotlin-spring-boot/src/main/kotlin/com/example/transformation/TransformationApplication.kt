package com.example.transformation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class TransformationApplication

fun main(args: Array<String>) {
    runApplication<TransformationApplication>(*args)
}

data class InputMessage(val payload: String)
data class OutputMessage(val payload: String)

@RestController
class TransformationController {
    @PostMapping("/transform")
    fun transform(@RequestBody message: InputMessage): OutputMessage =
        OutputMessage(message.payload.uppercase())
}
