package com.example.demo.service;

import java.time.Instant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.stereotype.Service;


import com.example.demo.Pc.Pc;
import com.example.demo.entity.Od;
import com.example.demo.feignclient.PaymentService;
import com.example.demo.feignclient.TcService;
import com.example.demo.model.Or;
import com.example.demo.model.Ors;
import com.example.demo.model.Payment;
import com.example.demo.model.Tcn;
import com.example.demo.repository.OrderRepository;


@Service
public class OrderserviceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository; 
	
	@Autowired
	
	private TcService tcsService;
	
	 @Autowired
	   private PaymentService paymentService;
	
	@Override
	public Long placeorder(Or or) {
		
		//tc.setQuantity(tc.getQuantity()-quantity);
		
		tcsService.reducequnt(or.getProductId(), or.getQuantity());
		//paymentService.dopayment(or.)
		Od od=Od.builder().productId(or.getProductId()).quantity(or.getQuantity()).build();
		
		od=orderRepository.save(od);
		
		//Pc pc=Pc.builder().productId(or.getProductId()).build();
		
		return od.getOrderId();
		
		
		
		
		
   
	}

	@Override
	public Ors getOrderdetails(Long orderId) {

		
		
		
		Od od=orderRepository.findById(orderId).orElseThrow(null);
		
		com.example.demo.model.Response resp=  tcsService.getproductById(od.getProductId()).getBody();
		
		
	Payment p=	paymentService.getpaymentde(od.getPaymentId()).getBody();
	         
		
		
		Ors ors=Ors.builder().Date(Instant.now()).quantity(od.getQuantity()).resp(resp).pay(p)
				.productId(od.getProductId()).build();
	
		
	
		
		
		return ors;
	}
	
	
	
	
	
	
	
	
		
		
	

}
