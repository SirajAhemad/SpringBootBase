package com.example.base.SpringBootBase.Service;

import com.example.base.SpringBootBase.Model.Product;
import com.example.base.SpringBootBase.Pojo.ProductRequest;
import com.example.base.SpringBootBase.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product saveProduct(Product productRequest) {

        return productRepository.save(productRequest);
    }
}
