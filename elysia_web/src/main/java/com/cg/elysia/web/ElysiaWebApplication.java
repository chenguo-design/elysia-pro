package com.cg.elysia.web;

//import com.cg.elysia.web.controller.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;
//import org.springframework.context.annotation.ImportResource;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableConfigurationProperties
//@ConfigurationPropertiesScan
//@EnableJpaRepositories(basePackages = "com.cg.elysia.orm")1
//@EntityScan(value = "com.cg.elysia.common")1
//@ComponentScans({1
//        @ComponentScan(basePackages = {"com.cg.elysia.service"}),
//        @ComponentScan(basePackages = {"com.cg.elysia.orm"})
//})
public class ElysiaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElysiaWebApplication.class, args);
    }

}
