package com.swagger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * created by Gyunny 2021/10/23
 */
@RestController
class TestController {

    @GetMapping
    fun test(): String {
        return "test"
    }

}