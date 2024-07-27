package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTOFromFE {

    private List<FoodItemsDTO> foodItemList;
    private Restaurant restaurant;
    private Integer userId;
    // we need to generate the orderId automatically and save it in the MongoDB.

}
