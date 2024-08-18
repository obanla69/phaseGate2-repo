package com.ecommerce.service;

import com.ecommerce.data.Enums.ProductCategory;
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
import com.ecommerce.exception.ProductAlreadyExit;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.ecommerce.data.Enums.ProductCategory.CLOTHING;

@Service
@AllArgsConstructor
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

        System.out.println(addProductRequest.getPrice());
        System.out.println(addProductRequest.getProductDescription());

        User user = new User();
        Product product =new Product();
        authenticateUser(user.getId());
        product.setPrice(addProductRequest.getPrice());
        product.setProductName(addProductRequest.getProductName());
        product.setProductCategory(addProductRequest.getProductCategory());
        product.setProductDescription(addProductRequest.getProductDescription());
        product = products.save(product);
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(product.getProductDescription());
        System.out.println(product.getProductName());

        AddProductResponse addProductResponse=new AddProductResponse();
        addProductResponse.setProductDescription(product.getProductDescription());
        addProductResponse.setProductCategory(product.getProductCategory());
        addProductResponse.setProductNameId(product.getId());
        addProductResponse.setPrice(product.getPrice());
        addProductResponse.setMessage("product have been add");

         return addProductResponse;
    }

    @Override
    public UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest) {
        Product product= products.findProductById(updateProductRequest.getId());
        if (product == null){
            throw new ProductAlreadyExit("product not found");
        }
        product.setProductName(updateProductRequest.getProductName());
        product.setPrice(updateProductRequest.getPrice());
         products.save(product);
        UpdateProductResponse updateProductResponse = new UpdateProductResponse();
        updateProductResponse.setProductName(product.getProductName());
        updateProductResponse.setPrice(product.getPrice());
        updateProductResponse.setId(product.getId());
        updateProductResponse.setMessage("product updated");
        return updateProductResponse;


    }

    @Override
    public Product removeProduct(RemoveProductRequest removeProductRequest) {
        Product newProduct=products.findProductById(removeProductRequest.getProductId());
        products.delete(newProduct);
        return newProduct;
    }

    private void authenticateUser(String id){
        Optional<User> user = userServices.findUserById(id);
        try {
            if (user.isPresent()){
                if (user.get().getRolePosition() == RolePosition.SELLER) {
                    itemRepo.save(new Item());
                }
            }
        }catch (Exception e){
            throw new RuntimeException("User Does not Exist anymore");
        }
    }

}
