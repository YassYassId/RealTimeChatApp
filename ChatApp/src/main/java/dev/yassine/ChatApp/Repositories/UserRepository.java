package dev.yassine.ChatApp.Repositories;

import dev.yassine.ChatApp.Model.Role;
import dev.yassine.ChatApp.Model.Status;
import dev.yassine.ChatApp.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User , String> {
    Optional<User> findByUsername (String username);
    Optional<User> findByEmail (String email);
    User findByRole(Role role);

}
