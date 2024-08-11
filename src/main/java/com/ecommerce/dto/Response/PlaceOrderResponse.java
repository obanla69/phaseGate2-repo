package com.ecommerce.dto.Response;

import com.ecommerce.data.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceOrderResponse {
    private String userId;
    private Product product;
    private LocalDateTime createdDate;
    private String totalPrice;
}
