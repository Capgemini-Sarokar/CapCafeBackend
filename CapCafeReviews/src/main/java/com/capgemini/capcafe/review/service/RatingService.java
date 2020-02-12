package com.capgemini.capcafe.review.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.capgemini.capcafe.review.entity.CafeRatingEntity;
import com.capgemini.capcafe.review.exception.ReviewException;

@Service

public interface RatingService {

	CafeRatingEntity addReview(CafeRatingEntity cafeRatingEntity) throws ReviewException ;
	
	List<CafeRatingEntity> getAllReviews() throws ReviewException ;
	
	CafeRatingEntity getReviewsById(String ratingId) throws ReviewException;
	
	List<CafeRatingEntity> getReviewsByCafeId(String cafeId) throws ReviewException ;
	
	boolean deleteReview(String ratingId) throws ReviewException;
 	
	
}
