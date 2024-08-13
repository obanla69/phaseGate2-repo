package com.ecommerce.service;

import com.ecommerce.data.model.BillingInformation;
import com.ecommerce.data.model.CreditCardInformation;
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
        System.out.println(customerRequest.getAddress());
        BillingInformation billingInformation=new BillingInformation();
        billingInformation.setName(customerRequest.getName());
        billingInformation.setReceiverPhoneNumber(customerRequest.getReceiverPhone());
        billingInformation.setAddress(customerRequest.getAddress());
        billingInformation.setEmail(customerRequest.getEmail());
        System.out.println(billingInformation.getAddress());
        billingInformation = billingInformationRepo.save(billingInformation);
        System.out.println(billingInformation.getAddress());

        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(billingInformation.getName());
        customerResponse.setReceiverPhoneNumber(billingInformation.getReceiverPhoneNumber());
        customerResponse.setAddress(billingInformation.getAddress());
        customerResponse.setEmail(billingInformation.getEmail());

        return customerResponse;

    }
}
