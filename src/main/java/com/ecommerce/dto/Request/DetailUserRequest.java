package com.ecommerce.dto.Request;

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
    private String id;
    private LocalDate localDate;
    private String nameOnCard;
    private String cardCvv;
    private String cardType;
    private LocalDateTime cardExpirationYearAndMonth;
    private String cardName;
}
