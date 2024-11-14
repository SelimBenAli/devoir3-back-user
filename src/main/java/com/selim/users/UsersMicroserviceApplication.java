package com.selim.users;

import com.selim.users.entities.Role;
import com.selim.users.entities.User;
import com.selim.users.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersMicroserviceApplication.class, args);
    }


    @Autowired
    UserService userService;

    /*@PostConstruct
    void init_users() {

        userService.addRole(new Role(null, "ADMIN"));
        userService.addRole(new Role(null, "USER"));


        userService.saveUser(new User(null, "admin", "123", true, null));
        userService.saveUser(new User(null, "selim", "123", true, null));
        userService.saveUser(new User(null, "firas", "123", true, null));

        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("selim", "USER");
        userService.addRoleToUser("firas", "USER");
    }*/

}
