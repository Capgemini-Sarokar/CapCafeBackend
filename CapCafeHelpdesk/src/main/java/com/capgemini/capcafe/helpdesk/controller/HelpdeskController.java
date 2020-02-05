package com.capgemini.capcafe.helpdesk.controller;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/helpdesk")
public class HelpdeskController {
	
	@Autowired
	private HelpdeskService service;
	@PostMapping(value = "/ticket", produces = "application/json")
	public Ticket raiseTicket(@PathVariable("id") int id, @PathVariable("msg") String msg) throws OrderNotFoundException {
		return service.raiseTicket(id, msg);
	}
	
	/**
	 * To give Response to the raised ticket by the Admin of system
	 * @param ticketNumber
	 * @param msg
	 * @return Ticket(with added response)
	 * @throws TicketNotFoundException
	 */
	@PostMapping(value = "/ticket/response/{ticketNumber}/{msg}", produces = "application/json")
	public Ticket giveResponse(@PathVariable("ticketNumber") int ticketNumber, @PathVariable("msg") String msg) throws TicketNotFoundException {
		
		return service.sendResponse(ticketNumber, msg);
	}
	
	/**
	 * To get ticket by particular order ID
	 * @param orderId
	 * @return Ticket
	 * @throws TicketNotFoundException
	 * @throws OrderNotFoundException
	 */
	@GetMapping(value = "/ticket/orderid/{orderId}", produces = "application/json")
	public Ticket getTicketByOrderId(@PathVariable("orderId") int orderId) throws TicketNotFoundException, OrderNotFoundException {
		
		return service.getByOrderId(orderId);
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
	 * @throws TicketNotFoundException
	 */
	@PutMapping(value = "/ticket/resolve/{ticketNumber}")
	public int markAsResolved(@PathVariable("ticketNumber") int ticketNumber) throws TicketNotFoundException {
		
		return service.markAsResolved(ticketNumber);
	}
	
	
	
}


