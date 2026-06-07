package com.zoya.bloomly.dto.journal;

import com.zoya.bloomly.enums.Mood;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateJournalRequestDto {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    private Mood mood;
}