package com.ecommerce.service;

import com.ecommerce.data.Enums.RolePosition;
import com.ecommerce.data.model.Item;
import com.ecommerce.data.model.Product;
import com.ecommerce.data.model.User;
import com.ecommerce.data.repository.ItemRepo;
import com.ecommerce.data.repository.Products;
import com.ecommerce.data.repository.Users;
import com.ecommerce.dto.Request.AddProductRequest;
import com.ecommerce.dto.Request.RemoveProductRequest;
import com.ecommerce.dto.Request.UpdateProductRequest;
import com.ecommerce.dto.Response.AddProductResponse;
import com.ecommerce.dto.Response.UpdateProductResponse;
import com.ecommerce.exception.CreditCardAlreadyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServicesImpl implements ProductService{
    @Autowired
    private  Products products;
    @Autowired
    private UserServices userServices;
    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private Users users;

    @Override
    public AddProductResponse addProduct(AddProductRequest addProductRequest) {
        User user = new User();
        Product product =new Product();
        authenticateUser(user.getId());
        product.setPrice(addProductRequest.getPrice());
        product.setProductName(addProductRequest.getProductName());
        product.setProductId(addProductRequest.getProductId());
        products.save(product);
        AddProductResponse addProductResponse=new AddProductResponse();
        addProductResponse.setMessage("product have been add");
        addProductResponse.setProductNameId(product.getProductId());
         return addProductResponse;
    }

    @Override
    public UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest) {
        UpdateProductResponse updateProductResponse = new UpdateProductResponse();
        Product product= products.findProductByProductId(updateProductRequest.getProductId());
        if(product.getProductId().equals(updateProductRequest.getProductId())){
            product.setProductId("true");
            products.save(product);
            updateProductResponse.setMessage("product updated");
            updateProductResponse.setProductId(updateProductResponse.getProductId());
        }else {
            throw new CreditCardAlreadyException("Already updated");
        }
            return updateProductResponse;
    }

    @Override
    public Product removeProduct(RemoveProductRequest removeProductRequest) {
        Product newProduct=products.findProductByProductId(removeProductRequest.getProductId());
        products.delete(newProduct);
        return newProduct;
    }

    private void authenticateUser(String id){
        Optional<User> user = userServices.findUserById(id);
        try {
            if (user.isPresent()){
                if (user.get().getRolePosition() == RolePosition.CUSTOMER) {
                    itemRepo.save(new Item());
                }
            }
        }catch (Exception e){
            throw new RuntimeException("User Does not Exist anymore");
        }
    }

}
