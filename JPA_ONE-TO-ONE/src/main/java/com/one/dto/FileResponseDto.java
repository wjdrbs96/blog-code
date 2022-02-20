package com.one.dto;

import com.one.domain.File;
import lombok.Builder;
import lombok.Getter;

/**
 * created by Gyunny 2022/02/19
 */
@Builder
@Getter
public class FileResponseDto {

    private Long fileId;
    private String filename;
    private String fileSize;

    public static FileResponseDto from(File file) {
        return FileResponseDto.builder()
                .fileId(file.getId())
                .filename(file.getFilename())
                .fileSize(file.getFileSize())
                .build();
    }

}
