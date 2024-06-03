package com.example.demo.entity;

import java.time.Instant;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="o")
public class Od {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;
	
	private long productId;
	private long paymentId;
	
	private Instant Date;
	
	
	
	private int quantity;
	
	
	
	
	
	

}
