package com.swagger.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * created by Gyunny 2021/11/09
 */
@RequiredArgsConstructor
@Getter
public class SwaggerResponseDTO {

    private final Long diaryId;
    private final String diaryTitle;
    private final String bookTitle;
    private final String bookAuthor;

}
