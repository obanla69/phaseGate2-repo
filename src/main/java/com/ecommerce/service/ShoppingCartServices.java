package com.ecommerce.service;

import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.dto.Request.GetShoppingCartRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.dto.Response.GetShoppingCartResponse;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
import com.ecommerce.dto.Response.UserCartResponse;

public interface ShoppingCartServices {
    UserCartResponse itemAddedToCart(UserCartRequest useCartRequest);
    ShoppingCart viewShoppingCart(String id);
}
