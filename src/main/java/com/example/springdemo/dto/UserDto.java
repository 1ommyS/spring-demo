package com.example.springdemo.dto;

import lombok.*;

/**
 * @author 1ommy
 * @version 12.05.2023
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDto {
    private int id;
    private String name;
    private int age;
}
