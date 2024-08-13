package com.ecommerce.data.repository;

import com.ecommerce.data.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepo extends MongoRepository<ShoppingCart,String>   {
    ShoppingCart findShoppingCartById(String id);
    ShoppingCart findShoppingCartByItems(String items);


}
