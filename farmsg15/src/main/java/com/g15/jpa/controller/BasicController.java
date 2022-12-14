package com.g15.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/greet")
    public String greeting() {
        return "Prueba";
    }
    
    @GetMapping("/greet/{usuario}")
    public String greetingParam(@PathVariable("usuario") String usuario){
        return "Hola " + usuario + ", bienvenido a spring boot y los controladores REST";
    }
}
