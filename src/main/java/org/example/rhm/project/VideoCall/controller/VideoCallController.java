//package org.example.rhm.project.VideoCall.controller;
//
//import org.example.rhm.project.User.model.User;
//import org.example.rhm.project.User.service.UserService;
//import org.example.rhm.project.User.service.VideoCallService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/VideoCall")
//public class VideoCallController {
//    UserService userService;
//
//    public VideoCallController(UserService videoCallService) {
//        this.userService = videoCallService;
//    }
//
//    @PostMapping
//    public String CreateUserDetails(@RequestBody User user) {
//        userService.createUser(user);
//        return "User Created Successfully";
//    }
//
//    @GetMapping()
//    public List<User> getAllUserDetails(){
//        return userService.getAllUsers();
//    }
//
//    @PutMapping
//    public String updateUserDetails(@RequestBody User user){
//        userService.updateUser(user);
//        return "User Updated Successfull";
//    }
//
//    @DeleteMapping("{userId}")
//    public String deleteUserDetails(@PathVariable("userId") String userId) {
//        userService.deleteUser(userId);
//        return "User Deleted Successfully";
//    }
//
//    @GetMapping("{userId}")
//    public User getUserDetails(@PathVariable("userId") String userId) {
//        return userService.getUser(userId);
//    }
//}