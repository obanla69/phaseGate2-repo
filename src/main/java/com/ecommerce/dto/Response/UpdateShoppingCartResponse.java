package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShoppingCartResponse {
    private String productId;
    private String Price;
    private String productName;
    private ProductCategory productCategory;
    private  String productDescription;
}
