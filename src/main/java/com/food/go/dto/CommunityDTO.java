package com.food.go.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CommunityDTO {
    private String id;
    private String photo;
    private String title;
    private Date date;
    private String content;
    private int post_number;
}
