package com.ecommerce.exception;

public class BillingInformationAlreadyException extends RuntimeException {
    public BillingInformationAlreadyException(String message){
        super(message);
    }
}
