package com.one.service;

import com.one.domain.PostRepository;
import com.one.domain.User;
import com.one.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by Gyunny 2022/02/19
 */
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public void test() {
        userRepository.findAll().forEach(user -> {
            System.out.println(user.getPosts());
        });
    }

}
