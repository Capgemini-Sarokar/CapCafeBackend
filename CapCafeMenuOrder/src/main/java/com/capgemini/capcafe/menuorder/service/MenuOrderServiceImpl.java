package com.capgemini.capcafe.menuorder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.capcafe.menuorder.exception.MenuOrderException;
import com.capgemini.capcafe.menuorder.model.MenuOrder;
import com.capgemini.capcafe.menuorder.repository.MenuOrderRepository;


@Service
@Transactional(rollbackFor = MenuOrderException.class)

public class MenuOrderServiceImpl implements MenuOrderService {

	@Autowired
	MenuOrderRepository menurepository;

	@Override
	public MenuOrder addFoodItem(MenuOrder menu) {
		return menurepository.save(menu);
	}

	@Override
	public List<MenuOrder> fetchFoodById(String foodID) throws MenuOrderException {
		List<MenuOrder> temp = this.menurepository.findAll();
		List<MenuOrder> result = new ArrayList<MenuOrder>();
		for (MenuOrder item : temp) {
			if (item.getFoodId().equals(foodID)) {
				result.add(item);
			}
		}
		return result;
	}

	@Override
	public List<MenuOrder> fetchMenu() {
		return (List<MenuOrder>) menurepository.findAll();
	}

	@Override
	public boolean removeFoodItem(String cafeId, String foodId) throws MenuOrderException {
		boolean itemDeleted = false;
		List<MenuOrder> temp = this.menurepository.findAll();
		for (MenuOrder item : temp) {
			if (item.getCafeId().equals(cafeId) && item.getFoodId().equals(foodId)) {
				this.menurepository.delete(item);
				itemDeleted = true;
				break;
			}
		}
		if (itemDeleted) {
			return itemDeleted;
		} else {
			throw new MenuOrderException ("Could Not delete Item");
		}
	}

	@Override
	public MenuOrder updateMenu(MenuOrder menu) {
		return menurepository.save(menu);
	}

	@Override
	public List<MenuOrder> getAllFoodsByCafeId(String cafeId) throws MenuOrderException {
		List<MenuOrder> temp = this.menurepository.findAll();
		List<MenuOrder> result = new ArrayList<MenuOrder>();
		for (MenuOrder item : temp) {
			if (item.getCafeId().equals(cafeId)) {
				result.add(item);
			}
		}
		return result;
	}

	
}