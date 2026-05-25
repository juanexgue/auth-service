package com.juanex.auth_service.dto;

public record LoginRequest(
        String username,
        String password
) {
}
