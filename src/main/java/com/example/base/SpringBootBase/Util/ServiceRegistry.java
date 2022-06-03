package com.example.base.SpringBootBase.Util;

import com.example.base.SpringBootBase.Service.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ServiceRegistry {


    @Autowired
    ProductService productService;

}
