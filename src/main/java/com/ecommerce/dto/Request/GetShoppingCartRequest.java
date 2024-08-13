package com.ecommerce.dto.Request;

import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetShoppingCartRequest {
    private String message;
    private String productNameId;
    private String price;
    private String productDescription;
    private ProductCategory productCategory;
}
