package com.ecommerce.data.model;

import com.ecommerce.data.Enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class CreditCardInformation {
    private String id;
    private String cardCvv;
    private LocalDateTime cardExpirationYearAndMonth;
    private String creditCardNumber;
    private CardType cardType;
    private String cardName;
}
