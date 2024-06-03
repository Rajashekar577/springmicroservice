package com.example.demo.service;

import com.example.demo.entity.Od;
import com.example.demo.model.Or;
import com.example.demo.model.Ors;

public interface OrderService {

	Long placeorder(Or or);

	Ors getOrderdetails(Long orderId);

}
