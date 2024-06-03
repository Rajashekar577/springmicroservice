package com.example.demo.model;

import java.time.Instant;









import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ors {
	
	private long productId;
	
    
   private Response resp;
   
	private Instant Date;
	
	private  Payment pay;



	private int quantity;


}
