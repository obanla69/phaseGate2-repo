package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.model.User;
import com.ecommerce.dto.Request.DeleteUserRequest;
import com.ecommerce.dto.Request.LoginRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserRequest;
import com.ecommerce.dto.Response.DeleteUserResponse;
import com.ecommerce.dto.Response.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    UserResponse signUP(UserRequest userRequest);
    DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest);
    UserResponse loginUser(LoginRequest loginRequest);
    User findUserByEmail(String email);
    List<User>getAllUser();
    List<Item> items();
    void deleteAllUsers();
    Optional<User> findUserById(String id);
    ShoppingCart getShoppingCart();

    ShoppingCart updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest);
}
