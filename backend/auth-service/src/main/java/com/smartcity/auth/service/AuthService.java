package com.smartcity.auth.service;

import com.smartcity.auth.dto.request.LoginRequest;
import com.smartcity.auth.dto.request.RegisterRequest;
import com.smartcity.auth.dto.response.LoginResponse;
import com.smartcity.auth.dto.response.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}