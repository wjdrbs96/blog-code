package com.transaction.controller;

import com.transaction.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Gyunny 2021/11/26
 */
@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestService testService;

    @GetMapping
    public String parentTransactionRequiredNew() {
        testService.parentTransactionRequiredNew();
        return "test";
    }

    @GetMapping("/man")
    public String parentTransactionalMANDATORY() {
        testService.parentTransactionalMANDATORY();
        return "man";
    }

    @GetMapping("/nest")
    public String parentTransactionalNESTED() {
        testService.parentTransactionalNESTED();
        return "nest";
    }

    @GetMapping("/basic")
    public String parentTransactionalREQUIRED() {
        testService.parentTransactionRequired();
        return "basic";
    }

    @GetMapping("/never")
    public String parentTransactionalNEVER() {
        testService.parentTransactionalNEVER();
        return "never";
    }
}
