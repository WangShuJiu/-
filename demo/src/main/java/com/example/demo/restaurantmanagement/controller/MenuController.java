package com.example.demo.restaurantmanagement.controller;

import com.example.demo.restaurantmanagement.model.Menu;
import com.example.demo.restaurantmanagement.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:8080")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // 获取所有菜单
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    // 根据菜单ID获取菜单
    @GetMapping("/{id}")
    public Optional<Menu> getMenuById(@PathVariable String id) {
        return menuService.getMenuById(id);
    }

    // 添加新菜单
    @PostMapping
    public Menu addMenu(@RequestBody Menu menu) {
        return menuService.addMenu(menu);
    }

    // 删除菜单
    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable String id) {
        menuService.deleteMenu(id);
    }
}
