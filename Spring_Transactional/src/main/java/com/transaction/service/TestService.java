package com.transaction.service;

import com.transaction.domain.User;
import com.transaction.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by Gyunny 2021/11/26
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class TestService {

    private final UserRepository userRepository;
    private final TestBService testBService;

    @Transactional
    public void parentTransactionRequiredNew() {
        userRepository.save(createUser(1));
        testBService.childTransactionalRequired();
        userRepository.save(createUser(3));
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void childTransactionalRequired() {
        userRepository.save(createUser(2));
    }

    public static User createUser(int i) {
        return User.builder()
                .name("Gyunny" + i)
                .part("Server" + i)
                .build();
    }
}
