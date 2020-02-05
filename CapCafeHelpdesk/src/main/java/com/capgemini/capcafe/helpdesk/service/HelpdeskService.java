package com.capgemini.capcafe.helpdesk.service;
import java.util.List;

import com.capgemini.capcafe.helpdesk.exception.HelpdeskException;

public interface HelpdeskService {

	
	Order fetchOrderId(String OrderID) throws HelpdeskException;
List<Order> fetchOrderDetails();
}