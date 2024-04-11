package org.example.rhm.project.User.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.rhm.project.Shopping.model.Shopping;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {
    @Id
    private String userId;
    @NotEmpty(message = "UserName should not be empty")
    @Size(min = 5,message = "UserName must be min or greater than 5")
    @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
    private String userName;
    @NotEmpty
    private String userAddress;
    @NotBlank
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message = "Should be number only")
    @Size(min = 10,max = 10,message = "Phonenumber should be only of 10 digit only")
    @NotBlank(message = "Should be not empty and numberic only")
    private String userPhoneNumber;
    @Email(message = "Email should be Valid")
    @Pattern(message = "Invalid email id", regexp = "^.+@.+\\..+$")
    private String email;



}