package com.example.springdemo.service;

import com.example.springdemo.dto.UserDto;
import com.example.springdemo.entity.User;
import com.example.springdemo.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author 1ommy
 * @version 12.05.2023
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository repository;

//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }

    public UserDto findUserById(int id) {
//        log.info();
        log.info("ПАШОЛ НАХУЙ ЕБАНЫЙ ГОЛАНГ И ИННОПОЛИС");
        User user = repository.findById(id).orElseThrow(EntityNotFoundException::new);
        log.warn("ИННОПОЛИС ХУЕТА, БОРТАКОВСКИЙ ПИДОРАС ");

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .age(user.getAge())
                .build();
    }
}
