package com.ecommerce.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String id;
    private String age;
    private String email;
    private String homeAddress;
    private String name;
    private String password;
    private String phoneNumber;
    private boolean isLogin;

    }

