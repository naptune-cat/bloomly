package com.zoya.bloomly.dto.user;

import lombok.Value;

@Value
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
}
