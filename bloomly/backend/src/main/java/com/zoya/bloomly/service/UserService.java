package com.zoya.bloomly.service;

import com.zoya.bloomly.dto.auth.LoginRequestDto;
import com.zoya.bloomly.dto.auth.RegisterRequestDto;
import com.zoya.bloomly.dto.user.UserResponseDto;

public interface UserService {
    UserResponseDto registerUser(RegisterRequestDto request);

    UserResponseDto loginUser(LoginRequestDto request);
}
