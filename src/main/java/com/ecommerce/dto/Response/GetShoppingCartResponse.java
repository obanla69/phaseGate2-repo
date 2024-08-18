package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetShoppingCartResponse {
    private String message;
    private String productNameId;
    private String price;
    private String productDescription;
    private ProductCategory productCategory;
    private String id;
}
