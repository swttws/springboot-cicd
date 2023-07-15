package com.su.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author swt
 * @date 2023/7/15 14:38
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "123322";
    }

}
