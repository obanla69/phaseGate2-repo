package com.ecommerce.controller;

import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.service.CreditCardInfoServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class CreditCardInformation {
    @Autowired
    private CreditCardInfoServicesImpl creditCardInfoServices;

    @PostMapping("/CreateCustomerCreditDetails")
        public ResponseEntity<?>createCustomerCreditDetails(@RequestBody DetailUserRequest detailUserRequest) {
        try{
            return new ResponseEntity<>(creditCardInfoServices.CreateCustomerCreditDetails(detailUserRequest),CREATED);
        }catch(Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }

}
