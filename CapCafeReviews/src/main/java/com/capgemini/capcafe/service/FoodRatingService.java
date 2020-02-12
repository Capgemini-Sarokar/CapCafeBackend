package com.capgemini.capcafe.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.capgemini.capcafe.review.entity.FoodRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;



public interface FoodRatingService {

	
    FoodRatingEntity addRating(FoodRatingEntity foodRatingEntity);
	
    FoodRatingEntity fetchRatingById(String ratingID) throws ReviewException;
	
	List<FoodRatingEntity> fetchRating();
	
	boolean removeRating(String foodID) throws ReviewException;
	

	List<FoodRatingEntity> getRatingsByFoodId (String cafeId,String foodId) throws ReviewException;

}
