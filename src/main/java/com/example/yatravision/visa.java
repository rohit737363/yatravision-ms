package com.example.yatravision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class visa {
    @GetMapping("/myvisa")
    public String getData(){
        return "Please submit visa";
    }
}