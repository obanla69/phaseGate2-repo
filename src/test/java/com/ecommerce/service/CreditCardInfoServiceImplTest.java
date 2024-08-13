package com.ecommerce.service;

import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Response.DetailUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static com.ecommerce.data.Enums.CardType.MASTERCARD;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CreditCardInfoServiceImplTest {
    @Autowired
        private CreditCardInfoServices creditCardInfoServices;


    @Test
    public void CreateCustomerCreditDetail(){
        DetailUserRequest detailUserRequest=new DetailUserRequest();
        detailUserRequest.setCardCvv("323");
        detailUserRequest.setCardType(MASTERCARD);
        detailUserRequest.setCardName("obanla");
        detailUserRequest.setCreditCardNumber("4554323456");


        DetailUserResponse detailUserResponse = creditCardInfoServices.createCustomerCreditDetails(detailUserRequest);
        assertThat(detailUserResponse).isNotNull();






    }

}
