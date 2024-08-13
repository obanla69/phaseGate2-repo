package com.ecommerce.controller;

import com.ecommerce.dto.Request.GetShoppingCartRequest;
import com.ecommerce.dto.Request.ItemRequest;
import com.ecommerce.service.ItemService;
import com.ecommerce.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class ItemController {

    @Autowired
    public ItemServiceImpl itemService;

    @PostMapping("/addItem")
    public ResponseEntity<?>addItem(@RequestBody ItemRequest itemRequest){
        try{
            return new ResponseEntity<>(itemService.addItem(itemRequest),CREATED);
        }catch (Exception exception){
            return new ResponseEntity<>(exception.getMessage(),BAD_REQUEST);
        }
    }

}
