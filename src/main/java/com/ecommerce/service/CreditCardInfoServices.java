package com.ecommerce.service;

import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Response.DetailUserResponse;

public interface CreditCardInfoServices {
    DetailUserResponse createCustomerCreditDetails(DetailUserRequest detailUserRequest);


}
