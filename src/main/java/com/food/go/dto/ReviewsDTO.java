package com.food.go.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReviewsDTO {
    private String content;
    private String id;
    private String location;
    private String restaurant_name;
}
