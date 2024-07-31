package com.example.springboot_proto.controller;

import com.example.springboot_proto.app.base.BaseController;
import com.example.springboot_proto.app.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController extends BaseController {

    @GetMapping("/hello")
    public ResponseEntity<ApiResponse<String>> hello() {
        return success("Hello, World!");
    }
}