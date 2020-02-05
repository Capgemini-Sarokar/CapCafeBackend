package com.capgemini.capcafe.cafedetails.service;

import java.util.List;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.exception.CafeException;

public interface CafeService {

	Cafe addCafe(Cafe cafe);
	
	Cafe fetchCafeById(String cafeID) throws CafeException;
	
	List<Cafe> fetchAllCafe();
	
	boolean removeCafe(String cafeID) throws CafeException;
	
	Cafe updateCafe(Cafe cafe);
	
}