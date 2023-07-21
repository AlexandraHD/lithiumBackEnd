package com.example.lithium.Repository;

import com.example.lithium.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface productRepo extends CrudRepository<Product, Integer>, JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
