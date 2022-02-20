package com.transaction.service;

import com.transaction.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static com.transaction.service.TestService.createUser;

/**
 * created by Gyunny 2021/11/28
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class TestBService {

    private final UserRepository userRepository;

    @Transactional(propagation = Propagation.NEVER)
    public void childTransactionalNEVER() {
        userRepository.save(createUser(2));
    }

    @Transactional(propagation = Propagation.NESTED)
    public void childTransactionalNESTED() {
        userRepository.save(createUser(2));
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void childTransactionalRequiredNew() {
        userRepository.save(createUser(2));
        throw new RuntimeException();
    }


    @Transactional
    public void parentTransactionRequired() {
        userRepository.save(createUser(2));
        //throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public void childTransactionalMANDATORY() {
        userRepository.save(createUser(2));
    }
}
