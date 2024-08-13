package com.ecommerce.data.repository;

import com.ecommerce.data.model.PlaceOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceOrderRepo extends MongoRepository<PlaceOrder,String> {
    PlaceOrder findPlaceOrderByCreatedDate(String createdDate);
}
