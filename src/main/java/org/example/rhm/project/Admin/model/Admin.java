package org.example.rhm.project.Admin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Admin")
public class Admin {
    @Id
    private String adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;

    public Admin() {
    }

    public Admin(String adminId, String adminName, String adminPassword, String adminEmail) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail;
    }

}