package com.zoya.bloomly.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zoya.bloomly.dto.journal.CreateJournalRequestDto;
import com.zoya.bloomly.dto.journal.JournalResponseDto;
import com.zoya.bloomly.dto.journal.UpdateJournalRequestDto;

@Service
public interface JournalService {
    JournalResponseDto createJournalEntry(CreateJournalRequestDto journalRequestDto);

    JournalResponseDto getJournalEntryById(Long id);

    List<JournalResponseDto> getAllJournalEntries();

    JournalResponseDto updateJournalEntry(Long id, UpdateJournalRequestDto journalRequestDto);

    void deleteJournalEntry(Long id);
}
