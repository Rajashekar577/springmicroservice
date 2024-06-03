package com.example.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Pc.Pc;

import com.example.demo.Tcn.Tcn;
import com.example.demo.Tcr.Tcr;
import com.example.demo.model.Response;







@FeignClient("tc/h")
public interface TcService {
	@PutMapping("q/{id}")
	public ResponseEntity< Tcn> reducequnt(@PathVariable("id") Long productId ,@RequestParam int quantity);
	
	@GetMapping("find/{id}")
	public ResponseEntity<Response>getproductById(@PathVariable("id") Long productId);
	 

}
