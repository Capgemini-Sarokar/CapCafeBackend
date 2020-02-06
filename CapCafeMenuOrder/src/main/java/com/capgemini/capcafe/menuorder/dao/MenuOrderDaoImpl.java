package com.capgemini.capcafe.menuorder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.repository.menuorderrepository;

@Component
public class MenuOrderDaoImpl implements MenuOrderDao  {
    @Autowired
	menuorderrepository menurepository;

    public String addMenuDetails(MenuOrder menuodr) throws MenuOrderException {

        String foodId = null;
        try {
        	MenuOrder menuOrder = new MenuOrder();
        	menuOrder.setFoodId(menuodr.getFoodId());
        	menuOrder.setCafeId(menuodr.getCafeId());
        	menuOrder.setFoodName(menuodr.getFoodName());
        	menuOrder.setFoodPrice(menuodr.getFoodPrice());
            foodId = menuodr.getFoodId();
        	menuOrder = menurepository.save(menuOrder);
        	
        }
        catch(Exception e){
        	throw new MenuOrderException(e.getMessage());
        }
		
		return foodId;
	}
	}
	
	


