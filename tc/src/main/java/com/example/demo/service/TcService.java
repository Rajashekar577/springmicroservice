package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Response;
import com.example.demo.model.Tcn;
import com.example.demo.model.Tcr;

public interface TcService {

	Long addproduct(Tcr tcr);

	Response getproductById(Long productId);

	//Response getproductById(Tcr tcr);
	List<Response> getAll(Tcn tcn);
    void deleteById(Long productId);

	

	

	//Response getproductById(Long productId);



	 Tcn reducequnt(Long productId, int quantity)

	;
}                                              








