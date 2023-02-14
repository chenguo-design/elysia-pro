package com.cg.elysia.orm.origin.dao.conn;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:/config/db.properties")
@ConfigurationProperties(prefix = "elysia.mysql")
@Data
public class ConnectionConfig {
    private String driver;

    private String url;

    private String username;

    private String password;
}
