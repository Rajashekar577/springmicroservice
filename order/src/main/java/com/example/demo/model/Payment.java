package com.example.demo.model;

import java.time.Instant;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
private long paymentId;
	
	private long	productId;

	private long  orderId;
	
	private Instant Date;
    
	private String sucess;
	
	private int cash;

}
