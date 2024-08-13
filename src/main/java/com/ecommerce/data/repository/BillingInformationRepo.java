package com.ecommerce.data.repository;

import com.ecommerce.data.model.BillingInformation;
import com.ecommerce.data.model.CreditCardInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingInformationRepo extends MongoRepository<BillingInformation,String> {
        BillingInformation findBillingInformationByAddress(String address);
        BillingInformation findBillingInformationByEmail(String email);
        BillingInformation findBillingInformationBy(String receiverNumber);
        BillingInformation findBillingInformationByName(String name);
}
