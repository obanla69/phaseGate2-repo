//package com.ecommerce.service;
//
//import com.ecommerce.data.model.Item;
//import com.ecommerce.data.model.PlaceOrder;
//import com.ecommerce.data.model.Product;
//import com.ecommerce.data.repository.ItemRepo;
//import com.ecommerce.data.repository.PlaceOrderRepo;
//import com.ecommerce.dto.Request.PlaceOrderRequest;
//import com.ecommerce.dto.Response.PlaceOrderResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//@Service
//public class PlaceOrderServiceImpl implements PlaceOrderServices{
//
//        @Autowired
//        private PlaceOrderServices placeOrderServices;
//    @Autowired
//    private PlaceOrderRepo placeOrderRepo;
//
//    @Override
//    public Item listOfCustomerOrder(PlaceOrderResponse placeOrderResponse) {
//        PlaceOrder placeOrder =new PlaceOrder();
//        PlaceOrderRequest placeOrderRequest=new PlaceOrderRequest();
//        Item item = new Item();
//        placeOrderRequest.setCreatedDate(placeOrderRequest.getCreatedDate());
//        placeOrderRequest.setTotalPrice(placeOrderRequest.getTotalPrice());
//        placeOrderRequest.setProduct(placeOrderRequest.getProduct());
//        placeOrderRequest.setUserId(placeOrderRequest.getUserId());
//        placeOrderRepo.save(placeOrder);
//
//        return placeOrderServices.listOfCustomerOrder(placeOrderResponse);
//     }
//}
//
