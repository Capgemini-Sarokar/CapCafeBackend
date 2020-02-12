package com.capgemini.capcafe.review.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.review.entity.CafeRatingEntity;

public interface CafeRatingRepo extends JpaRepository<CafeRatingEntity, String> {
	
	public List<CafeRatingEntity> findByCafeId (String cafeId);

}
