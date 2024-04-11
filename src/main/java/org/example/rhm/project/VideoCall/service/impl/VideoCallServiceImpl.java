//package org.example.rhm.project.VideoCall.service.impl;
//
//import org.example.rhm.project.User.service.VideoCallService;
//import org.example.rhm.project.User.model.User;
//import org.example.rhm.project.User.repository.VideoCallRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class VideoCallServiceImpl implements VideoCallService {
//
//    VideoCallRepository videoCallRepository;
//
//    public VideoCallServiceImpl(VideoCallRepository videoCallRepository) {
//        this.userRepository = videoCallRepository;
//    }
//
//    @Override
//    public String createVideoCall(User user) {
//        userRepository.save(user);
//        return "Success";
//    }
//
//    public User getVideoCallDetail(String userId) {
//        return userRepository.findById(userId).get();
//    }
//
//    public List<User> getAllVideoCallDetails() {
//        return userRepository.findAll();
//    }
//}