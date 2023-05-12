package com.example.springdemo.repository;

import com.example.springdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 1ommy
 * @version 12.05.2023
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
