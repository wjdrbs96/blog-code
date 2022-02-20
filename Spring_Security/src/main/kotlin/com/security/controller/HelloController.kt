package com.security.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

/**
 * created by Gyunny 2021/11/19
 */
@RestController
class HelloController {

    @GetMapping("/info")
    fun info(): String {
        return "info"
    }

    @GetMapping("/dashboard")
    fun dashboard(principal: Principal): String {
        return "dashboard ${principal.name}"
    }

}