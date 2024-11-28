package com.jwt.spring.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Hello from Secret Url");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminOnly(){
        return ResponseEntity.ok("Hello from Admin Only url");
    }
}
