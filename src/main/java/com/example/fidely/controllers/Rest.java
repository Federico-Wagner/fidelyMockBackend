package com.example.fidely.controllers;


import com.example.fidely.service.JsonHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;


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

    @GetMapping("/infoDetails")
    public Object infoDetails() {
        String metodo = "infoDetailsController";
        System.out.println(metodo + "Data :"+JsonHandler.readJson("infoDetails.json") +" "+ LocalTime.now());
        return JsonHandler.readJson("infoDetails.json");
    }

    @GetMapping("/consumes")
    public ResponseEntity<Object> consumes() {
        String metodo = "infoDetailsController";
        System.out.println(metodo + "Data :"+JsonHandler.readJson("consume.json") + " "+ LocalTime.now());
        return ResponseEntity.ok(JsonHandler.readJson("consume.json"));
    }

}
