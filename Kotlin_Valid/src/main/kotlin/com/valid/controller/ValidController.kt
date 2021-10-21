package com.valid.controller

import com.valid.dto.ValidOneDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

/**
 * created by Gyunny 2021/10/21
 */
@RestController
class ValidController {

    @PostMapping
    fun validTest(@RequestBody @Valid validDTO: ValidOneDTO): String {
        println(validDTO.name + " " + validDTO.part)
        return "Valid Test"
    }

}