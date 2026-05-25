package com.juanex.auth_service.controller;

import com.juanex.auth_service.dto.LoginRequest;
import com.juanex.auth_service.dto.LoginResponse;
import com.juanex.auth_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}
