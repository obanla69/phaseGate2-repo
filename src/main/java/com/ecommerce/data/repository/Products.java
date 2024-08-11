package com.ecommerce.data.repository;

import com.ecommerce.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Products extends MongoRepository<Product,String> {
    Product findProductByPrice(String price);
    Product findProductByProductName(String productName);
    Product findProductByProductId(String productId);

}
