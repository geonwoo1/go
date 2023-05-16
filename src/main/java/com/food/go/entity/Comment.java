package com.food.go.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
@Getter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num;
    private String likes;
    private Integer post_number;
    private String id;
    private Date date;
    private String comment;

    @Builder
    public Comment(int num, String likes, int post_number, String id, Date date, String comment){
        this.num =num;
        this.likes=likes;
        this.post_number=post_number;
        this.id=id;
        this.date=date;
        this.comment=comment;
    }
}
