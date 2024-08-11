package com.ecommerce.service;

import com.ecommerce.data.model.Address;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.UserAddressRequest;
import com.ecommerce.dto.Response.UserAddressResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AddressServicesImplTest {
    @Autowired
    private Users user;
    @Autowired
    private AddressServices addressServices;

    @Test
    public void CustomerAddress(){
        Address address = new Address();
        address.setHouseNumber("No 23");
        address.setCityName("Lagos");
        address.setStreet("ikoyi lagos ");
        address.setCountryName("Nigeria");
        address.setId("6");
        UserAddressRequest userAddressRequest = new UserAddressRequest();

        UserAddressResponse userAddressResponse =addressServices.customerAdress(userAddressRequest);
        assertThat(userAddressResponse).isNotNull();
    }

}
