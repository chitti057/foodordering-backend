package com.anurag.foodordering;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FoodRepository extends JpaRepository<FoodItem, Long> {}