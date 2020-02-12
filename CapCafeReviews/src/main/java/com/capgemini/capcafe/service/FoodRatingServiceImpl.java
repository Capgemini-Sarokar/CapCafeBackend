package com.capgemini.capcafe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.capcafe.review.entity.CafeRatingEntity;
import com.capgemini.capcafe.review.entity.FoodRatingEntity;
import com.capgemini.capcafe.review.entity.FoodRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;
import com.capgemini.capcafe.review.persistence.CafeRatingRepo;
import com.capgemini.capcafe.review.persistence.FoodRatingRepo;

import lombok.extern.slf4j.Slf4j;
@Service
@Transactional(rollbackFor = ReviewException.class)
public class FoodRatingServiceImpl implements FoodRatingService {
	
	@Autowired
	FoodRatingRepo foodRatingRepo;

	@Override
	public FoodRatingEntity addRating(FoodRatingEntity foodRatingEntity) {
		return foodRatingRepo.save(foodRatingEntity);
	}

	@Override
	public FoodRatingEntity fetchRatingById(String ratingId) throws ReviewException {
		return foodRatingRepo.findById(ratingId).get();
	}

	@Override
	public List<FoodRatingEntity> fetchRating() {
		return foodRatingRepo.findAll();
	}

	@Override
	public boolean removeRating(String ratingID) throws ReviewException {
		boolean itemDeleted = false;
		List<FoodRatingEntity> temp = this.foodRatingRepo.findAll();
		for (FoodRatingEntity item : temp) {
			if (item.getReviewId().equals(ratingID)) {
				this.foodRatingRepo.delete(item);
				itemDeleted = true;
				break;
			}
		}
		if (itemDeleted) {
			return itemDeleted;
		} else {
			throw new ReviewException ("Could Not delete Item");
		}
	}

	@Override
	public List<FoodRatingEntity> getRatingsByFoodId(String cafeId,String foodId) throws ReviewException {
		return foodRatingRepo.findByCafeIdAndFoodId(cafeId, foodId);
	}

}
