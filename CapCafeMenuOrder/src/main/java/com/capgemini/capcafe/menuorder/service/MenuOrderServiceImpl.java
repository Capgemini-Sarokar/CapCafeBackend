package com.capgemini.capcafe.menuorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.capcafe.menuorder.dao.MenuOrderDao;
import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;

@Component
public class MenuOrderServiceImpl implements MenuOrderService {

	@Autowired
	MenuOrderDao menuDAO;
	@Override
	public String addFoodItem(MenuOrder menus) throws MenuOrderException {
		String foodId = null;
	    try {
	    	foodId = menuDAO.addMenuDetails(menus);
	    }
	    catch(Exception e) {
	    	throw new MenuOrderException(e.getMessage());
	    }
	    
	    return foodId;
	}

}
