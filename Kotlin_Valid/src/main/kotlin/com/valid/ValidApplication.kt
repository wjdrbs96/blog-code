package com.valid

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ValidApplication

fun main(args: Array<String>) {
    runApplication<ValidApplication>(*args)
}
