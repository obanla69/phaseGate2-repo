package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.dto.Response.ItemResponse;

public interface ItemService {
    ItemResponse addItem(ItemRequest itemRequest);


}
