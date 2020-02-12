package com.capgemini.capcafe.menuorder.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.capcafe.menuorder.exception.OrderException;

import com.capgemini.capcafe.menuorder.model.Ordering;

@Service

public interface OrderService {

	 Ordering addOrder(Ordering order);
		
	 Ordering fetchOrderById(int id) throws OrderException ;
		
	 List<Ordering> fetchOrder();
	
}
