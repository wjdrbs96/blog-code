package com.paging.controller;

import com.paging.dto.PostResponseDTO;
import com.paging.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by Gyunny 2021/11/07
 */
@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @GetMapping("/post")
    public List<PostResponseDTO> find(@PageableDefault(size = 7) Pageable pageable) {
        return postService.findAll(pageable).getContent();
    }

}
