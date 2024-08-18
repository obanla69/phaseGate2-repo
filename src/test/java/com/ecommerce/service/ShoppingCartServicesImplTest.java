package com.ecommerce.service;

import com.ecommerce.data.model.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShoppingCartServicesImplTest {

    @Autowired
    private ShoppingCartServicesImpl shoppingCartServices;

    @Test
    void viewShoppingCart() {
        ShoppingCart cart =shoppingCartServices.viewShoppingCart("66bb8c518e9ff33d9498b6a8");
        assertThat(cart.getItems().size()).isEqualTo(1L);
    }
}