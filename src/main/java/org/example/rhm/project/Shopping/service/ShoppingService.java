package org.example.rhm.project.Shopping.service;

import org.example.rhm.project.Shopping.model.Shopping;

import java.util.List;


public interface ShoppingService {
    public String createShopping(Shopping shopping);
    public String updateShopping(Shopping shopping);
    public String deleteShopping(String userId);
    public Shopping getShopping(String userId);
    public List<Shopping> getAllShopping();
}