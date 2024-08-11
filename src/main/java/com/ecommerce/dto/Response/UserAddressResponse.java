package com.ecommerce.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAddressResponse {
    private String cityName;
    private String countryName;
    private String houseNumber;
    private String street;
    private String id;
}
