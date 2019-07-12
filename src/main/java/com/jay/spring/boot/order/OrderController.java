package com.jay.spring.boot.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Jay on 2019/7/11
 */
@RestController
public class OrderController
{
    @GetMapping("/order/1")
    public String get()
    {
        System.out.println("requesting order ==get method");
        return "{\"id\": 1," + "\"name\": \"iPhone\"," + "\"price\": 8888" + "}";
    }
}
