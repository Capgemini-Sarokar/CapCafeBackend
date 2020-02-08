package com.capgemini.capcafe.menuorder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.repository.menuorderrepository;


@Service
@Transactional(rollbackFor = MenuOrderException.class)

public class MenuOrderServiceImpl implements MenuOrderService {

	@Autowired
	menuorderrepository menurepository;

	@Override
	public MenuOrder addFoodItem(MenuOrder menu) {
		return menurepository.save(menu);
	}

	@Override
	public MenuOrder fetchFoodById(String foodID) throws MenuOrderException {
		try {
			return menurepository.findById(foodID).get();
		} catch (Exception error) {
			throw new MenuOrderException(error.getMessage());
		}
	}

	@Override
	public List<MenuOrder> fetchMenu() {
		return (List<MenuOrder>) menurepository.findAll();
	}

	@Override
	public boolean removeFoodItem(String foodID) throws MenuOrderException {
		try {
			menurepository.deleteById(foodID);
			return true;
		} catch (Exception error) {
			throw new MenuOrderException(error.getMessage());
		}
	}

	@Override
	public MenuOrder updateMenu(MenuOrder menu) {
		return menurepository.save(menu);
	}

	
}