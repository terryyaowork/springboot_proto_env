package com.example.springboot_proto.controller;

import com.example.springboot_proto.dto.request.member.LoginRequestDto;
import com.example.springboot_proto.app.response.ApiResponse;
import com.example.springboot_proto.app.base.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController extends BaseController {

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<String>> login(@RequestBody LoginRequestDto loginRequest) {
        if ("admin".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword())) {
            return success("Login successful", "User authenticated successfully");
        } else {
            return error("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
}