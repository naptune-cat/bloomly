package com.zoya.bloomly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoya.bloomly.entity.Note;

public interface NotesRepository extends JpaRepository<Note, Long> {
    
}
