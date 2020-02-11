package com.capgemini.capcafe.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.helpdesk.entity.Orders;
import com.capgemini.capcafe.helpdesk.exception.HelpdeskException;
import com.capgemini.capcafe.helpdesk.service.HelpdeskService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/helpdesk")
public class HelpdeskController {
	
	@Autowired
	private HelpdeskService service;
	@PostMapping(value = "/ticket", produces = "application/json")
	public Ticket raiseTicket(@PathVariable("id") int id, @PathVariable("msg") String msg) throws HelpdeskException {
		return service.raiseTicket(id, msg);
	}
		/**
	 * To get ticket by particular order ID
	 * @param orderId
	 * @return Ticket
	 */
	@GetMapping(value = "/ticket/orderid/{orderId}", produces = "application/json")
	public Orders getTicketByOrderId(@PathVariable("orderId") int orderId) throws HelpdeskException{
		
		return service.getById(orderId);
	}
	
	/**
	 * To get order by ID
	 * @param id
	 * @return Order by ID
	 */
	@GetMapping(value = "/id/{id}", produces = "application/json")
	public Orders getById(@PathVariable("id") int id) {
		
		return service.getById(id);
	}
	
	/**
	 * To mark a raised ticket as resolved. Used only by user
	 * @param ticketNumber
	 * @return int 
	 */
	@PutMapping(value = "/ticket/resolve/{ticketNumber}")
	public int markAsResolved(@PathVariable("ticketNumber") int ticketNumber) 
	throws HelpdeskException{
		
		return service.markAsResolved(ticketNumber);
	}
	
	
	
}


