package com.food.go.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CommentDTO {
    private int likes =0;
    private Date date;
    private String comment;
    private String id;
    private int post_number;
}
