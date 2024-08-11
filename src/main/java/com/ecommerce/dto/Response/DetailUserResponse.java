package com.ecommerce.dto.Response;

import com.ecommerce.data.Enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailUserResponse {
    private String id;
    private String cardCvv;
    private LocalDateTime cardExpirationYearAndMonth;
    private String creditCardNumber;
    private CardType cardType;
    private String cardName;
}
