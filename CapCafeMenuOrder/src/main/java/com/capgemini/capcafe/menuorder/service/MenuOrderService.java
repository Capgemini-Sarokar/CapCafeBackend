package com.capgemini.capcafe.menuorder.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;



public interface MenuOrderService {


	public MenuOrder addFoodItem(MenuOrder menus) ;
	public List<MenuOrder> fetchAllMenu();
	public MenuOrder fetchMenuById(String cafeID) throws MenuOrderException;
	public boolean removeMenu(String foodID) throws MenuOrderException ;
	public MenuOrder updateCafe(MenuOrder menu);
	

}

