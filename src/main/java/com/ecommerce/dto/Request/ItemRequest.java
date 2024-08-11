package com.ecommerce.dto.Request;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.data.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequest {
    private String quantityProduct;
    private Product product;
    private String id;
    private String productId;
    private String productName;
    private String price;
    private String productDescription;
    private ProductCategory productCategory;


}
