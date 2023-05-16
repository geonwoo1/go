package com.food.go.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "community")
@Getter
@NoArgsConstructor
public class Community {
    @Id
    private Integer post_number;
    private String id;
    private String photo;
    private String title;
    private Date date;
    private String content;


}
