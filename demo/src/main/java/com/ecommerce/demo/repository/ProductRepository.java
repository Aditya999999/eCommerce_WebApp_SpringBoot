package com.ecommerce.demo.repository;

import com.ecommerce.demo.model.Product;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface ProductRepository extends JpaRepository<Product, Integer> {

}