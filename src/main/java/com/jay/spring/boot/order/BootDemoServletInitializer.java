package com.jay.spring.boot.order;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * created by Jay on 2019/7/11
 */
public class BootDemoServletInitializer extends SpringBootServletInitializer
{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(SpringBootOuterTomcatApplication.class);
    }
}