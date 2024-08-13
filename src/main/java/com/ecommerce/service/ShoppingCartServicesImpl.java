package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.repository.Products;
import com.ecommerce.data.repository.ShoppingCartRepo;
import com.ecommerce.dto.Request.*;
import com.ecommerce.dto.Response.GetShoppingCartResponse;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
import com.ecommerce.dto.Response.UserCartResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class ShoppingCartServicesImpl implements ShoppingCartServices {


    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    @Autowired
    private Products products;


    @Override
    public UserCartResponse itemAddedToCart(UserCartRequest useCartRequest) {
        AddProductRequest addProductRequest = new AddProductRequest();
        ItemRequest itemRequest = new ItemRequest();
        ShoppingCart shoppingCart = new ShoppingCart();
        addProductRequest.setProductCategory(addProductRequest.getProductCategory());
        addProductRequest.setDescription(addProductRequest.getDescription());
        addProductRequest.setProductName(addProductRequest.getProductName());
        addProductRequest.setPrice(addProductRequest.getPrice());
        addProductRequest.setProductId(addProductRequest.getProductId());
        itemRequest.setProduct(itemRequest.getProduct());
        itemRequest.setQuantityProduct(itemRequest.getQuantityProduct());
        shoppingCart.setItems(useCartRequest.getItems());
        shoppingCartRepo.save(shoppingCart);

        UserCartResponse userCartResponse = new UserCartResponse();
        userCartResponse.setItems(useCartRequest.getItems());
        return userCartResponse;

    }
}
//    @Override
//    public GetShoppingCartResponse getShoppingCartToCart(GetShoppingCartRequest getShoppingCartRequest) {
//        ShoppingCart shoppingCart= shoppingCartRepo.findShoppingCartById("id");
//        Product product=products.findProductById("id");
//        Item item= new Item();
//
//        product.setPrice(item.getPrice());
//        product.setProductDescription(item.getProductDescription());
// //       product.setPrice(item.getPrice());
//        shoppingCart.getItems().add(item);
//        shoppingCartRepo.save(shoppingCart);
//        GetShoppingCartResponse getShoppingCartResponse=new GetShoppingCartResponse();
//        getShoppingCartResponse.setPrice(item.getPrice());
//        getShoppingCartResponse.setProductCategory(item.getProduct().getProductCategory());
//        getShoppingCartResponse.setProductDescription(item.getProductDescription());
//        return getShoppingCartResponse;

//    }

//    @Override
//    public UpdateShoppingCartResponse updateShoppingCart(UpdateShoppingCartRequest updateShoppingCartRequest) {
//        Product product = new Product();
//        ItemRequest itemRequest = new ItemRequest();
//        ShoppingCart shoppingCart = new ShoppingCart();
//        updateShoppingCartRequest.setProductCategory(updateShoppingCartRequest.getProductCategory());
//        updateShoppingCartRequest.setProductDescription(updateShoppingCartRequest.getProductDescription());
//        updateShoppingCartRequest.setProductName(updateShoppingCartRequest.getProductName());
//        updateShoppingCartRequest.setPrice(updateShoppingCartRequest.getPrice());
//        itemRequest.setProduct(itemRequest.getProduct());
//        itemRequest.setQuantityProduct(itemRequest.getQuantityProduct());
//        shoppingCart.setItems(new ArrayList<>());
//        shoppingCartRepo.save(shoppingCart);
//
//        UpdateShoppingCartResponse updateShoppingCartResponse = new UpdateShoppingCartResponse();
//        updateShoppingCartResponse.setPrice(updateShoppingCartResponse.getPrice());
//        return updateShoppingCartResponse;
//    }



