package com.example.demo.restaurantmanagement.service;

import com.example.demo.restaurantmanagement.model.Order;
import com.example.demo.restaurantmanagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // 获取所有订单
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // 根据ID获取订单
    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    // 创建新订单
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    // 删除订单
    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }
}
