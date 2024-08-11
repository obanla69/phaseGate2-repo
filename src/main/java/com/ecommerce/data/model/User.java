package com.ecommerce.data.model;

import com.ecommerce.data.Enums.RolePosition;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
    private String id;
    private String age;
    private String email;
    private Address homeAddress;
    private String name;
    private String password;
    private String phoneNumber;
    private boolean isLogin;
    private RolePosition rolePosition;
}
