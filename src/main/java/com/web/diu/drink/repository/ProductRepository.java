package com.web.diu.drink.repository;


import com.web.diu.drink.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
