package org.example.rhm.project.User.controller;

import jakarta.validation.Valid;
import org.example.rhm.project.User.model.User;
import org.example.rhm.project.User.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String CreateUserDetails(@Valid @RequestBody User user) {
        userService.createUser(user);
        return "User Created Successfully";
    }

    @GetMapping()
    public List<User> getAllUserDetails(){
        return userService.getAllUsers();
    }

    @PutMapping
    public String updateUserDetails(@Valid @RequestBody User user){
        userService.updateUser(user);
        return "User Updated Successfull";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
        return "User Deleted Successfully";
    }

    @GetMapping("{userId}")
    public User getUserDetails(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }
}