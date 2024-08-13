package com.ecommerce.service;

import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
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
        Product product=new Product();
         item.setProduct(itemRequest.getProduct());
        item.setId(itemRequest.getId());
        item.setQuantityOfProduct(itemRequest.getQuantityProduct());
        item.setProductName(itemRequest.getProductName());
        item.setPrice(itemRequest.getPrice());
        item.setProductDescription(itemRequest.getProductDescription());
        itemRepo.save(item);

        ItemResponse itemResponse = new ItemResponse();
        product.setPrice(item.getPrice());
        product.setProductDescription(item.getQuantityOfProduct());
        itemResponse.setId(item.getId());
        itemResponse.setQuantityOfProduct(item.getQuantityOfProduct());
        itemResponse.setPrice(item.getPrice());
        itemResponse.setProduct(item.getProduct());
        itemResponse.setProductName(item.getProductName());
        itemResponse.setProductDescription(item.getProductDescription());
        itemResponse.setPrice(item.getPrice());
        return itemResponse;



    }
}
