package com.ecommerce.service;

import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.dto.Response.UserAddressResponse;

public interface AddressServices {
    UserAddressResponse customerAdress(UserAddressRequest userAddressRequest);


}
