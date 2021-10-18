package com.session.controller

import com.session.dto.SignInDTO
import com.session.dto.SignUpDTO
import com.session.service.UserService
import org.springframework.web.bind.annotation.*
import javax.servlet.http.Cookie

/**
 * created by Gyunny 2021/10/18
 */
@RequestMapping("/api/v1")
@RestController
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun test(): String {
        println("Controller!!")
        return "test"
    }

    @PostMapping("/signup")
    fun sign(@RequestBody signUpDTO: SignUpDTO) {
        userService.signup(signUpDTO)
    }

    @PostMapping("/signin")
    fun login(@RequestBody signInDTO: SignInDTO) {
        userService.signIn(signInDTO)
    }

}