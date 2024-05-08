package com.rhm.service;

import java.util.List;

import com.rhm.exception.UserException;
import com.rhm.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
