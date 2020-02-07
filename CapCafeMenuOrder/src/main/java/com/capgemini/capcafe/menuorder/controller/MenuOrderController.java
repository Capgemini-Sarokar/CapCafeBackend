package com.capgemini.capcafe.menuorder.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.service.MenuOrderService;
import com.google.gson.JsonObject;


@RestController
@RequestMapping("/menu")
public class MenuOrderController {

@Autowired
MenuOrderService menuOrderService;
@CrossOrigin(origins = "http://localhost:4200")
@PostMapping(path = "/addMenu")

public String addMenu(@RequestBody MenuOrder menu) {

	JsonObject dataResponse = new JsonObject();
	
//	String foodId = requestData.get("foodId").toString();
//	String cafeId = requestData.get("cafeId").toString();
//	String foodName = requestData.get("foodName").toString();
//	int foodPrice = Integer.parseInt(requestData.get("foodPrice").toString());
//	
//	menu.setFoodId(foodId);
//	menu.setCafeId(cafeId);
//	menu.setFoodName(foodName);
//	menu.setFoodPrice(foodPrice);
	
	try {
		MenuOrder foodIds = menuOrderService.addFoodItem(menu);
		dataResponse.addProperty("success", true);
	
		dataResponse.addProperty("message", "Food Item added succesfully with Food Id \t");

	} catch (MenuOrderException e) {
		dataResponse.addProperty("success", false);
		dataResponse.addProperty("message", e.getMessage());
	}
	return dataResponse.toString();
}
}

