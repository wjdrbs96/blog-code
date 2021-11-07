package com.session.service

import com.session.dto.SignInDTO
import com.session.dto.SignUpDTO
import com.session.entity.User
import com.session.repository.UserRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession

/**
 * created by Gyunny 2021/10/18
 */
@Service
class UserService(
    private val userRepository: UserRepository,
    private val modelMapper: ModelMapper,
    private val httpSession: HttpSession,
    private val httpServletRequest: HttpServletRequest
) {

    fun signIn(signInDTO: SignInDTO) {
        val user = userRepository.findByEmail(signInDTO.email)
        httpSession.setAttribute("userId", user.id)
        println(httpServletRequest.session)
        println(httpSession.getAttribute("userId"))
    }

    @Transactional
    fun signup(signUpDTO: SignUpDTO) {
        userRepository.save(modelMapper.map(signUpDTO, User::class.java))
    }

}