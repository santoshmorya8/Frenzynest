package org.example.rhm.project.Payment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    private String paymentId;
    private String paymentName;
    private String cardDetails;
    private String paymentMethod;
    private String productName;
    private String productId;
    private String productPrice;
    private String totalNoOfProduct;

    public Payment() {
    }

    public Payment(String paymentId, String paymentName, String cardDetails, String paymentMethod, String productName, String productId, String productPrice, String totalNoOfProduct) {
        this.paymentId = paymentId;
        this.paymentName = paymentName;
        this.cardDetails = cardDetails;
        this.paymentMethod = paymentMethod;
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.totalNoOfProduct = totalNoOfProduct;
    }
}