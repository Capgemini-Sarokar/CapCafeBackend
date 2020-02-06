package com.capgemini.capcafe.menuorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	public MenuOrder addFoodItem(MenuOrder menus)  {
		return menurepository.save(menus);
	}
	@Override
	public List<MenuOrder> fetchAllMenu() {
		return (List<MenuOrder>) menurepository.findAll();
	}
	@Override
	public MenuOrder fetchMenuById(String foodID) throws MenuOrderException {
		try {
			return menurepository.findById(foodID).get();
		} catch (Exception error) {
			throw new MenuOrderException("No cafe details are available for cafeId: ");
		}
	}
	
	@Override
	public boolean removeMenu(String foodID) throws MenuOrderException {
		try {
			menurepository.deleteById(foodID);
			return true;
		} catch (Exception error) {
			throw new MenuOrderException("Invalid Cafe Id provided: ");
		}
	}
	
	@Override
	public MenuOrder updateCafe(MenuOrder menu) {
		return menurepository.save(menu);
	}
	
//	@Override
//	public Cafe fetchCafeById(String cafeID) throws CafeException {
//		try {
//			return cafePersistence.findById(cafeID).get();
//		} catch (Exception error) {
//			throw new CafeException("No cafe details are available for cafeId: ");
//		}
//	}
//
//
//	@Override
//	public List<Cafe> fetchAllCafe() {
//		return (List<Cafe>) cafePersistence.findAll();
//	}
//	
//
//	@Override
//	public boolean removeCafe(String cafeID) throws CafeException {
//		try {
//			cafePersistence.deleteById(cafeID);
//			return true;
//		} catch (Exception error) {
//			throw new CafeException("Invalid Cafe Id provided: ");
//		}
//	}
//
//	@Override
//	public Cafe updateCafe(Cafe cafe) {
//		return cafePersistence.save(cafe);
//	}



}

//@Override
//@Override
//public Cafe addCafe(Cafe cafe) {
//	return cafePersistence.save(cafe);
//}
////public Cafe fetchCafeById(String cafeID) throws CafeException {
//	try {
//		return cafePersistence.findById(cafeID).get();
//	} catch (Exception error) {
//		throw new CafeException("No cafe details are available for cafeId: ");
//	}
//}
//
//
//@Override
//public List<Cafe> fetchAllCafe() {
//	return (List<Cafe>) cafePersistence.findAll();
//}
//
//
//@Override
//public boolean removeCafe(String cafeID) throws CafeException {
//	try {
//		cafePersistence.deleteById(cafeID);
//		return true;
//	} catch (Exception error) {
//		throw new CafeException("Invalid Cafe Id provided: ");
//	}
//}
//
//@Override
//public Cafe updateCafe(Cafe cafe) {
//	return cafePersistence.save(cafe);
//}
//
//
//}


