package org.example.rhm.project.Payment.controller;

import org.example.rhm.project.Payment.model.Payment;
import org.example.rhm.project.Payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Payment")
public class PaymentController {
    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String CreatePaymentDetails(@RequestBody Payment payment) {
        paymentService.createPayment(payment);
        return "Payment Created Successfully";
    }

    @GetMapping()
    public List<Payment> getAllPaymentDetails(){
        return paymentService.getAllPayments();
    }

    @PutMapping
    public String updatePaymentDetails(@RequestBody Payment payment){
        paymentService.updatePayment(payment);
        return "Payment Updated Successfull";
    }

    @DeleteMapping("{paymentId}")
    public String deletePaymentDetails(@PathVariable("paymentId") String paymentId) {
        paymentService.deletePayment(paymentId);
        return "Payment Deleted Successfully";
    }

    @GetMapping("{paymentId}")
    public Payment getPaymentDetails(@PathVariable("paymentId") String paymentId) {
        return paymentService.getPayment(paymentId);
    }
}