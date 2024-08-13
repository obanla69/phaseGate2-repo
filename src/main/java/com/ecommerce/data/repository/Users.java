package com.ecommerce.data.repository;

import com.ecommerce.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface Users extends MongoRepository<User,String> {
    User findUserByPassword(String password);
    User findUserByEmail(String user);
    User findUserByName(String name);
    User findUserById(String id);
    User findUserByEmailIgnoreCase(String email);

}
