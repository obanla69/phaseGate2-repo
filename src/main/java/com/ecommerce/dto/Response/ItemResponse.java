package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.CreditCardInformation;
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
public class ItemResponse {
    private String id;
    private String quantityOfProduct;
    private Product product;
    private String productName;
    private String price;
    private String productDescription;


}
