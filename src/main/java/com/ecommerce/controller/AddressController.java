package com.ecommerce.controller;

import com.ecommerce.dto.Request.CustomerRequest;
import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.service.AddressServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class AddressController {
    @Autowired
    private AddressServicesImpl addressServices;

    @GetMapping("/customerAddress")
    public ResponseEntity<?>customerAddress(@RequestBody UserAddressRequest userAddressRequest){
        try{
            return new ResponseEntity<>(addressServices.customerAdress(userAddressRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }
}
