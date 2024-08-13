package com.ecommerce.exception;

public class ProductAlreadyExit extends RuntimeException{
    public ProductAlreadyExit(String message){
        super(message);
    }
}
