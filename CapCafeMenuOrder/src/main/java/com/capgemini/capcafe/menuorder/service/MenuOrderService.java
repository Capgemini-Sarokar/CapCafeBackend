package com.capgemini.capcafe.menuorder.service;

import org.springframework.stereotype.Service;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;



public interface MenuOrderService {


	public MenuOrder addFoodItem(MenuOrder menus) ;

}

