package com.ecommerce.service;

import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.repository.ShoppingCartRepo;
import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.dto.Request.UpdateShoppingCartRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
import com.ecommerce.dto.Response.UserCartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShoppingCartServicesImpl implements ShoppingCartServices{


    @Autowired
    private ShoppingCartRepo shoppingCartRepo;


    @Override
    public UserCartResponse itemAddedToCart(UserCartRequest useCartRequest) {
        AddProductRequest addProductRequest = new AddProductRequest();
        ItemRequest itemRequest = new ItemRequest();
        ShoppingCart shoppingCart = new ShoppingCart();
        addProductRequest.setProductCategory(addProductRequest.getProductCategory());
        addProductRequest.setProductDescription(addProductRequest.getProductDescription());
        addProductRequest.setProductName(addProductRequest.getProductName());
        addProductRequest.setPrice(addProductRequest.getPrice());
        addProductRequest.setProductId(addProductRequest.getProductId());
        itemRequest.setProduct(itemRequest.getProduct());
        itemRequest.setQuantityProduct(itemRequest.getQuantityProduct());
        shoppingCart.setItems(useCartRequest.getItems());
        shoppingCartRepo.save(shoppingCart);

        UserCartResponse userCartResponse = new UserCartResponse();

        return userCartResponse;

    }
    @Override
    public UpdateShoppingCartResponse updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest){
        Product product = new Product();
        ItemRequest itemRequest=new ItemRequest();
        ShoppingCart shoppingCart=new ShoppingCart();
        updateShoppingCartRequest.setProductCategory(updateShoppingCartRequest.getProductCategory());
        updateShoppingCartRequest.setProductDescription(updateShoppingCartRequest.getProductDescription());
        updateShoppingCartRequest.setProductName(updateShoppingCartRequest.getProductName());
        updateShoppingCartRequest.setPrice(updateShoppingCartRequest.getPrice());
        itemRequest.setProduct(itemRequest.getProduct());
        itemRequest.setQuantityProduct(itemRequest.getQuantityProduct());
        shoppingCart.setItems(new ArrayList<>());
        shoppingCartRepo.save(shoppingCart);

        UpdateShoppingCartResponse updateShoppingCartResponse=new UpdateShoppingCartResponse();
        return updateShoppingCartResponse;
    }

}
