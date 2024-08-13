package com.ecommerce.service;

import com.ecommerce.data.model.Product;
import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.UpdateProductRequest;
import com.ecommerce.dto.Response.AddProductResponse;
import com.ecommerce.dto.Response.UpdateProductResponse;
import com.ecommerce.dto.Response.UpdateShoppingCartResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.ecommerce.data.Enums.ProductCategory.ELECTRONICS;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProductServicesImplTest {
    @Autowired
    private ProductService productService;


    @Test
    public void addProduct(){

        AddProductRequest addProductRequest = new AddProductRequest();
        addProductRequest.setProductCategory(ELECTRONICS);
        addProductRequest.setProductName("yam");
        addProductRequest.setPrice("4500");
        addProductRequest.setDescription("very good");


        AddProductResponse addProductResponse=productService.addProduct(addProductRequest);
          assertThat(addProductResponse).isNotNull();

    }
    @Test
    public void updateProduct(){

        UpdateProductRequest updateProductRequest=new UpdateProductRequest();
        updateProductRequest.setProductName("honda");
        updateProductRequest.setPrice("9000");
        updateProductRequest.setId("66bb28580fb3b35964f3c6ab");

        UpdateProductResponse updateProductResponse=productService.updateProduct(updateProductRequest);
        assertThat(updateProductResponse).isNotNull();



    }

}
