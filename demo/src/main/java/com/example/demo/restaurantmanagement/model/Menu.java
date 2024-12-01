package com.example.demo.restaurantmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     // 菜单项的唯一标识
    private String name;   // 菜单项名称
    private double price;  // 菜单项价格

    // 无参构造方法（JPA 需要）
    public Menu() {
    }

    // 全参构造方法
    public Menu(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString 方法（可选，用于打印 Menu 对象）
    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
