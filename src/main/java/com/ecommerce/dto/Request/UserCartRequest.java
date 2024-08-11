package com.ecommerce.dto.Request;

import com.ecommerce.data.model.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCartRequest {
    List<Item>items;
}
