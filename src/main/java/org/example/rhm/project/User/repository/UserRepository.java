package org.example.rhm.project.User.repository;

import org.example.rhm.project.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}