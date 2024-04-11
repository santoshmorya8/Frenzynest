package org.example.rhm.project.Payment.repository;

import org.example.rhm.project.Payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,String> {
}