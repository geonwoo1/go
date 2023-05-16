package com.food.go.dao;

import com.food.go.entity.User;

public interface UserDAO {

    User joinUser(User user);
    User updateUser(String id,String password,User user);
    User getUser(String id);

}
