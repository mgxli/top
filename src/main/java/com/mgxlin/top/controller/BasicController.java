package com.mgxlin.top.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
public class BasicController {

    @GetMapping("/")
    public String hello() {
        return "Hello Jenkins";
    }


}
