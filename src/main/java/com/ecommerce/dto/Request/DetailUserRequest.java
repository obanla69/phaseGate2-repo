package com.ecommerce.dto.Request;

import com.ecommerce.data.Enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DetailUserRequest {

    private String creditCardNumber;
    private String cardCvv;
    private CardType cardType;
    private String cardName;
}
