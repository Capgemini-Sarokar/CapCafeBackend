package com.capgemini.capcafe.cafedetails.service;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.exception.CafeException;

public interface CafeService {

	public void addNewCafe (Cafe newCafe) throws CafeException;
}
