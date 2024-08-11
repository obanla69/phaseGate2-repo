package com.ecommerce.dto.Response;

import com.ecommerce.data.model.CreditCardInformation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String id;
    private String receiverPhoneNumber;
    private String name;
    private CreditCardInformation creditCardInformation;
}
