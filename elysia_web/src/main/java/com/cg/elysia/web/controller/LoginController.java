package com.cg.elysia.web.controller;

//import com.cg.elysia.common.dto.UserDTO;
//import com.cg.elysia.common.util.YamlPropertySourceFactory;
//import com.cg.elysia.service.account.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
//@PropertySource(value = "classpath:config/db.properties")
//@PropertySource(value = "classpath:config/secret.properties")
public class LoginController {

//    @Value("${elysia.mysql.driver}")
//    private String driver;


//    @Resource
//    private ConfigProperties configProperties;

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value={"/",""})
    public String login(){
            return "index";
    }
}
