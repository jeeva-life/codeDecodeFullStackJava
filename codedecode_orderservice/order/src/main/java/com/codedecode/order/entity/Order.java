package com.codedecode.order.entity;

import com.codedecode.order.dto.FoodItemsDTO;
import com.codedecode.order.dto.Restaurant;
import com.codedecode.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.net.UnknownServiceException;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

    public Order(Integer newOrderId, List<FoodItemsDTO> foodItemList, Restaurant restaurant) {
    }
}
