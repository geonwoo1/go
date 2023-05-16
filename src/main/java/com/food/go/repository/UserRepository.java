package com.food.go.repository;

import com.food.go.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {    //<사용할엔티티,pk데이터타입>

}
