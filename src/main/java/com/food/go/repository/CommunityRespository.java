package com.food.go.repository;

import com.food.go.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRespository extends JpaRepository<Community,Integer> {
}
