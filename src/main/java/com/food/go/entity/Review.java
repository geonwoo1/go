package com.food.go.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
@Getter
@NoArgsConstructor
public class Review {
    @Id
    private Integer num;
    private String id;
    private String location;
    private String restaurant_name;
    private String content;

    @Builder
    public Review(int num, String id, String location, String restaurant_name, String content){
        this.num=num;
        this.id=id;
        this.location=location;
        this.restaurant_name=restaurant_name;
        this.content=content;
    }
}
