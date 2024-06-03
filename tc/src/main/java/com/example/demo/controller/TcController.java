package com.example.demo.controller;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Response;
import com.example.demo.model.Tcn;
import com.example.demo.model.Tcr;
import com.example.demo.service.TcService;


import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("h")
public class TcController {
      
	@Autowired
	  private TcService tcsService;
	@PostMapping("y")
	public ResponseEntity<Long>addproduct(@RequestBody Tcr tcr){
		log.info("msg1");
	Long productId=	tcsService.addproduct(tcr);
	log.info("msg2");
		return new ResponseEntity<>(productId,HttpStatus.OK);
	}
	
	@GetMapping("find/{id}")
	public ResponseEntity<Response>getproductById(@PathVariable("id") Long productId){
		log.info("msg19");
		Response r=tcsService.getproductById(productId);
		log.info("msg20");
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	@GetMapping("t")
	public ResponseEntity<List <Response>> getAll(Tcn tcn){
		log.info("msgmsgmsg");
	List<  Response> r=tcsService.getAll(tcn);
		log.info("msgmsgmsg1");
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("t/{id}")
	public  ResponseEntity<Tcn> deleteById(@PathVariable("id") Long productId ){
		log.info("msgmsgmsg");
	   tcsService.deleteById(productId);
		log.info("msgmsgmsg1");
		return new  ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	@PutMapping("q/{id}")
	public ResponseEntity< Tcn> reducequnt(@PathVariable("id") Long productId ,@RequestParam int quantity){
		log.info("msgmsgmsg");
	Tcn tc=  tcsService.reducequnt(productId,quantity);
		log.info("msgmsgmsg1");
		
		
		return new  ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
