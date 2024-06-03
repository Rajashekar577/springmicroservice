package com.example.payment.service;

import com.example.payment.entity.Payment;
import com.example.payment.model.Pc;

public interface PaymentService {

	Long dopayment(Pc pc);

	Payment getdetail(Long paymentId);

}
