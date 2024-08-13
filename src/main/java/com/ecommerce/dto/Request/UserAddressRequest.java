package com.ecommerce.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressRequest {
    private String cityName;
    private String countryName;
    private String street;
    private String houseNumber;
}
