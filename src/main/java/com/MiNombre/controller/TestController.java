package com.MiNombre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hola/{nombre}")
    public String sayHello(@PathVariable String nombre) {
        return "hola, " + nombre + "!!";
    }
}
