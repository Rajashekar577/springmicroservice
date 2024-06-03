package com.example.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.entity.Payment;
import com.example.payment.model.Pc;
import com.example.payment.service.PaymentService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("do")
public class PaymentController {

	   @Autowired
	   private PaymentService paymentService;
	   
	   @PostMapping("dopayment")
	public ResponseEntity<Long>dopayment(@RequestBody Pc pc){
		   log.info("msg");
		
	Long paymentId=	paymentService.dopayment(pc);
	 log.info("5");
		return new ResponseEntity<>(paymentId,HttpStatus.OK);
		
		
	}
	   @GetMapping("pay/{id}")
	   public ResponseEntity<Payment>getpaymentde(@PathVariable("id") Long paymentId){
		   
		   Payment p=paymentService.getdetail(paymentId);
		   
		   return new ResponseEntity<Payment>(p,HttpStatus.OK);
		   
		   
		   
	   }
	
	
}
