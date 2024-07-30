package com.example.fidely.controllers;


import com.example.fidely.service.ImageHandler;
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
        Object response = JsonHandler.readJson("loginResponse.json");
        System.out.println("/login - response: "+ response);
        return response;
    }

    @GetMapping("/profile")
    public Object profile() {
        Object response = JsonHandler.readJson("profileResponse.json");
        System.out.println("/profile - response: "+ response);
        return response;
    }

    @GetMapping("/brandColors")
    public Object brandColors() {
        Object response = JsonHandler.readJson("brandColorsResponse.json");
        System.out.println("/brandColors - response: "+ response);
        return response;
    }

    @GetMapping("/infoDetails")
    public Object infoDetails() {
        Object response = JsonHandler.readJson("infoDetails.json");
        System.out.println("/infoDetails - response: "+ response);
        return response;
    }

    @GetMapping("/consumes")
    public Object consumes() {
        Object response = JsonHandler.readJson("consume.json");
        System.out.println("/consumes - response: "+ response);
        return response;
    }

    @GetMapping("/images/A")
    public Object imageA() {
        String imageName = "banner11.png";
        Object response = ImageHandler.readImage(imageName);
        System.out.println("/consumes - response: "+ imageName);
        return response;
    }
}
