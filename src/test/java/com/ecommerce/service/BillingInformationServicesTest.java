package com.ecommerce.service;

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
    @Autowired
    private Users users;
    @Autowired
    private CreditCardInfoServices creditCardInfoServices;

    @Test
    public void customerBillingInformation(){
        CustomerRequest customerRequest=new CustomerRequest();
        CreditCardInformation creditCardInformation =new CreditCardInformation();
        creditCardInformation.setCardCvv("3234");
        creditCardInformation.setCardType(MASTERCARD);
        creditCardInformation.setCardName("KING");
        creditCardInformation.setCardExpirationYearAndMonth(LocalDateTime.now().plusMonths(2));
        customerRequest.setReceiverPhone("0814567456");
        customerRequest.setCreditCardInformation(creditCardInformation);
        customerRequest.setName("obanla");
        customerRequest.setId("54");

        CustomerResponse customerResponse=billingInformationServices.customerBillsIformation(customerRequest);
        assertThat(customerResponse).isNotNull();

    }

}
