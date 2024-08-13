package com.ecommerce.data.repository;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.model.CreditCardInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardInfoRepository extends MongoRepository<CreditCardInformation,String> {
    CreditCardInformation findCreditCardInformationByCardName(String cardName);
    CreditCardInformation findCreditCardInformationByCreditCardNumber(String cardNumber);
    CreditCardInformation findCreditCardInformationByCardType(CardType cardType);
    CreditCardInformation findCreditCardInformationByCardCvv(String cvv);

}
