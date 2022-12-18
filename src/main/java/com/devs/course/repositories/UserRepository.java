package com.devs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
