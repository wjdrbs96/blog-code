package com.session.repository

import com.session.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * created by Gyunny 2021/10/18
 */
interface UserRepository : JpaRepository<User, Long> {

    fun findByEmail(email: String): User

}