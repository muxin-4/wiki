package com.example.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;


    /**
     * GET, POST, PUT, DELETE
     * <p>
     * /user?id=1
     * /user/1
     *
     * @return
     */
    // @PostMapping
    // @PutMapping
    // @DeleteMapping
    // @RequestMapping(value = "/user/1", method = RequestMethod.GET)
    // @RequestMapping(value = "/user/1", method = RequestMethod.DELETE)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }


    @PostMapping("/hello/post")
    public String hello(String name) {
        return "Hello World! Post," + name;
    }
}
