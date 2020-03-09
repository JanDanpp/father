package com.miu.web;

import com.miu.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WebTest {

    @RequestMapping("/showAll")
    public String showAll(){

        //创建Service对象
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService()+"我是web！";
    }
}
