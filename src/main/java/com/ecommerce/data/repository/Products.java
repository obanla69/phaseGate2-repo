package com.ecommerce.data.repository;

import com.ecommerce.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Products extends MongoRepository<Product,String> {
    Product findProductByPrice(String price);
    Product findProductByProductName(String productName);
    Product findProductById(String productId);

}
