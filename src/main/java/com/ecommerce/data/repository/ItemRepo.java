package com.ecommerce.data.repository;

import com.ecommerce.data.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends MongoRepository<Item,String> {
   Item findItemByQuantityOfProduct(String quantityOfProduct);
    Item findItemByProduct(String product);
}
