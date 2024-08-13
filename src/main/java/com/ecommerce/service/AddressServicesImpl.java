package com.ecommerce.service;

import com.ecommerce.data.model.Address;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.Addresses;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.dto.Response.AddProductResponse;
import com.ecommerce.dto.Response.UserAddressResponse;
import com.ecommerce.dto.Response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServicesImpl implements AddressServices {
    @Autowired
    private Users users;
    @Autowired
    private Addresses addresses;

    @Override
    public UserAddressResponse customerAdress(UserAddressRequest userAddressRequest) {
        Address address= new Address();
        address.setHouseNumber(userAddressRequest.getHouseNumber());
        address.setCountryName(userAddressRequest.getCountryName());
        address.setStreet(userAddressRequest.getStreet());
        address.setCityName(userAddressRequest.getCityName());

        addresses.save(address);
       UserAddressResponse userAddressResponse = new UserAddressResponse();
       userAddressResponse.setCityName(address.getCityName());
        userAddressResponse.setCountryName(address.getCountryName());
        userAddressResponse.setHouseNumber(address.getHouseNumber());
        userAddressResponse.setStreet(address.getStreet());
        return userAddressResponse;
    }
}
