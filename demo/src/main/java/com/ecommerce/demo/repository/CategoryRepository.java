package com.ecommerce.demo.repository;

import com.ecommerce.demo.model.Category;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryName);

}