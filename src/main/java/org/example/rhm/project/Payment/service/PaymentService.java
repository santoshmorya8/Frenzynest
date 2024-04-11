package org.example.rhm.project.Payment.service;

import org.example.rhm.project.Payment.model.Payment;

import java.util.List;


public interface PaymentService {
    public String createPayment(Payment payment);
    public String updatePayment(Payment payment);
    public String deletePayment(String userId);
    public Payment getPayment(String userId);
    public List<Payment> getAllPayments();
}