package com.ecommerce.service;

import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.data.repository.Users;
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
        CreditCardInformation creditCardInformation=new CreditCardInformation();
        detailUserRequest.setCardExpirationYearAndMonth(LocalDateTime.now().plusMonths(2));
        detailUserRequest.setCardCvv("323");
        creditCardInformation.setCardType(MASTERCARD);
        detailUserRequest.setCardExpirationYearAndMonth(LocalDateTime.now().plusMonths(2));
        detailUserRequest.setId("12");
        detailUserRequest.setCardName("obanla");

        DetailUserResponse detailUserResponse = creditCardInfoServices.CreateCustomerCreditDetails(detailUserRequest);
        assertThat(detailUserResponse).isNotNull();
        assertThat(detailUserResponse.getCardType()).isEqualTo(MASTERCARD);





    }

}
