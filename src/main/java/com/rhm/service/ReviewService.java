package com.rhm.service;

import java.util.List;

import com.rhm.exception.ProductException;
import com.rhm.modal.Review;
import com.rhm.modal.User;
import com.rhm.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
