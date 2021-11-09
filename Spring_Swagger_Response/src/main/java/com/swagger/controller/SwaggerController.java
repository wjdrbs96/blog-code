package com.swagger.controller;

import com.swagger.dto.ApiResponse;
import com.swagger.dto.SwaggerResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Gyunny 2021/11/09
 */
@RequestMapping("/api/v1")
@RestController
public class SwaggerController {

    @GetMapping
    public ApiResponse<SwaggerResponseDTO> swaggerTest() {
        return ApiResponse.success(
                HttpStatus.OK,
                new SwaggerResponseDTO(1L, "다이어리 제목", "책 제목", "제목")
        );
    }
}
