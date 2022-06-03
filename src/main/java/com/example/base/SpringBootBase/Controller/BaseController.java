package com.example.base.SpringBootBase.Controller;

import com.example.base.SpringBootBase.Util.CommonServices;
import com.example.base.SpringBootBase.Util.ServiceRegistry;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public abstract class BaseController {

    @Autowired
    private ServiceRegistry serviceRegistry;

    @Autowired
    private CommonServices commonServices;
}
