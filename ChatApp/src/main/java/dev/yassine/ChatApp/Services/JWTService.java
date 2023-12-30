package dev.yassine.ChatApp.Services;

import dev.yassine.ChatApp.Model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public interface JWTService {

    String extractUsername(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token , UserDetails userDetails);

    String generateRefreshToken(Map<String , Object> extraClaims , UserDetails userDetails);

}
