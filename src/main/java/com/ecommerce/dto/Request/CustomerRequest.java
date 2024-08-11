package com.ecommerce.dto.Request;

import com.ecommerce.data.model.CreditCardInformation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private String id;
    private String receiverPhone;
    private String name;
    private CreditCardInformation creditCardInformation;
}
