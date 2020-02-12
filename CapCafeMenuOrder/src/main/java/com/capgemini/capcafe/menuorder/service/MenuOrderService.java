package com.capgemini.capcafe.menuorder.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;

@Service

public interface MenuOrderService {

    MenuOrder addFoodItem(MenuOrder menu);
	
    List<MenuOrder> fetchFoodById(String foodID) throws MenuOrderException;
	
	List<MenuOrder> fetchMenu();
	
	boolean removeFoodItem(String cafeId, String foodID) throws MenuOrderException;
	
	MenuOrder updateMenu(MenuOrder menu);

	List<MenuOrder> getAllFoodsByCafeId (String cafeId) throws MenuOrderException;

}

