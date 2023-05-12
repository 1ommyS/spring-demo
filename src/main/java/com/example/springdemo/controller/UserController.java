package com.example.springdemo.controller;

import com.example.springdemo.dto.UserDto;
import com.example.springdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author 1ommy
 * @version 12.05.2023
 */
//localhost:8080/api/v1/user

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable(name = "id") int id) {
//        return ResponseEntity.ok(service.findUserById(id));
        return new ResponseEntity<UserDto>(service.findUserById(id), HttpStatusCode.valueOf(200));
    }
}
