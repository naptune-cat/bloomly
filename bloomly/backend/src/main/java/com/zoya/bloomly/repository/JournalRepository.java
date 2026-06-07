package com.zoya.bloomly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoya.bloomly.entity.Journal;

public interface JournalRepository extends JpaRepository<Journal,Long> {
    
}
