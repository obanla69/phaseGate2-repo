package com.ecommerce.data.model;

import com.ecommerce.data.Enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    private String productId;
    private String productName;
    private String price;
    private String productDescription;
    private ProductCategory productCategory;
}
