package com.zoya.bloomly.dto.journal;

import com.zoya.bloomly.enums.Mood;

import lombok.Data;

@Data
public class UpdateJournalRequestDto {
    // All fields are optional for update, so no validation annotations
    private String title;

    private String content;

    private Mood mood;
}