package com.zoya.bloomly.dto.note;

import lombok.Data;

@Data
public class CreateNoteRequestDto {

    private String title;

    private String content;
}
