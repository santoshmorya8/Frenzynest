package org.example.rhm.project.Shopping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.rhm.project.User.model.User;

@Data
@Entity
@Table(name = "Shopping")
@NoArgsConstructor
@AllArgsConstructor
public class Shopping {
    @Id
    @NotEmpty(message = "ProductId should not be empty")
    @Pattern(regexp = "^[0-9]$",message = "Number only")
    private String productId;
    @NotEmpty(message = "ProductName should not be empty")
    private String productName;
    @NotEmpty(message = "ProductPrice should not be empty")
    private String productPrice;

//   @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "userId")
//    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

}