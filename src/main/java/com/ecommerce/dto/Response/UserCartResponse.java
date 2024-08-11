package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.CreditCardInformation;
import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class UserCartResponse {
    private String id;
    private List<Item>items;
}
