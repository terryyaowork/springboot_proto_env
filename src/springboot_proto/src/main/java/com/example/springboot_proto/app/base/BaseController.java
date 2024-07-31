package com.example.springboot_proto.app.base;

import com.example.springboot_proto.app.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

public abstract class BaseController {

    protected <T> ResponseEntity<ApiResponse<T>> success(T data) {
        return ResponseEntity.ok(ApiResponse.success(data));
    }

    protected <T> ResponseEntity<ApiResponse<T>> success(T data, String message) {
        return ResponseEntity.ok(ApiResponse.success(data, message));
    }

    protected <T> ResponseEntity<ApiResponse<T>> error(String message, HttpStatus status) {
        return ResponseEntity.status(status).body(ApiResponse.error(message, status.toString()));
    }
}