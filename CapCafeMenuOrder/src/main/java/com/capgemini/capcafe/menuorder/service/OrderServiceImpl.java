package com.capgemini.capcafe.menuorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.capcafe.menuorder.exception.OrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;

import com.capgemini.capcafe.menuorder.model.Ordering;
import com.capgemini.capcafe.menuorder.repository.OrderRepository;

@Service
@Transactional(rollbackFor = OrderException.class)

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Ordering addOrder(Ordering order) {
		return orderRepository.save(order);
	}

	@Override
	public Ordering fetchOrderById(int id) throws OrderException {
	try {
		return orderRepository.findById(id).get();
	}
	catch(Exception e) {
		throw new OrderException(e.getMessage());
	}
	}

	@Override
	public List<Ordering> fetchOrder() {
		return (List<Ordering>)  orderRepository.findAll();
	}

}
