package com.food.go.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class UserDTO {
    private String id;
    private String username;
    private String nickname;
    private String password;
}
