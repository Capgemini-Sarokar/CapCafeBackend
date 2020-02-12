package com.capgemini.capcafe.menuorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.menuorder.exception.OrderException;
import com.capgemini.capcafe.menuorder.model.Ordering;
import com.capgemini.capcafe.menuorder.service.OrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/order")
public class OrderController {
	
@Autowired
OrderService orderService;

@PostMapping(path="/addOrder")
public void addOrder(@RequestBody Ordering order) {
	this.orderService.addOrder(order);
}

@GetMapping(path="/getOrderByFoodName/{orderId}")
public Ordering fetchOrderByFood(@PathVariable("orderId") int orderId) throws OrderException {
	return this.orderService.fetchOrderById(orderId);	
}

@GetMapping(path="/getAllOrder")
public List<Ordering> findAllOrders(){
	return this.orderService.fetchOrder();
}

}
