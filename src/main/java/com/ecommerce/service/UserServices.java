package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.model.User;
import com.ecommerce.dto.Request.*;
import com.ecommerce.dto.Response.DeleteUserResponse;
import com.ecommerce.dto.Response.GetShoppingCartResponse;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
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
    GetShoppingCartResponse getShoppingCartToCart(GetShoppingCartRequest getShoppingCartResponse);


    UpdateShoppingCartResponse updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest);
}
