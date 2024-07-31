package com.example.springboot_proto.app.response;

public class ApiResponse<T> {
    private boolean success;
    private T data;
    private String message;
    private String errorCode;

    // 保留原有的構造函數
    public ApiResponse(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    // 添加包含 errorCode 的新構造函數
    public ApiResponse(boolean success, T data, String message, String errorCode) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.errorCode = errorCode;
    }

    // 無參構造函數
    public ApiResponse() {
    }

    // 靜態工廠方法
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(true, data, "", null);
    }

    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(true, data, message, null);
    }

    public static <T> ApiResponse<T> success(T data, String message, String errorCode) {
        return new ApiResponse<>(true, data, message, errorCode);
    }

    public static <T> ApiResponse<T> error(String message, String errorCode) {
        return new ApiResponse<>(false, null, message, errorCode);
    }

    // Getters and setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
