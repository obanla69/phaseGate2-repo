package com.ecommerce.service;

import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
import com.ecommerce.dto.Response.UserCartResponse;

public interface ShoppingCartServices {
    UserCartResponse itemAddedToCart(UserCartRequest useCartRequest);
    UpdateShoppingCartResponse updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest);


}
