package com.cg.elysia.web.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ConfigurationProperties(prefix = "chenguo.study")
@PropertySource(value = "classpath:config/secret.properties")

public class ConfigProperties {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }
}
