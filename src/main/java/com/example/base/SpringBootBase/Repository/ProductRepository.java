package com.example.base.SpringBootBase.Repository;

import com.example.base.SpringBootBase.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
