package com.ecommerce.dto.Request;

import com.ecommerce.data.Enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateShoppingCartRequest {
    private String id;
    private String Price;
    private String productName;
    private ProductCategory productCategory;
    private  String productDescription;
}
