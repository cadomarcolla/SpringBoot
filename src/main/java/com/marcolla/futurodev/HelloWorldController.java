package com.marcolla.futurodev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }
}
