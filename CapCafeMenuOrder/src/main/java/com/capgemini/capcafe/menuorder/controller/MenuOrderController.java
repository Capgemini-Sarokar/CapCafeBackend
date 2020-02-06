package com.capgemini.capcafe.menuorder.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.service.MenuOrderService;


@RestController
public class MenuOrderController {
	
//	@Autowired
//	private CafeService cafeService;
//
//	@PostMapping(path = "/newCafe")
//	public void addNewCafe(@RequestBody Cafe newCafe) {
//		this.cafeService.addCafe(newCafe);
//	}
@Autowired
MenuOrderService menuOrderService;
//
@CrossOrigin(origins = "http://localhost:4200")
@PostMapping(path = "/addMenu")
public void addMenu(@RequestBody MenuOrder menuorder) {
this.menuOrderService.addFoodItem(menuorder);
}

@GetMapping(path = "/getAllMenu")
public List<MenuOrder> getAllMenu() {
	return this.menuOrderService.fetchAllMenu();
}

@GetMapping(path = "/getFoodById")
public MenuOrder getMenuById(@RequestBody String foodID) throws MenuOrderException {
	return this.menuOrderService.fetchMenuById(foodID);
}

@PostMapping(path = "/removeMenuById")
public boolean removeMenu(@RequestBody String foodID) throws MenuOrderException {
	return this.menuOrderService.removeMenu(foodID);

}

@PostMapping(path = "/updateMenu")
public MenuOrder updateMenu (@RequestBody MenuOrder cafe) {
	return this.menuOrderService.updateCafe(cafe);
}
//
//public String addMenu(@RequestBody Map<String, Object> requestData) {
//	MenuOrder menu = new MenuOrder();
//	JsonObject dataResponse = new JsonObject();
//	
//	String foodId = requestData.get("foodId").toString();
//	String cafeId = requestData.get("cafeId").toString();
//	String foodName = requestData.get("foodName").toString();
//	int foodPrice = Integer.parseInt(requestData.get("foodPrice").toString());
//	
//	menu.setFoodId(foodId);
//	menu.setCafeId(cafeId);
//	menu.setFoodName(foodName);
//	menu.setFoodPrice(foodPrice);
//	
//	try {
//		String foodIds = menuOrderService.addFoodItem(menu);
//		dataResponse.addProperty("success", true);
//		dataResponse.addProperty("Food Id", foodIds);
//		dataResponse.addProperty("message", "Food Item added succesfully with Food Id \t" + foodIds);
//
//	} catch (MenuOrderException e) {
//		dataResponse.addProperty("success", false);
//		dataResponse.addProperty("message", e.getMessage());
//	}
//	return dataResponse.toString();
//}
}

//package com.capgemini.capcafe.cafedetails.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.capgemini.capcafe.cafedetails.entity.Cafe;
//import com.capgemini.capcafe.cafedetails.exception.CafeException;
//import com.capgemini.capcafe.cafedetails.service.CafeService;
//
//@CrossOrigin("http://localhost:4200")
//@RestController
//@RequestMapping(path = "/cafeManagement")
//public class CafeController {
//
//	@Autowired
//	private CafeService cafeService;
//
//	@PostMapping(path = "/newCafe")
//	public void addNewCafe(@RequestBody Cafe newCafe) {
//		this.cafeService.addCafe(newCafe);
//	}
//
//	@PostMapping(path = "/getCafeById")
//	public Cafe getCafeById(@RequestBody String cafeID) throws CafeException {
//		return this.cafeService.fetchCafeById(cafeID);
//	}
//
//	@PostMapping(path = "/removeCafeById")
//	public boolean removeCafe(@RequestBody String cafeID) throws CafeException {
//		return this.cafeService.removeCafe(cafeID);
//	
//	}
//
//	@GetMapping(path = "/getAllCafe")
//	public List<Cafe> getAllCafe() {
//		return this.cafeService.fetchAllCafe();
//	}
//	
//	@PostMapping(path = "/updateCafe")
//	public Cafe updateCafe (@RequestBody Cafe cafe) {
//		return this.cafeService.updateCafe(cafe);
//	}
//}
