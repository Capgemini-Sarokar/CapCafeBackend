package com.capgemini.capcafe.review.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capcafe.review.entity.FoodRatingEntity;

public interface FoodRatingRepo extends JpaRepository<FoodRatingEntity, String> {
	
	public List<FoodRatingEntity> findByCafeIdAndFoodId (String cafeId, String foodId);

}
