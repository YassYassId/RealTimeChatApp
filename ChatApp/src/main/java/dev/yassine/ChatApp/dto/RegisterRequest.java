package dev.yassine.ChatApp.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
}
