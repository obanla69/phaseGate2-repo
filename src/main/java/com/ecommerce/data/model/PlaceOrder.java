package com.ecommerce.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PlaceOrder {
    private String userId;
    private Product product;
    private LocalDateTime createdDate;
    private String totalPrice;
}
