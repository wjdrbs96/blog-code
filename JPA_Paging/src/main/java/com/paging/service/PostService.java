package com.paging.service;

import com.paging.dto.PostResponseDTO;
import com.paging.entity.Post;
import com.paging.entity.User;
import com.paging.repository.PostRepository;
import com.paging.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

import static com.paging.entity.User.createUser;

/**
 * created by Gyunny 2021/11/07
 */
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = userRepository.save(User.builder().email("wjdrbs966@naver.com").name("Gyunny").build());
        for (int i = 1; i <= 25; ++i) {
            postRepository.save(Post.builder().title("제목" + i).content("내용" + i).user(user).build());
        }
    }

    public Page<PostResponseDTO> findAll(Pageable pageable) {
        return postRepository.findByUserOrderByIdDesc(createUser(), pageable)
                .map(PostResponseDTO::from);
    }

}
