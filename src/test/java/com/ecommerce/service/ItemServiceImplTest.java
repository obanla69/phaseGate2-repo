package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.ItemRepo;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.dto.Response.ItemResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.ecommerce.data.Enums.ProductCategory.CLOTHING;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ItemServiceImplTest {
    @Autowired
    private ItemService itemService;
    @Autowired
    private Users users;
    @Autowired
    private ProductService productService;
    @Autowired
    private  ItemRepo itemRepo;


    @Test
    public void addItem(){
        ItemRequest itemRequest = new ItemRequest();
        Product product = new Product();
        product.setProductId("12");
        product.setProductName("cloth");
        product.setProductDescription("nice cloth");
        product.setProductCategory(CLOTHING);
        itemRequest.setQuantityProduct("43kg");
        itemRequest.setId("12");
        itemRequest.setProduct(product);
        ItemResponse itemResponse = itemService.addItem(itemRequest);

        assertThat(itemResponse).isNotNull();

    }
}
