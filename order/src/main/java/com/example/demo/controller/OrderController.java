package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Od;
import com.example.demo.model.Or;
import com.example.demo.model.Ors;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("dd")
public class OrderController {
	@Autowired
	private OrderService oderservice;
	@PostMapping("")
	public ResponseEntity<Long>placeorder(@RequestBody Or or ){
		
	Long orderId=	oderservice.placeorder(or);
		
		return new ResponseEntity<>(orderId,HttpStatus.OK);
		
		
	}
	
	@GetMapping("orderdetail/{id}")
	public ResponseEntity<Ors> getOrderdetails(@PathVariable("id") Long orderId) {
	Ors od=	oderservice.getOrderdetails(orderId);
		
		
		
		return new ResponseEntity<>(od,HttpStatus.OK);
		
		
		
	}
	
	
	

}
