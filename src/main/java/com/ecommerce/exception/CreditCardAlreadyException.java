package com.ecommerce.exception;

public class CreditCardAlreadyException extends RuntimeException{

    public CreditCardAlreadyException(String message){

        super(message);
    }
}
