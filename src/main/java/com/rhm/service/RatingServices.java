package com.rhm.service;

import java.util.List;

import com.rhm.exception.ProductException;
import com.rhm.modal.Rating;
import com.rhm.modal.User;
import com.rhm.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
