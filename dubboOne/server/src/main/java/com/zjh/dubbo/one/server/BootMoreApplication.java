package com.zjh.dubbo.one.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @PackageName: com.zjh.dubbo.one.server
 * @ClassName:   BootMoreApplication
 * @Date:        2019/6/27 22:22
 *         
 * @Author: Jiahui Zou
 * @Description: TODO
 **/
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml"})
@MapperScan(basePackages = "com.zjh.dubbo.one.model.mapper")
public class BootMoreApplication extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(BootMoreApplication.class);

    }

    public static void  main(String[] args){
        SpringApplication.run(BootMoreApplication.class,args);
    }
}
