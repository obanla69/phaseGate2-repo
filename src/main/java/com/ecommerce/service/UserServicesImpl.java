package com.ecommerce.service;

import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.*;
import com.ecommerce.dto.Request.*;
import com.ecommerce.dto.Response.*;
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
    private Users users;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    @Autowired
    private Products products;


    @Override
    public UserResponse signUP(UserRequest userRequest) {
        if (users.findUserByEmailIgnoreCase(userRequest.getEmail()) != null) {
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
        if (user != null && ((user.getPassword()).equals(loginRequest.getPassword()))) {
            user.setLogin(true);
            users.save(user);
            userResponse.setMessage("you have login successful");
            userResponse.setId(user.getId());
            return userResponse;
        }
        throw new UserAlreadyException("Already exist");
    }

    @Override
    public UserLogoutResponse logout(UserLogoutRequest userLogoutResponse) {
        return null;
    }

//    @Override
//    public UserLogoutResponse logout(UserLogoutRequest userLogoutResponse) {
//
//            User user =users.findUserByEmail(UserLogoutRequest.getEmail);
//            users.setLogout(true);
//            users.save(user);
//            UserLogoutResponse logoutResponse = new UserLogoutResponse();
//            logoutResponse.setMessage("Successfully logged out");
//            return logoutResponse;
//
//    }

    private User findByEmail(String email) {
        return users.findUserByEmail("email");
    }

    @Override
    public User findUserByEmail(String email) {
        return users.findUserByEmailIgnoreCase(email);
    }

    @Override
    public List<User> getAllUser() {
        return users.findAll();
    }

    @Override
    public List<Item> items() {
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
    public GetShoppingCartResponse getShoppingCartToCart(GetShoppingCartRequest getShoppingCartRequest) {
        ShoppingCart shoppingCart = shoppingCartRepo.findShoppingCartById("id");
        Product product = products.findProductById("id");
        Item item = new Item();

        product.setPrice(item.getPrice());
        product.setProductDescription(item.getProductDescription());
        product.setPrice(item.getPrice());
        shoppingCart.getItems().add(item);
        shoppingCartRepo.save(shoppingCart);
        GetShoppingCartResponse getShoppingCartResponse = new GetShoppingCartResponse();
        getShoppingCartResponse.setPrice(item.getPrice());
        getShoppingCartResponse.setId(item.getId());
        getShoppingCartResponse.setProductCategory(ProductCategory.valueOf(item.getProductCategory()));
        getShoppingCartResponse.setProductNameId(item.getId());
        getShoppingCartRequest.setProductDescription(item.getProductDescription());
        getShoppingCartResponse.setProductDescription(item.getProductDescription());
        return getShoppingCartResponse;

    }

    @Override
    public UpdateShoppingCartResponse updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest) {
            UpdateShoppingCartResponse updateShoppingCartResponse = new UpdateShoppingCartResponse();
            ShoppingCart shoppingCart = shoppingCartRepo.findShoppingCartById("id");
            Product product = products.findProductById("id");
            Item item = new Item();
            item.setProduct(product);
            item.setProduct(item.getProduct());
            item.setQuantityOfProduct(item.getQuantityOfProduct());
            shoppingCart.getItems().add(item);
            shoppingCartRepo.save(shoppingCart);
            updateShoppingCartResponse.setPrice(product.getPrice());
            updateShoppingCartResponse.setProductCategory(product.getProductCategory());
            updateShoppingCartResponse.setProductCategory(product.getProductCategory());
            return updateShoppingCartResponse;
        }

    }



