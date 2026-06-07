package com.zoya.bloomly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoya.bloomly.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
