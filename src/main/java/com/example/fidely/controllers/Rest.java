package com.example.fidely.controllers;


import com.example.fidely.service.JsonHandler;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/fidelyMock")
@CrossOrigin()
public class Rest {

    @GetMapping("/get")
    public String get() {
        return "hola mundo";
    }

    @GetMapping("/login")
    public Object login() {
        return JsonHandler.readJson("loginResponse.json");
    }

}
