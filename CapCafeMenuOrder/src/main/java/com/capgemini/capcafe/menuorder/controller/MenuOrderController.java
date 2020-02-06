package com.capgemini.capcafe.menuorder.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.service.MenuOrderService;
import com.google.gson.JsonObject;

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
@PostMapping(path = "/addmenu")
public void addMenu(@RequestBody MenuOrder menuorder) {
this.menuOrderService.addFoodItem(menuorder);
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

