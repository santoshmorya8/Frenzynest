package com.rhm.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhm.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	
	public List<User> findAllByOrderByCreatedAtDesc();

}
