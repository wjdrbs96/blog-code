package com.session

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SessionApplication

fun main(args: Array<String>) {
    runApplication<SessionApplication>(*args)
}
