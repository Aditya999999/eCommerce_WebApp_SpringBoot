package com.ecommerce.demo.controllers;

import com.ecommerce.demo.model.Category;
import com.ecommerce.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/test")
    public Category getCategories() {

        Category cat =categoryService.listCategories().get(0);

        return cat;
    }
}
