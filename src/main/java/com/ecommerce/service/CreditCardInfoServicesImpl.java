package com.ecommerce.service;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.model.Address;
import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.CreditCardInfoRepository;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.DetailUserRequest;
import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.dto.Response.DetailUserResponse;
import com.ecommerce.dto.Response.UserAddressResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ecommerce.data.Enums.CardType.MASTERCARD;

@Service
public  class CreditCardInfoServicesImpl implements CreditCardInfoServices {

@Autowired
    private Users users;
@Autowired
 private CreditCardInfoRepository creditCardInfoRepository;

    @Override
    public DetailUserResponse CreateCustomerCreditDetails(DetailUserRequest detailUserRequest) {
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        detailUserRequest.setNameOnCard(detailUserRequest.getNameOnCard());
        detailUserRequest.setCardCvv(detailUserRequest.getCardCvv());
        detailUserRequest.setCardExpirationYearAndMonth(detailUserRequest.getCardExpirationYearAndMonth());
        detailUserRequest.setCardName(detailUserRequest.getCardName());
        creditCardInfoRepository.save(creditCardInformation);
        DetailUserResponse detailUserResponse=new DetailUserResponse();
        detailUserResponse.setCardType(MASTERCARD);
        detailUserResponse.setId(creditCardInformation.getId());
        return detailUserResponse;
    }



}
