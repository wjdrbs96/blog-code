package com.one.controller;

import com.one.dto.FileResponseDto;
import com.one.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by Gyunny 2022/02/13
 */
@RequiredArgsConstructor
@RestController
public class FileController {

    private final FileService fileService;

    @GetMapping
    public List<FileResponseDto> getFiles() {
        return fileService.getFiles();
    }

}
