package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Pc.Pc;
import com.example.demo.model.Payment;


@FeignClient("payment/do")
public interface PaymentService {
	
	//@PostMapping("dopayment")
	//public ResponseEntity<Long>dopayment(@RequestBody Pc pc);
	
	@GetMapping("pay/{id}")
	   public ResponseEntity<Payment>getpaymentde(@PathVariable("id") Long paymentId);


}
