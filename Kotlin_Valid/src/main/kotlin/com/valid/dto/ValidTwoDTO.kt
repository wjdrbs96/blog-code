package com.valid.dto

import javax.validation.constraints.NotBlank

/**
 * created by Gyunny 2021/10/21
 */
class ValidTwoDTO(

    @field:NotBlank
    val name: String,

    @field:NotBlank
    val part: String
)