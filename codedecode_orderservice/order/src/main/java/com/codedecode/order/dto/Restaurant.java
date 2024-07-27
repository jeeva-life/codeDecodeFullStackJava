package com.codedecode.order.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// purpose of this package: DTOs that we gonna get from FRONT-END & USER-DETAIL microservice.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
