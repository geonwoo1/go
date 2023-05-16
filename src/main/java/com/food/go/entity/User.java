package com.food.go.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {
    @Id
    private String id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String nickname;

    @Builder
    public User(String id, String username, String password, String nickname) {
        this.id =id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }


}
