package com.example.payment.model;





import java.time.Instant;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Pc {
	
 private long paymentId;	
	
private long	productId;

private long  orderId;

private Instant Date;

private String sucess;

private int cash;










}
