package dev.yassine.ChatApp.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.security.Principal;

public interface UserService {

    UserDetailsService userDetailsService();
    void changePassword(ChangePasswordRequest request, Principal connectedUser);
}
