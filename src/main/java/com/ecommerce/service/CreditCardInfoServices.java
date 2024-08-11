package com.ecommerce.service;

import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.dto.Response.DetailUserResponse;
import com.ecommerce.dto.Response.UserAddressResponse;

public interface CreditCardInfoServices {
    DetailUserResponse CreateCustomerCreditDetails(DetailUserRequest detailUserRequest);


}
