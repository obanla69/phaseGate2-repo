package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.dto.Response.PlaceOrderResponse;

public interface PlaceOrderServices {
    Item listOfCustomerOrder (PlaceOrderResponse placeOrderResponse);
}
