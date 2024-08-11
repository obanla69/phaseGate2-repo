package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.repository.ItemRepo;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.dto.Response.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private Users users;
    @Autowired
    private ItemRepo itemRepo;
    @Override
    public ItemResponse addItem(ItemRequest itemRequest) {
        Item item = new Item();
        itemRequest.setProduct(itemRequest.getProduct());
        itemRequest.setId(itemRequest.getId());
        itemRequest.setQuantityProduct(itemRequest.getQuantityProduct());
        itemRepo.save(item);

        ItemResponse itemResponse = new ItemResponse();
        itemResponse.setId("56");

        return itemResponse;



    }
}
