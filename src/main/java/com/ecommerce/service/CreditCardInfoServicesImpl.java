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
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ecommerce.data.Enums.CardType.MASTERCARD;

@Service
@RequiredArgsConstructor
public  class CreditCardInfoServicesImpl implements CreditCardInfoServices {

    private final Users users;
    private final CreditCardInfoRepository creditCardInfoRepository;

    @Override
    public DetailUserResponse createCustomerCreditDetails(DetailUserRequest detailUserRequest) {
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setCardName(detailUserRequest.getCardName());
        creditCardInformation.setCardCvv(detailUserRequest.getCardCvv());
        creditCardInformation.setCreditCardNumber(detailUserRequest.getCreditCardNumber());
        creditCardInformation.setCardType(detailUserRequest.getCardType());
        CreditCardInformation savedCreditCard= creditCardInfoRepository.save(creditCardInformation);
        DetailUserResponse detailUserResponse=new DetailUserResponse();
        detailUserResponse.setCardType(savedCreditCard.getCardType());
        detailUserResponse.setCardCvv(savedCreditCard.getCardCvv());
        detailUserResponse.setCreditCardNumber(savedCreditCard.getCreditCardNumber());
        detailUserResponse.setCardName(savedCreditCard.getCardName());
        return detailUserResponse;
    }



}
