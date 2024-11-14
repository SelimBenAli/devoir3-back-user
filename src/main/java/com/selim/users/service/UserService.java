package com.selim.users.service;

import com.selim.users.entities.Role;
import com.selim.users.entities.User;
import com.selim.users.service.register.RegistrationRequest;
import jakarta.servlet.Registration;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();

    User registerUser(RegistrationRequest request);

    public void sendEmailUser(User u, String code);

    public User validateToken(String code);

}
