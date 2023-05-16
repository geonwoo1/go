package com.food.go.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestaurantsDTO {
    private String menu;
    private String description;
    private float rating;
    private String location;
    private String name;
}
