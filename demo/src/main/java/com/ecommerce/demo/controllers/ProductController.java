package com.ecommerce.demo.controllers;

import com.ecommerce.demo.common.ApiResponse;
import com.ecommerce.demo.dto.product.ProductDto;
import com.ecommerce.demo.model.Category;
import com.ecommerce.demo.service.CategoryService;
import com.ecommerce.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;


    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addProduct(@RequestBody ProductDto productDto) {
        Optional<Category> optionalCategory = categoryService.readCategory(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return new ResponseEntity<>(new ApiResponse(false, "category is invalid"), HttpStatus.CONFLICT);
        }
        Category category = optionalCategory.get();
        productService.addProduct(productDto, category);
        return new ResponseEntity<>(new ApiResponse(true, "Product has been added"), HttpStatus.CREATED);
    }

    // list all the products
    @GetMapping("/")
    public ResponseEntity<List<ProductDto>> getProducts() {
        List<ProductDto> productDtos = productService.listProducts();
        return new ResponseEntity<>(productDtos, HttpStatus.OK);
    }

    // update a product
    @PostMapping("/update/{productID}")
    public ResponseEntity<ApiResponse> updateProduct(@PathVariable("productID") Integer productID,
                                                     @RequestBody @Valid ProductDto productDto) {
        Optional<Category> optionalCategory = categoryService.readCategory(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category is invalid"), HttpStatus.CONFLICT);
        }
        Category category = optionalCategory.get();
        productService.updateProduct(productID, productDto, category);
        return new ResponseEntity<>(new ApiResponse(true, "Product has been updated"), HttpStatus.OK);
    }
}