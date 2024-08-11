package com.ecommerce.dto.Request;

import com.ecommerce.data.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlaceOrderRequest {
    private String userId;
    private Product product;
    private LocalDateTime createdDate;
    private String totalPrice;

}
