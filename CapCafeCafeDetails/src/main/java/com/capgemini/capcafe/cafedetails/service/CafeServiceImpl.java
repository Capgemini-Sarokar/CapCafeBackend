package com.capgemini.capcafe.cafedetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.capcafe.cafedetails.entity.Cafe;
import com.capgemini.capcafe.cafedetails.exception.CafeException;
import com.capgemini.capcafe.cafedetails.persistence.CafePersistence;

@Service
@Transactional(rollbackFor = CafeException.class)
public class CafeServiceImpl implements CafeService {
	
	@Autowired
	private CafePersistence cafePersistence;

	@Override
	public Cafe addCafe(Cafe cafe) {
		return cafePersistence.save(cafe);
	}

	@Override
	public Cafe fetchCafeById(String cafeID) throws CafeException {
		try {
			return cafePersistence.findById(cafeID).get();
		} catch (Exception error) {
			throw new CafeException("No cafe details are available for cafeId: ");
		}
	}


	@Override
	public List<Cafe> fetchAllCafe() {
		return (List<Cafe>) cafePersistence.findAll();
	}
	

	@Override
	public boolean removeCafe(String cafeID) throws CafeException {
		try {
			cafePersistence.deleteById(cafeID);
			return true;
		} catch (Exception error) {
			throw new CafeException("Invalid Cafe Id provided: ");
		}
	}

	@Override
	public Cafe updateCafe(Cafe cafe) {
		return cafePersistence.save(cafe);
	}


}

