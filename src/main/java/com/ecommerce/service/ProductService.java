package com.ecommerce.service;

import com.ecommerce.data.model.Product;
import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.RemoveProductRequest;
import com.ecommerce.dto.Request.UpdateProductRequest;
import com.ecommerce.dto.Response.AddProductResponse;
import com.ecommerce.dto.Response.UpdateProductResponse;

public interface ProductService {
    AddProductResponse addProduct(AddProductRequest addProductRequest);
    UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest);
    Product removeProduct(RemoveProductRequest removeProductRequest);
}
