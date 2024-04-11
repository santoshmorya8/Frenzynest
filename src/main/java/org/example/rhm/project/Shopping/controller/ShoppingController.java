package org.example.rhm.project.Shopping.controller;

import jakarta.validation.Valid;
import org.example.rhm.project.Shopping.model.Shopping;
import org.example.rhm.project.Shopping.service.ShoppingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Shopping")
public class ShoppingController {
    ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @PostMapping
    public String CreateShoppingDetails(@Valid @RequestBody Shopping shopping) {
        shoppingService.createShopping(shopping);
        return "Shopping Created Successfully";
    }

    @GetMapping()
    public List<Shopping> getAllShoppingDetails(){
        return shoppingService.getAllShopping();
    }

    @PutMapping
    public String updateShoppingDetails(@Valid @RequestBody Shopping shopping){
        shoppingService.updateShopping(shopping);
        return "Shopping Updated Successfull";
    }

    @DeleteMapping("{productId}")
    public String deleteShoppingDetails(@PathVariable("productId") String productId) {
        shoppingService.deleteShopping(productId);
        return "Shopping Deleted Successfully";
    }

    @GetMapping("{productId}")
    public Shopping getShoppingDetails(@PathVariable("productId") String productId) {
        return shoppingService.getShopping(productId);
    }
}