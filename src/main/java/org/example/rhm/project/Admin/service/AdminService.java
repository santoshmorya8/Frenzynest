package org.example.rhm.project.Admin.service;

import org.example.rhm.project.Admin.model.Admin;

import java.util.List;


public interface AdminService {
    public String createAdmin(Admin admin);
    public String updateAdmin(Admin admin);
    public String deleteAdmin(String userId);
    public Admin getAdmin(String userId);
    public List<Admin> getAllAdmin();
}