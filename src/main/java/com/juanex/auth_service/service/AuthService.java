package com.juanex.auth_service.service;

import com.juanex.auth_service.dto.LoginRequest;
import com.juanex.auth_service.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
