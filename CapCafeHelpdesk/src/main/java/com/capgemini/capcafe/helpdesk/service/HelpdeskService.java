package com.capgemini.capcafe.helpdesk.service;
import java.util.List;

import com.capgemini.capcafe.helpdesk.exception.HelpdeskException;

public interface HelpdeskService {
List<Orders> getAllOrders();
	
	Orders addNewOrder(Orders order);
	
	Orders getById(int orderId);


}

	
	