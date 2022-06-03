package com.example.base.SpringBootBase.Service;

import com.example.base.SpringBootBase.Model.Product;
import com.example.base.SpringBootBase.Pojo.ProductRequest;

public interface ProductService {

    Product saveProduct(Product productRequest);

}
