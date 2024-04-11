package org.example.rhm.project.Shopping.service.impl;

import org.example.rhm.project.Shopping.model.Shopping;
import org.example.rhm.project.Shopping.repository.ShoppingRepository;
import org.example.rhm.project.Shopping.service.ShoppingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    ShoppingRepository shoppingRepository;

    public ShoppingServiceImpl(ShoppingRepository shoppingRepository) {
        this.shoppingRepository = shoppingRepository;
    }

    @Override
    public String createShopping(Shopping shopping) {
        shoppingRepository.save(shopping);
        return "Success";
    }

    @Override
    public String updateShopping(Shopping shopping) {
        shoppingRepository.save(shopping);
        return "Success";
    }

    @Override
    public String deleteShopping(String userId) {
        shoppingRepository.deleteById(userId);
        return "Success";
    }

    @Override
    public Shopping getShopping(String userId) {
        return shoppingRepository.findById(userId).get();
    }

    @Override
    public List<Shopping> getAllShopping() {
        return shoppingRepository.findAll();
    }
}