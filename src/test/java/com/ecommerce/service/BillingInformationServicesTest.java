package com.ecommerce.service;

import com.ecommerce.data.model.BillingInformation;
import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.CustomerRequest;
import com.ecommerce.dto.Response.CustomerResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static com.ecommerce.data.Enums.CardType.MASTERCARD;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BillingInformationServicesTest {
    @Autowired
    private BillingInformationServices billingInformationServices;


    @Test
    public void customerBillingInformation(){
        BillingInformation billingInformation=new BillingInformation();
        billingInformation.setName("oba");
        billingInformation.setReceiverPhoneNumber("897456");
        billingInformation.setEmail("yinka@gmail.com");
        billingInformation.setAddress("no 23 ikoyi lagos");

        CustomerRequest customerRequest=new CustomerRequest();
        CustomerResponse customerResponse=billingInformationServices.customerBillsIformation(customerRequest);

        assertThat(customerResponse).isNotNull();

    }

}
