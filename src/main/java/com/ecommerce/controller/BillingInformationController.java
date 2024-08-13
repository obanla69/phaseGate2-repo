package com.ecommerce.controller;

import com.ecommerce.dto.Request.CustomerRequest;
import com.ecommerce.service.BillingInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class BillingInformationController {
    @Autowired
    public BillingInformationServiceImpl billingInformationService;

    @GetMapping("/customerBillInformation")
     public ResponseEntity<?>customerBillInformation(@RequestBody CustomerRequest customerRequest){
        try{
            return new ResponseEntity<>(billingInformationService.customerBillsIformation(customerRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }

    }


}
