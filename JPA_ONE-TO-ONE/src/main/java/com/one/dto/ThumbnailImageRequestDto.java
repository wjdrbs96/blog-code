package com.one.dto;

import com.one.domain.File;
import com.one.domain.ThumbnailImage;
import lombok.Getter;

/**
 * created by Gyunny 2022/02/19
 */
@Getter
public class ThumbnailImageRequestDto {

    private String thumbnailImageName;
    private String thumbnailImageSize;

    public ThumbnailImage toEntity() {
        return ThumbnailImage.builder()
                .thumbnailImageName(thumbnailImageName)
                .thumbnailImageSize(thumbnailImageSize)
                .build();
    }

}
