package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {
    private String message;
    private String productNameId;
    private String price;
    private String productDescription;
    private ProductCategory productCategory;
}
