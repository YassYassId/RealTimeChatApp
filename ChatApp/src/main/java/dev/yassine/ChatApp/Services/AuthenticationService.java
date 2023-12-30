package dev.yassine.ChatApp.Services;

import dev.yassine.ChatApp.Model.User;
import dev.yassine.ChatApp.dto.JwtAuthenticationResponse;
import dev.yassine.ChatApp.dto.RefreshTokenRequest;
import dev.yassine.ChatApp.dto.RegisterRequest;
import dev.yassine.ChatApp.dto.SigninRequest;

public interface AuthenticationService {

    User register(RegisterRequest registerRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
