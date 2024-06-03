package com.example.payment.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.payment.entity.Payment;
import com.example.payment.model.Pc;
import com.example.payment.repository.Paymentsrepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentServiceImpl  implements PaymentService{

	
	@Autowired
	private Paymentsrepository paymentsrepository;
	@Override
	public Long dopayment(Pc pc) {
		 log.info("1");
		
		Payment payment=Payment.builder().productId(pc.getProductId()).orderId(pc.getOrderId()).cash(pc.getCash()).sucess(pc.getSucess())
				.build();
		 log.info("2");
  	paymentsrepository.save(payment);
		
		 log.info("3");
		return payment.getPaymentId();
    
		
		
		
	}
	@Override
	public Payment getdetail(Long paymentId) {
		
		
	Payment pc=	paymentsrepository.findById(paymentId).get();
		
		
		
		
		
		
		
		
				return 	pc;
	}

}
