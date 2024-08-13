package com.ecommerce.controller;

import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.UpdateProductRequest;
import com.ecommerce.service.ProductServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ProductServiceController {
    @Autowired
    private ProductServicesImpl productServices;

    @PutMapping("/addProduct")
    public ResponseEntity<?>addProduct(@RequestBody AddProductRequest addProductRequest){
        try{
            return new ResponseEntity<>(productServices.addProduct(addProductRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }
    @PutMapping("/updateProduct")
    public ResponseEntity<?>updateProduct(@RequestBody UpdateProductRequest updateProductRequest){
        try{
            return new ResponseEntity<>(productServices.updateProduct(updateProductRequest),CREATED);
        }catch(Exception exception){
            return  new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }

}
