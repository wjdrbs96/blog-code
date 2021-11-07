package com.session.controller

import com.session.dto.SignInDTO
import com.session.dto.SignUpDTO
import com.session.service.UserService
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.*
import java.time.LocalDate
import javax.servlet.http.HttpSession

/**
 * created by Gyunny 2021/10/18
 */
@RequestMapping("/api/v1")
@RestController
class UserController(
    private val userService: UserService
) {

    @GetMapping
    fun test(httpSession: HttpSession): String {
        httpSession.setAttribute("key", "value")
        return "test"
    }

    @GetMapping("/{date}")
    fun bind(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable("date") localDate: LocalDate): String {
        println("Test")
        return "test"
    }

    @GetMapping("/test")
    fun test1(httpSession: HttpSession): String {
        println(httpSession.getAttribute("key"))
        return "hi"
    }

    @PostMapping("/signup")
    fun sign(@RequestBody signUpDTO: SignUpDTO, httpSession: HttpSession) {
        httpSession.setAttribute("key", signUpDTO.email)
        println(httpSession.getAttribute("key"))
        userService.signup(signUpDTO)
    }

    @PostMapping("/signin")
    fun login(@RequestBody signInDTO: SignInDTO, httpSession: HttpSession) {
        println("=====")
        println(httpSession.getAttribute("key"))
        println("=====")
        userService.signIn(signInDTO)
    }

}