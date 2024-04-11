package org.example.rhm.project.Admin.controller;

import org.example.rhm.project.Admin.model.Admin;
import org.example.rhm.project.Admin.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController {
    AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping
    public String CreateAdminDetails(@RequestBody Admin admin) {
        adminService.createAdmin(admin);
        return "Admin Created Successfully";
    }

    @GetMapping()
    public List<Admin> getAllUserDetails(){
        return adminService.getAllAdmin();
    }

    @PutMapping
    public String updatAdminDetails(@RequestBody Admin admin){
        adminService.updateAdmin(admin);
        return "Admin Updated Successfull";
    }

    @DeleteMapping("{userId}")
    public String deleteUserDetails(@PathVariable("userId") String userId) {
        adminService.deleteAdmin(userId);
        return "Admin Deleted Successfully";
    }

    @GetMapping("{userId}")
    public Admin getUserDetails(@PathVariable("userId") String userId) {
        return adminService.getAdmin(userId);
    }
}