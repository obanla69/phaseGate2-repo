package com.ecommerce.data.repository;

import com.ecommerce.data.model.BillingInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BillingInformationRepo extends MongoRepository<BillingInformation,String> {
        BillingInformation findBillingInformationById(String id);
        BillingInformation findBillingInformationByCreditCardInformation(String creditCardInformation);
}
