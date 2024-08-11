package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.*;
import com.ecommerce.dto.Request.DeleteUserRequest;
import com.ecommerce.dto.Request.LoginRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserRequest;
import com.ecommerce.dto.Response.DeleteUserResponse;
import com.ecommerce.dto.Response.UserResponse;
import com.ecommerce.exception.UserAlreadyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
         private Addresses addresses;
    @Autowired
        private  Users users;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    @Autowired
    private Products products;



    @Override
    public UserResponse signUP(UserRequest userRequest) {
        if(users.findUserByEmailIgnoreCase(userRequest.getEmail()) != null) {
            throw new RuntimeException("user already exist");
        }
        User user = new User();
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setAge(userRequest.getAge());
        users.save(user);
        UserResponse userResponse = new UserResponse();
        userResponse.setMessage("you have been signUp successful");
        userResponse.setId(user.getId());
        return userResponse;
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest) {
        DeleteUserResponse response = new DeleteUserResponse();
        User newUser = users.findUserById(deleteUserRequest.getUserId());
        users.delete(newUser);
        response.setMessage("User successfully Deleted");
        return response;

    }


    @Override
    public UserResponse loginUser(LoginRequest loginRequest) {
        UserResponse userResponse = new UserResponse();
        User user = users.findUserByEmail(loginRequest.getEmail());
        if(user != null && ((user.getPassword()).equals(loginRequest.getPassword()))){
            user.setLogin(true);
            users.save(user);
            userResponse.setMessage("you have login successful");
            userResponse.setId(user.getId());
            return userResponse;
        }
            throw new UserAlreadyException("Already details");
    }

    @Override
    public User findUserByEmail(String email) {
     return   users.findUserByEmailIgnoreCase(email);
    }
    @Override
    public List<User> getAllUser() {
        return users.findAll();
    }
    @Override
    public List<Item>items(){
        return itemRepo.findAll();
    }

    @Override
    public void deleteAllUsers() {
        users.deleteAll();
    }

    @Override
    public Optional<User> findUserById(String id) {
        return Optional.empty();
    }
    @Override
    public ShoppingCart getShoppingCart(){
        ShoppingCart shoppingCart= shoppingCartRepo.findShoppingCartById("id");
        Product product=products.findProductByProductId("id");
        Item item= new Item();
        item.setProduct(item.getProduct());
        item.setQuantityOfProduct(item.getQuantityOfProduct());
        shoppingCart.getItems().add(item);
        return shoppingCartRepo.save(shoppingCart);

    }
    @Override
    public ShoppingCart updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest){
        ShoppingCart shoppingCart=shoppingCartRepo.findShoppingCartById("id");
        Product product=products.findProductByProductId("id");
        Item item=new Item();
        item.setProduct(product);
        item.setProduct(item.getProduct());
        item.setQuantityOfProduct(item.getQuantityOfProduct());
        shoppingCart.getItems().add(item);
         shoppingCartRepo.save(shoppingCart);
         return (ShoppingCart) shoppingCartRepo.findAll();
    }

}

