package org.example.rhm.project.Payment.service.impl;

import org.example.rhm.project.Payment.model.Payment;
import org.example.rhm.project.Payment.repository.PaymentRepository;
import org.example.rhm.project.Payment.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public String createPayment(Payment payment) {
        paymentRepository.save(payment);
        return "Success";
    }

    @Override
    public String updatePayment(Payment payment) {
        paymentRepository.save(payment);
        return "Success";
    }

    @Override
    public String deletePayment(String paymentId) {
        paymentRepository.deleteById(paymentId);
        return "Success";
    }

    @Override
    public Payment getPayment(String paymentId) {
        return paymentRepository.findById(paymentId).get();
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}