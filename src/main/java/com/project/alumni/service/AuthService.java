package com.project.alumni.service;


import com.project.alumni.entity.dto.request.LoginRequest;
import com.project.alumni.entity.dto.request.RefreshTokenRequest;
import com.project.alumni.entity.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
