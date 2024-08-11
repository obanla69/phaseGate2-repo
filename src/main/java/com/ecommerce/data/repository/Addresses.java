package com.ecommerce.data.repository;

import com.ecommerce.data.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Addresses extends MongoRepository<Address,String> {
    Address findAddressesByCityName(String cityName);
    Address findAddressesByStreet(String Street);
}
