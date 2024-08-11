package com.ecommerce.controller;

import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.service.ShoppingCartServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartServicesImpl shoppingCartServices;

    @GetMapping("/itemAddedToCart")
    public ResponseEntity <?>itemAddedToCart(@RequestBody UserCartRequest userCartRequest){
        try{
            return new ResponseEntity<>(shoppingCartServices.itemAddedToCart(userCartRequest),CREATED);
        }catch(Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }

    @PostMapping("/updatedToCart")
    public  ResponseEntity<?>updatedToCart(@RequestBody UpdateShoppingCartRequest updateShoppingCartRequest){
        try{
            return new ResponseEntity<>(shoppingCartServices.updateShoppingCart(updateShoppingCartRequest),CREATED);
        }catch(Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }
}
