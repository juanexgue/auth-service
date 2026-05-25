package com.juanex.auth_service.service.impl;

import com.juanex.auth_service.dto.LoginRequest;
import com.juanex.auth_service.dto.LoginResponse;
import com.juanex.auth_service.security.JwtService;
import com.juanex.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final JwtService jwtService;

    @Override
    public LoginResponse login(LoginRequest request) {

        if (!"juan".equals(request.username()) ||
                !"123456".equals(request.password())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        String token = jwtService.generateToken(request.username());

        return new LoginResponse(token);
    }
}

