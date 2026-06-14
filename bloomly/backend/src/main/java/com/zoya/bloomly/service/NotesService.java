package com.zoya.bloomly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zoya.bloomly.dto.note.CreateNoteRequestDto;
import com.zoya.bloomly.dto.note.NoteResponseDto;
import com.zoya.bloomly.dto.note.UpdateNoteRequestDto;

@Service
public interface NotesService {
    NoteResponseDto createNote(CreateNoteRequestDto request);

    NoteResponseDto getNoteById(Long noteId);

    List<NoteResponseDto> getAllNote();

    NoteResponseDto updateNote(UpdateNoteRequestDto request, Long noteId);

    void deleteNote(Long noteId);

}
