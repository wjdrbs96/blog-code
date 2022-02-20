package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Gyunny 2022/02/13
 */
@RestController
public class TestController {

    @GetMapping
    public String test() {
        return "Test";
    }

}
