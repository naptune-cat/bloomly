package com.zoya.bloomly.dto.note;

import java.time.LocalDateTime;

import lombok.Value;

@Value
public class NoteResponseDto {
    
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createdAt;
}
