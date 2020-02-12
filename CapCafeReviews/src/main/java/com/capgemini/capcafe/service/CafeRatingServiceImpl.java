package com.capgemini.capcafe.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.capgemini.capcafe.review.entity.CafeRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;
import com.capgemini.capcafe.review.persistence.CafeRatingRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional(rollbackFor = ReviewException.class)

public class CafeRatingServiceImpl implements RatingService{
	
	@Autowired
	CafeRatingRepo cafeRatingRepo;

	@Override
	public CafeRatingEntity addReview(CafeRatingEntity cafeRatingEntity) throws ReviewException {
		return cafeRatingRepo.save(cafeRatingEntity);
	}

	@Override
	public List<CafeRatingEntity> getAllReviews() throws ReviewException {
		return cafeRatingRepo.findAll();
	}

	@Override
	public CafeRatingEntity getReviewsById(String ratingId) throws ReviewException {
		return cafeRatingRepo.findById(ratingId).get();
	}

	@Override
	public boolean deleteReview(String ratingId) throws ReviewException {
		boolean itemDeleted = false;
		List<CafeRatingEntity> temp = this.cafeRatingRepo.findAll();
		for (CafeRatingEntity item : temp) {
			if (item.getReviewId().equals(ratingId)) {
				this.cafeRatingRepo.delete(item);
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
	public List<CafeRatingEntity> getReviewsByCafeId(String cafeId) throws ReviewException {
		return cafeRatingRepo.findByCafeId(cafeId);
	}




	

}
