package com.selim.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.selim.users.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Optional<User> findByEmail(String email);

}