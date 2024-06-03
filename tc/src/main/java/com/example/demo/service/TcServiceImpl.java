package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tc;
import com.example.demo.model.Response;
import com.example.demo.model.Tcn;
import com.example.demo.model.Tcr;
import com.example.demo.repository.TcsRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class TcServiceImpl implements TcService{
	
     @Autowired
	private TcsRepository tcsRepository;
     
	public Long addproduct(Tcr tcr) {
		log.info("msg21");
		Tc tc=Tc.builder().productNmae(tcr.getProductNmae())
				.amount(tcr.getAmount()).quantity(tcr.getQuantity()).build();
		log.info("msg22");
		tcsRepository.save(tc);
		log.info("msg25");
		return tc.getProductId();
	}

	
	public Response getproductById(Long productId) {
		log.info("msg21");
		
	Tc tc=	tcsRepository.findById(productId).get();
		log.info("msg22");
		
		
		
    Response s=Response.builder().productNmae(tc.getProductNmae()).amount(tc.getAmount()).quantity(tc.getQuantity()).build();
		
		log.info("msg23");
		return s;
	}

	@Override
	public List< Response> getAll(Tcn tcn) {
		//tcsRepository.findAll();
		log.info("msgmsgmsg3");
		tcsRepository.findAll();
		log.info("msgmsgmsg4");
		List<Response> s	=  (List<Response>) Response.builder().productNmae(tcn.getProductNmae()).quantity(tcn.getQuantity()).build();
		log.info("msgmsgmsg5");
		return    s;
	}


	@Override
	public void deleteById(Long productId) {
		
     
		tcsRepository.deleteById(productId);
		
		
		
	}


	@Override
	public Tcn reducequnt(Long productId, int quantity) {


     Tc tc=tcsRepository.findById(productId).get();
		
		tc.setQuantity(tc.getQuantity()-quantity);
		tcsRepository.save(tc);
		return null;
		
	}




	
	
	

	
	

	
	

	
}
