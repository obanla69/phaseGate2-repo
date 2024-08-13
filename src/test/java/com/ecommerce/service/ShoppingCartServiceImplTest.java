package com.ecommerce.service;

import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.ShoppingCart;
import com.ecommerce.data.repository.ItemRepo;
import com.ecommerce.data.repository.Products;
import com.ecommerce.data.repository.ShoppingCartRepo;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.GetShoppingCartRequest;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.dto.Request.UserCartRequest;
import com.ecommerce.dto.Response.GetShoppingCartResponse;
import com.ecommerce.dto.Response.UserCartResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static com.ecommerce.data.Enums.ProductCategory.CLOTHING;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ShoppingCartServiceImplTest {
    @Autowired
    private ShoppingCartServices shoppingCartServices;
    @Autowired
    private ItemRepo itemRepo;
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    @Autowired
    private Products products;

    @Test
    public void ItemAddtoCart(){
       UserCartRequest userCartRequest =new UserCartRequest();
        AddProductRequest addProductRequest = new AddProductRequest();
       Product product = new Product();
        ItemRequest itemRequest = new ItemRequest();
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item= new Item();
       addProductRequest.setDescription("nice product");
       addProductRequest.setProductCategory(CLOTHING);
       addProductRequest.setProductName("cloth");
        addProductRequest.setPrice("6000");
        addProductRequest.setProductId("12");
        itemRequest.setQuantityProduct("60kg");
        itemRequest.setProduct(product);
       shoppingCartRepo.save(shoppingCart);
       UserCartResponse userCartResponse =shoppingCartServices.itemAddedToCart(userCartRequest);
     assertThat(userCartResponse).isNotNull();

    }


}
