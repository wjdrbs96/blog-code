package com.valid.dto

import javax.validation.constraints.NotBlank

/**
 * created by Gyunny 2021/10/21
 */
class ValidOneDTO {

    @NotBlank
    val name: String? = null

    @NotBlank
    val part: String? = null
}