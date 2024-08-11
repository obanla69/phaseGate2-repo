package com.ecommerce.controller;

import com.ecommerce.dto.Request.DeleteUserRequest;
import com.ecommerce.dto.Request.LoginRequest;
import com.ecommerce.dto.Request.UserRequest;
import com.ecommerce.dto.Response.UserResponse;
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

}

