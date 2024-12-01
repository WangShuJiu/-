package com.example.demo.restaurantmanagement.repository;

import com.example.demo.restaurantmanagement.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
    // 你可以添加自定义查询方法，Spring Data MongoDB 会自动提供实现
}
