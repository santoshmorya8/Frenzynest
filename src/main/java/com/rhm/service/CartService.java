package com.rhm.service;

import com.rhm.exception.ProductException;
import com.rhm.modal.Cart;
import com.rhm.modal.CartItem;
import com.rhm.modal.User;
import com.rhm.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
