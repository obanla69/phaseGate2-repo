package com.ecommerce.data.repository;

import com.ecommerce.data.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepo extends MongoRepository<Item,String> {
    Item findItemById(String Id);
    Item findItemByProduct(String product);
}
