package com.ecommerce.data.repository;

import com.ecommerce.data.model.CreditCardInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreditCardInfoRepository extends MongoRepository<CreditCardInformation,String> {

    CreditCardInformation findCreditCardInformationById(String id);
    CreditCardInformation findCreditCardInformationByCardType(String cvv);

}
