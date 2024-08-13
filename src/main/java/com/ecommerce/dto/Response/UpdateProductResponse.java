package com.ecommerce.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    private  String message;
    private String id;
    private String productName;
    private String price;
}
