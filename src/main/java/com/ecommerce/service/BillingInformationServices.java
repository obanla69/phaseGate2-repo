package com.ecommerce.service;

import com.ecommerce.dto.Request.CustomerRequest;
import com.ecommerce.dto.Response.CustomerResponse;

public interface BillingInformationServices {
    CustomerResponse customerBillsIformation(CustomerRequest customerRequest);
}
