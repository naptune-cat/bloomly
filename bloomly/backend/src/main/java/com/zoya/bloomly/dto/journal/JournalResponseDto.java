package com.zoya.bloomly.dto.journal;

import java.time.LocalDateTime;

import com.zoya.bloomly.enums.Mood;

import lombok.Value;

@Value
public class JournalResponseDto {

    private Long id;

    private String title;

    private String content;

    private Mood mood;

    private LocalDateTime createdAt;
}