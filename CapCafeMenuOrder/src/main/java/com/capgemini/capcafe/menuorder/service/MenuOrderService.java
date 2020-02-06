package com.capgemini.capcafe.menuorder.service;

import org.springframework.stereotype.Service;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;

@Service

public interface MenuOrderService {


	public String addFoodItem(MenuOrder menus) throws MenuOrderException;

}

