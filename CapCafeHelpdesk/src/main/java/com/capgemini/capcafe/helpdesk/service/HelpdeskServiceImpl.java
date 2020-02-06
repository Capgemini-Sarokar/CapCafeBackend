package com.capgemini.capcafe.helpdesk.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capcafe.helpdesk.controller.Ticket;
import com.capgemini.capcafe.helpdesk.entity.Orders;
import com.capgemini.capcafe.helpdesk.persistence.HelpdeskPersistence;

@Service
@Transactional
public class HelpdeskServiceImpl implements HelpdeskService {

	@Autowired
	private HelpdeskPersistence repo;
	
	@Override
	public Orders addNewOrder(Orders order) {
		
		return this.repo.save(order);
	}

	@Override
	public Orders getById(int orderId) {
		
		return repo.findById(orderId).get();
	}

	@Override
	public Ticket raiseTicket(int id, String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int markAsResolved(int ticketNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}
}


	


