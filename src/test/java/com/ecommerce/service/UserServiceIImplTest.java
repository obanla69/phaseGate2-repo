package com.ecommerce.service;

import com.ecommerce.data.Enums.CardType;
import com.ecommerce.data.Enums.ProductCategory;
import com.ecommerce.data.model.*;
import com.ecommerce.data.repository.*;
import com.ecommerce.dto.Request.*;
import com.ecommerce.dto.Response.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.ecommerce.data.Enums.CardType.MASTERCARD;
import static com.ecommerce.data.Enums.ProductCategory.*;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class UserServiceIImplTest {
    @Autowired
   private  UserServices userServices;
    @Autowired
    private Users users;

    @Autowired
    private ShoppingCartServices shoppingCartServices;
    @Autowired
    private ShoppingCartRepo shoppingCartRepo;
    @Autowired
    private Products products;
    @Autowired
    private ItemRepo itemRepo;

    @BeforeEach
    void setUp(){
        userServices.deleteAllUsers();
    }

    @Test
    public void signUp(){
        UserRequest userRequest= new UserRequest();
        userRequest.setEmail("rebecca@gmail.com");
        userRequest.setPassword("2323");
        userRequest.setName("rebzy");
        userRequest.setPhoneNumber("080677623456");
        userRequest.setAge("27");

        UserResponse userResponse = userServices.signUP(userRequest);
        assertThat(userResponse).isNotNull();
        assertThat(userRequest.getEmail()).isEqualTo("rebecca@gmail.com");
    }
    @Test
    public void deleteUser(){
       UserRequest userRequest = new UserRequest();
        userRequest.setPassword("540078");
        userRequest.setPhoneNumber("username");
        userRequest.setAge("23");
        userRequest.setEmail("goodboy@gmail.com");
       userRequest.setName("username");

       UserResponse res = userServices.signUP(userRequest);
        DeleteUserRequest deleteUserRequest = new DeleteUserRequest();
        deleteUserRequest.setUserId(res.getId());
        DeleteUserResponse deleteUserResponse = userServices.deleteUser(deleteUserRequest);
      assertThat(deleteUserResponse.getMessage()).isEqualTo("User successfully Deleted");

    }
    @Test
    public  void loginUser(){
        UserRequest userRequest = new UserRequest();
        userRequest.setPassword("2323");
        userRequest.setPhoneNumber("08169822569");
        userRequest.setAge("27");
        userRequest.setEmail("rebecca@gmail.com");
        userRequest.setName("rebzy");
        userServices.signUP(userRequest);
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword("2323");
        loginRequest.setEmail("rebecca@gmail.com");
        UserResponse userResponse = userServices.loginUser(loginRequest);
        assertThat(userResponse).isNotNull();
        assertThat(loginRequest.getEmail()).isEqualTo("rebecca@gmail.com");

    }

        @Test
        public  void getShoppingCart(){
            UserCartRequest userCartRequest = new UserCartRequest();
            Product product = new Product();
           List<Item>items=new ArrayList<>();
            ShoppingCart shoppingCart = new ShoppingCart();
            Item item = new Item();
            product.setProductName("cloth");
            product.setProductDescription("nice one");
            product.setProductCategory(CLOTHING);
            product.setPrice("5000");
            item.setProduct(product);
            item.setQuantityOfProduct("1");
            items.add(item);
            shoppingCart.setItems(List.of(item));
            shoppingCartRepo.findShoppingCartById("id");
            products.findProductByProductId("id");
            shoppingCartRepo.save(shoppingCart);

            UserCartResponse userCartResponse=shoppingCartServices.itemAddedToCart(userCartRequest);
            assertThat(userCartResponse).isNotNull();


    }
        @Test
            public void updateShoppingCart(){

            UserCartRequest userCartRequest = new UserCartRequest();
            Product product = new Product();
            List<Item>items=new ArrayList<>();
            ShoppingCart shoppingCart = new ShoppingCart();
            Item item = new Item();
            product.setProductName("wear");
            product.setProductDescription("nice one");
            product.setProductCategory(CLOTHING);
            product.setPrice("5000");
            item.setProduct(product);
            item.setQuantityOfProduct("1");
            items.add(item);
            shoppingCart.setItems(List.of(item));
            shoppingCartRepo.findShoppingCartById("id");
            products.findProductByProductId("id");
            shoppingCartRepo.save(shoppingCart);

            UserCartResponse userCartResponse=shoppingCartServices.itemAddedToCart(userCartRequest);
            assertThat(userCartResponse).isNotNull();
            UpdateShoppingCartRequest updateShoppingCartRequest=new UpdateShoppingCartRequest();
        product.setProductName("bottle");
        product.setPrice("900");
        product.setProductCategory(CLOTHING);
        item.setProduct(product);
        item.setQuantityOfProduct("1");

        items.add(item);
        shoppingCart.setItems(List.of(item));
        shoppingCartRepo.findShoppingCartById("id");
        products.findProductByProductId("id");
        shoppingCartRepo.save(shoppingCart);
            UpdateShoppingCartResponse updateShoppingCartResponse=shoppingCartServices.updateShoppingCart(updateShoppingCartRequest);
            assertThat(updateShoppingCartResponse).isNotNull();


        }

 }

