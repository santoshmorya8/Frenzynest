package org.example.rhm.project.Admin.service.impl;

import org.example.rhm.project.Admin.model.Admin;
import org.example.rhm.project.Admin.repository.AdminRepository;
import org.example.rhm.project.Admin.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public String createAdmin(Admin admin) {
        adminRepository.save(admin);
        return "Success";
    }

    @Override
    public String updateAdmin(Admin admin) {
        adminRepository.save(admin);
        return "Success";
    }

    @Override
    public String deleteAdmin(String userId) {
        adminRepository.deleteById(userId);
        return "Success";
    }

    @Override
    public Admin getAdmin(String userId) {
        return adminRepository.findById(userId).get();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
}