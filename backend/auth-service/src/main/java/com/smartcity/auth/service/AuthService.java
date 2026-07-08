package com.smartcity.auth.service;

import com.smartcity.auth.dto.RegisterRequest;
import com.smartcity.auth.dto.RegisterResponse;

public interface AuthService {

    RegisterResponse register(RegisterRequest request);

}