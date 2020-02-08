package com.capgemini.capcafe.menuorder.controller;


import java.util.List;
import java.util.Map;

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
@RequestMapping("/menuorder")
public class MenuOrderController {

@Autowired
MenuOrderService menuOrderService;
@PostMapping
public void addNewFood(@RequestBody MenuOrder menu) {
	this.menuOrderService.addFoodItem(menu);
}
@GetMapping(path = {"/{id}"})
public MenuOrder getCafeById(@PathVariable("id") String id) throws MenuOrderException {
	return this.menuOrderService.fetchFoodById(id);
}
@DeleteMapping(path ={"/{id}"})
public boolean removeMenu(@PathVariable("id") String id) throws MenuOrderException {
	return this.menuOrderService.removeFoodItem(id);

}	
@GetMapping
public List<MenuOrder> getMenu() {
	return this.menuOrderService.fetchMenu();
}
@PutMapping
public MenuOrder updateMenu (@RequestBody MenuOrder menu) {
	return this.menuOrderService.updateMenu(menu);
}


}


