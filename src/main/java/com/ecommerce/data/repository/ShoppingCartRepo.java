package com.ecommerce.data.repository;

import com.ecommerce.data.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingCartRepo extends MongoRepository<ShoppingCart,String>   {
    ShoppingCart findShoppingCartById(String id);

}
