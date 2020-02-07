package com.capgemini.capcafe.menuorder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.repository.menuorderrepository;
@Component
public class MenuOrderDaoImpl implements MenuOrderDAO {

	@Autowired
	menuorderrepository menurepository;

	@Override
	public MenuOrder addMenu(MenuOrder menu) throws MenuOrderException {
		String foodId = null;
		{
			return menurepository.saveAndFlush(menu);
		
		}
	}
}


