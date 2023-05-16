package com.food.go.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurants")
@Getter
@NoArgsConstructor
public class Restaurant {
    @Id
    private String name;
    private String menu;
    private String description;
    private float rating;
    private String location;



    @Builder
    public Restaurant(String name, String menu, String description, float rating, String location ) {
        this.name =name;
        this.menu = menu;
        this.description = description;
        this.rating = rating;
        this.location=location;
    }
}
