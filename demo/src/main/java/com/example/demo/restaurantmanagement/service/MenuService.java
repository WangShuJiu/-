package com.example.demo.restaurantmanagement.service;

import com.example.demo.restaurantmanagement.model.Menu;
import com.example.demo.restaurantmanagement.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    // 获取所有菜单
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    // 根据ID获取菜单
    public Optional<Menu> getMenuById(String id) {
        return menuRepository.findById(id);
    }

    // 添加新菜单
    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    // 删除菜单
    public void deleteMenu(String id) {
        menuRepository.deleteById(id);
    }
}
