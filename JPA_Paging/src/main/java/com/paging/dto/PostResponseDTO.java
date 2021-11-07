package com.paging.dto;

import com.paging.entity.Post;
import lombok.Builder;
import lombok.Getter;

/**
 * created by Gyunny 2021/11/07
 */
@Builder
@Getter
public class PostResponseDTO {

    private final Long id;
    private final String username;
    private final String title;
    private final String content;

    public static PostResponseDTO from(Post post) {
        return PostResponseDTO.builder()
                .id(post.getId())
                .username(post.getUser().getName())
                .title(post.getTitle())
                .content(post.getContent())
                .build();
    }

}
