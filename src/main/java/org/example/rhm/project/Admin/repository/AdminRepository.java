package org.example.rhm.project.Admin.repository;

import org.example.rhm.project.Admin.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,String> {
}