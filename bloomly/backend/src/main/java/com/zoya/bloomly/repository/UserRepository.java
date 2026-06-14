package com.zoya.bloomly.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.zoya.bloomly.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
