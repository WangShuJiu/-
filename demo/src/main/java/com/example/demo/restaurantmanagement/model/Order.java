package com.example.demo.restaurantmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "restaurant_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 订单的唯一标识
    private String customerName;  // 顾客姓名
    private String menuStatus;    // 菜单状态（可以是已下单、已完成等）

    // 无参构造方法（JPA 需要）
    public Order() {
    }

    // 全参构造方法
    public Order(Long id, String customerName, String menuStatus) {
        this.id = id;
        this.customerName = customerName;
        this.menuStatus = menuStatus;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }


    // toString 方法（可选）
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", menuStatus='" + menuStatus + '\'' +
                '}';
    }
}
