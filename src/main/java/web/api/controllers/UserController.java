package web.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.api.models.User;
import web.api.usecases.user.interfaces.UserService;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("create")
    public void createUser(@RequestBody User user) {
        System.out.println(user.getFullName());
        userService.addUser(user);
    }
    
    @GetMapping("user")
    public User getUser(UUID id) {
        return userService.getUserById(id);
    }
    
    @DeleteMapping("delete")
    public void deleteUser(UUID id) {
        userService.removeUser(id);
    }
    
    @GetMapping("users")
    public ArrayList<User> getAll() {
        return userService.getAll();
    }
}
