package com.ecommerce.service;

import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.UpdateProductRequest;
import com.ecommerce.dto.Response.AddProductResponse;
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
        addProductRequest.setProductName("bread");
        addProductRequest.setPrice("4500");
        addProductRequest.setProductId("78");
        addProductRequest.setProductCategory(ELECTRONICS);
        addProductRequest.setProductDescription("very good");
        AddProductResponse addProductResponse=productService.addProduct(addProductRequest);
          assertThat(addProductResponse).isNotNull();
          assertThat(addProductRequest.getProductId()).isEqualTo("78");
    }
    @Test
    public void updateProduct(){
        UpdateProductRequest updateProductRequest=new UpdateProductRequest();
        updateProductRequest.setPrice("4500");
        updateProductRequest.setProductName("brandy");
        updateProductRequest.setProductId("78");

       assertThat(updateProductRequest.getPrice()).contains("4500");

    }

}
