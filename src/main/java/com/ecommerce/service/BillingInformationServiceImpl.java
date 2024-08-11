package com.ecommerce.service;

import com.ecommerce.data.model.BillingInformation;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.BillingInformationRepo;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.CustomerRequest;
import com.ecommerce.dto.Response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingInformationServiceImpl implements BillingInformationServices {

    @Autowired
    Users users;
    @Autowired
    BillingInformationRepo billingInformationRepo;

    @Override
    public CustomerResponse customerBillsIformation(CustomerRequest customerRequest) {
        BillingInformation billingInformation=new BillingInformation();
        customerRequest.setName(customerRequest.getName());
        customerRequest.setId(customerRequest.getId());
        customerRequest.setCreditCardInformation(customerRequest.getCreditCardInformation());
        customerRequest.setReceiverPhone(customerRequest.getReceiverPhone());
        customerRequest.setReceiverPhone(customerRequest.getReceiverPhone());
        billingInformationRepo.save(billingInformation);

        CustomerResponse customerResponse = new CustomerResponse();

        return customerResponse;

    }
}
