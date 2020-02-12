package com.capgemini.capcafe.menuorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.service.MenuOrderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/menu")
public class MenuOrderController {

	@Autowired
	MenuOrderService menuOrderService;

	@PostMapping(path="/addFoodItem")
	public void addNewFood(@RequestBody MenuOrder menu) {
		this.menuOrderService.addFoodItem(menu);
	}

	@GetMapping(path="/getFoodById/{id}")
	public List<MenuOrder> getFoodById(@PathVariable("id") String id) throws MenuOrderException {
		return (List<MenuOrder>) this.menuOrderService.fetchFoodById(id);
	}

	@DeleteMapping(path = { "/removeFoodById/{id}" })
	public boolean removeFoodById (@PathVariable("id") String id) throws MenuOrderException {
		return this.menuOrderService.removeFoodItem(id);
	}

	@GetMapping(path="/getAllFood")
	public List<MenuOrder> getAllFoodItems() {
		return this.menuOrderService.fetchMenu();
	}

	@PutMapping(path="/updateFoodItem")
	public MenuOrder updateMenu(@RequestBody MenuOrder menu) {
		return this.menuOrderService.updateMenu(menu);
	}

	@GetMapping(path = { "/getFoodByCafeId/{cafeId}" })
	public List<MenuOrder> getFoodsByCafe(@PathVariable("cafeId") String cafeId) throws MenuOrderException {
		return this.menuOrderService.getAllFoodsByCafeId(cafeId);
	}
}
