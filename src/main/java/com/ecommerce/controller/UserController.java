package com.ecommerce.controller;

import com.ecommerce.dto.Request.*;
import com.ecommerce.service.ShoppingCartServicesImpl;
import com.ecommerce.service.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController("/commerce ")
public class UserController {

    @Autowired
    private UserServicesImpl userServices;
    @Autowired
    private ShoppingCartServicesImpl shoppingCartServices;


    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody UserRequest userRequest){
        try {
          return new ResponseEntity<>(userServices.signUP(userRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }

    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestBody DeleteUserRequest deleteUserRequest){
        try{
            return new ResponseEntity<>(userServices.deleteUser(deleteUserRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }
    @PostMapping("/loginUser")
    public ResponseEntity<?>loginUser(@RequestBody LoginRequest loginRequest){
        try {
            return new ResponseEntity<>(userServices.loginUser(loginRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }

    }

    @PostMapping("/getShoppingCart")
    public ResponseEntity<?>getShoppingCart(@RequestBody UserCartRequest getShoppingCartRequest){
        try{
            return new ResponseEntity<>(shoppingCartServices.itemAddedToCart(getShoppingCartRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }
    @PutMapping("/updatedToCart")
    public  ResponseEntity<?>updatedToCart(@RequestBody UpdateShoppingCartRequest updateShoppingCartRequest){
        try{
            return new ResponseEntity<>(userServices.updateShoppingCart(updateShoppingCartRequest),CREATED);
        }catch(Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }



}

