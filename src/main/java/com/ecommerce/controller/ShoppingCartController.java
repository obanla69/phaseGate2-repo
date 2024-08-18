package com.ecommerce.controller;

import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Request.GetShoppingCartRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.service.ShoppingCartServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
public class ShoppingCartController {
    @Autowired
    private ShoppingCartServicesImpl shoppingCartServices;

    @PutMapping("/itemAddedToCart")
    public ResponseEntity <?>itemAddedToCart(@RequestBody UserCartRequest userCartRequest){
        try{
            return new ResponseEntity<>(shoppingCartServices.itemAddedToCart(userCartRequest),CREATED);
        }catch(Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }



    @GetMapping("view-cart/{id}")
    public ResponseEntity <?> viewCart( @PathVariable("id") String id){
        try{
            return new ResponseEntity<>(shoppingCartServices.viewShoppingCart(id),OK);
        }catch(Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }

}
