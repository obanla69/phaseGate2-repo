package com.ecommerce.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document

public class Item {
    private String id;
    private String quantityOfProduct;
    private Product product;
    private String price;
    private String productName;
    private String productDescription;
    private String productCategory;

}
