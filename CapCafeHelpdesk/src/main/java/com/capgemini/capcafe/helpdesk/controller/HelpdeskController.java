package com.capgemini.capcafe.helpdesk.controller;


import java.util.List;


@RestController
@RequestMapping(path="/login")
public class HelpdeskController {
	@SuppressWarnings("unused")
	@Autowired 
	@RequestMapping(path = "/getOrderId")
	public Order getOrderId (@RequestBody String orderID) {
		return null;
	}

}
